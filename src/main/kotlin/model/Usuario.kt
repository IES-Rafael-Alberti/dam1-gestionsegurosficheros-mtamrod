package model

import main.kotlin.model.model.Perfil

class Usuario(val nombre: String, var clave: String, val perfil: Perfil): IExportable {

    companion object {
        fun crearUsuario(datos: List<String>): Usuario {
            return Usuario(nombre = datos[0], clave = datos[1], perfil = Perfil.getPerfil(datos[2]))
        }
    }

    fun verificarClave(claveEncriptada: String): Boolean {
        return claveEncriptada == clave //Comparación de igualdades entre clave encriptada y del usuario
    }

    fun cambiarClave(nuevaClaveEncriptada: String) {
        clave = nuevaClaveEncriptada
        TODO("Hay que verificar en la gestión la antigua clave antes de poder cambiarla a una nueva")
    }

    override fun serializar(): String {
        return "$nombre;$clave;$perfil"
    }
}