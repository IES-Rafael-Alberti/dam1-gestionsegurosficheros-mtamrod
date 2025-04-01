package model

class SeguroHogar(numPoliza: Int,
                  dniTitular: String,
                  importe: Double,
                  val metrosCuadrados: Int,
                  val valorContenido: Double,
                  val direccion: String) : Seguro(numPoliza, dniTitular, importe) {

    override fun calcularImporteAnioSiguiente(interes: Double): Double {
        TODO("Not yet implemented")
    }

    override fun tipoSeguro(): String {
        TODO("Not yet implemented")
    }

    override fun serializar(): String {
        return "$numPoliza;$dniTitular;${obtenerImporte()};$metrosCuadrados;$valorContenido;$direccion"

        //Ejemplo: 100001;12345678A;500.0;80;150000;Calle Mayor, 12;SeguroHogar
    }

}