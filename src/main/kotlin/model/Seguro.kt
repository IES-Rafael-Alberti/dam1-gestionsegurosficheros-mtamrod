package model

abstract class Seguro(private val numPoliza: Int, private val dniTitular: String, protected val importe: Double):
    IExportable {
    abstract fun calcularImporteAnioSiguiente(interes: Double): Double
    abstract fun tipoSeguro(): String

    fun comprobarNumPoliza(numPoliza: Int): Boolean {
        return numPoliza == this.numPoliza
    }

    override fun serializar(): String {
        return "$numPoliza;$dniTitular;$importe"
    }

    override fun toString(): String {
        return "Seguro(numPoliza=$numPoliza, dniTitular=$dniTitular, importe=${String.format("%.2f", importe)})"
    }

    override fun hashCode(): Int {
        return numPoliza.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        TODO ("Ni idea")
    }
}