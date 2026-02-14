CREATE TABLE IF NOT EXISTS "ingredient" (
    id UUID PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(100) NOT NULL,

    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    deleted_at TIMESTAMP WITH TIME ZONE
);

/* 
    Um ingredient deve possui nome e category porque não faz o menor sentido
    cria-lo sem essa categorização de nome.
    #TODO: Talvez adicionar um update_at para incorporar a mudança de categoria.

    Todo Recipe está relacionado com um ingredient, mas nem todo ingredient a um recipe.
*/
