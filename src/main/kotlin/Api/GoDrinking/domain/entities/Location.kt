package Api.GoDrinking.domain.entities

import Api.GoDrinking.domain.value_objects.Address
import Api.GoDrinking.domain.value_objects.Name

import java.util.UUID

data class Location (
    val id: UUID,
    val name: Name,
    val address: Address,
    val coordinate: Coordinate?
)