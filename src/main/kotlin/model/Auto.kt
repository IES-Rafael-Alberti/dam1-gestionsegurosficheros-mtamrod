package model

import java.util.*

enum class Auto {
    COCHE, MOTO, CAMION;

    companion object {
        fun getAuto(valor: String): Auto {
            return when(valor.uppercase(Locale.getDefault())) {
                "CAMION" -> CAMION
                "MOTO" -> MOTO
                else -> COCHE
            }
        }
    }
}