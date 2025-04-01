package main.kotlin.model.model

import java.util.*

enum class Perfil {
    ADMIN, GESTION, CONSULTA;

    companion object {
        fun getPerfil(valor: String): Perfil {
            return when (valor.uppercase(Locale.getDefault())) {
                "ADMIN" -> ADMIN
                "GESTION" -> GESTION
                else -> CONSULTA
            }
        }
    }
}