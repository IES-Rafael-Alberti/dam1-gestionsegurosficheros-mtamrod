package model

class SeguroVida(numPoliza: Int,
                 dniTitular: String,
                 importe: Double,
                 val fechaNac: String,
                 var nivelRiesgo: Riesgo,
                 var indemnizacion: Double): Seguro(numPoliza, dniTitular, importe) {

    override fun calcularImporteAnioSiguiente(interes: Double): Double {
        TODO("Not yet implemented")
    }

    override fun tipoSeguro(): String {
        TODO("Not yet implemented")
    }

    override fun serializar(): String {
        return "$numPoliza;$dniTitular;${obtenerImporte()};$fechaNac;$nivelRiesgo;$indemnizacion"

        //Ejemplo: 800001;87654321C;300.0;1985-05-12;Medio;100000;SeguroVida
    }
}