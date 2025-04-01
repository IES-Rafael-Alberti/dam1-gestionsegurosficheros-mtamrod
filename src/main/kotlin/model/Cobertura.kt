package model

import java.util.*

enum class Cobertura(val desc: String) {
    TERCEROS("Terceros"),
    TERCEROS_AMPLIADO("Terceros +"),
    FRANQUICIA_200("Todo Riesgo con Franquicia de 200€"),
    FRANQUICIA_300("Todo Riesgo con Franquicia de 300€"),
    FRANQUICIA_400("Todo Riesgo con Franquicia de 400€"),
    FRANQUICIA_500("Todo Riesgo con Franquicia de 500€"),
    TODO_RIESGO("Todo Riesgo");

    companion object {
        fun getCobertura(valor: String): Cobertura {
            return when(valor.uppercase(Locale.getDefault())) {
                "TERCEROS_AMPLIADO" -> TERCEROS_AMPLIADO
                "FRANQUICIA_200" -> FRANQUICIA_200
                "FRANQUICIA_300" -> FRANQUICIA_300
                "FRANQUICIA_400" -> FRANQUICIA_400
                "FRANQUICIA_500" -> FRANQUICIA_500
                "TODO_RIESGO" -> TODO_RIESGO
                else -> TERCEROS
            }
        }
    }
}