package Api.GoDrinking.domain.value_objects

import Api.GoDrinking.domain.errors.UrlError
import arrow.core.Either
import arrow.core.left
import arrow.core.right

// criando uma function extension para retornar um boolean na validação
// utilizando a função nativa Url do Java 21.
fun String.isValidUrl(): Boolean{
    return try {
        java.net.URL(this)
        true
    } catch (exception: Exception) {
        false
    }
}

@JvmInline
value class Url private constructor(val value: String) {

    companion object {
        // Regex para validar URLs de imagem (Suporta HTTPS, caminhos e extensões comuns)
        private val imagePathRegex = Regex(
            "^(https?://)?([\\da-z.-]+)\\.([a-z.]{2,6})([/\\w .-]*)*/?.*\\.(jpg|jpeg|png|webp|gif|svg)$",
            RegexOption.IGNORE_CASE
        )

        fun create(input: String?): Either<UrlError, Url> {
            val cleaned = input?.trim().orEmpty()

            return when {
                cleaned.isEmpty() -> UrlError.Empty.left()
                cleaned.length > 2048 -> UrlError.TooLong.left()
                !cleaned.startsWith("https://") -> UrlError.InsecureProtocol.left()
                !imagePathRegex.matches(cleaned) -> UrlError.InvalidFormat.left()
                !cleaned.isValidUrl() -> UrlError.Malformed.left()
                else -> Url(cleaned).right()
            }
        }
    }
}

