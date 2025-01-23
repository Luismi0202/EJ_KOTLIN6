class Domicilio(
    var calle: String,
    var numero: Int
) {
    fun dirCompleta():String{
        return "$calle $numero"
    }
}