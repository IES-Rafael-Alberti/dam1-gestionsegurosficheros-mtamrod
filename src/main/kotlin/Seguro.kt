package main.kotlin

abstract class Seguro(val numPoliza: Int, val dniTitular: String, private val importe: Double) {
    abstract fun calcularImporteAnioSiguiente(interes: Double): Double
    abstract fun tipoSeguro(): String
    abstract fun serializar(): String //Convierte el objeto a formato TXT

    protected fun generarId(): Int {
        TODO("Not yet Implemented")
    }

    protected fun obtenerImporte(): Double {
        return importe
    }

    companion object {
        fun validarDni(dni: String): Boolean {
            return dni.matches(Regex("^[0-9]{8}[A-Z]$"))
        }


    }
}