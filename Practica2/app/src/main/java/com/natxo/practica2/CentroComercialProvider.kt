package com.natxo.practica2

import com.natxo.practica2.dataclass.CentroComercial

class CentroComercialProvider {
    companion object {
        val centroComercialList = listOf(
            CentroComercial(
                id = 0,
                tienda = "Mall del Sol",
                direccion = "Av. Joaquín J. Orrantia González, Guayaquil, Ecuador",
                numeroTiendas = 200,
                imagenPortada = "data:image/png;base64,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"
            ),
            CentroComercial(
                id = 1,
                tienda = "Centro Santa Fe",
                direccion = "Av. Vasco de Quiroga 3800, Ciudad de México, México",
                numeroTiendas = 500,
                imagenPortada = "https://centrosantafe.com.mx/wp-content/uploads/2020/09/centro-santa-fe.jpg"
            ),
            CentroComercial(
                id = 2,
                tienda = "Costanera Center",
                direccion = "Avenida Andrés Bello 2425, Santiago, Chile",
                numeroTiendas = 300,
                imagenPortada = "https://costaneracenter.cl/wp-content/uploads/2020/08/costanera-center.jpg"
            ),
            CentroComercial(
                id = 3,
                tienda = "Jockey Plaza",
                direccion = "Av. Javier Prado Este 4200, Lima, Perú",
                numeroTiendas = 400,
                imagenPortada = "https://jockeyplaza.com.pe/wp-content/uploads/2020/07/jockey-plaza.jpg"
            )
        )
    }
}
