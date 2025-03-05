package com.natxo.practica2

import com.natxo.practica2.dataclass.Tienda

class TiendaProvider {
    companion object {
        val tiendaList = listOf(
            Tienda(
                tienda = "Mall del Sol",
                resumen = "Uno de los centros comerciales más grandes de Guayaquil, con más de 200 tiendas."
            ),
            Tienda(
                tienda = "Centro Santa Fe",
                resumen = "Ubicado en CDMX, es uno de los malls más grandes de América Latina."
            ),
            Tienda(
                tienda = "Costanera Center",
                resumen = "Centro comercial icónico de Santiago de Chile, con una gran variedad de tiendas y entretenimiento."
            ),
            Tienda(
                tienda = "Jockey Plaza",
                resumen = "Uno de los principales centros comerciales de Lima, con más de 400 tiendas y áreas de ocio."
            )
        )
    }
}
