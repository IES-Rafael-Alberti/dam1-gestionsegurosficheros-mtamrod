package model

class SeguroAuto(numPoliza: Int,
                 dniTitular: String,
                 importe: Double,
                 var descripcion: String,
                 val combustible: String,
                 val tipoAuto: Auto,
                 var tipoCobertura: String,
                 var asistenciaCarretera: Boolean,
                 var numPartes: Int): Seguro(numPoliza, dniTitular, importe) {

    override fun calcularImporteAnioSiguiente(interes: Double): Double {
        TODO("Not yet implemented")
    }

    override fun tipoSeguro(): String {
        TODO("Not yet implemented")
    }

    override fun serializar(): String {
        return "$numPoliza;$dniTitular;${obtenerImporte()};$descripcion;$combustible;$tipoAuto;$tipoCobertura;$asistenciaCarretera;$numPartes"

        //Ejemplo: 400001;98765432B;700.0;"Toyota Corolla Azul";Gasolina;Turismo;Todo Riesgo;true;1;SeguroAuto
    }
}