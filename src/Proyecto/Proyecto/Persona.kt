package Proyecto


// Base de datos
data class Persona(val nombre:String,
                   val appelido: String,
                   var edad: Int ,
                   var email: String ,
                   var contrasena: String,) {
    companion object {
        var basedatos = mutableListOf<String>()
    }

    var basedatos = mutableListOf<String>()
}