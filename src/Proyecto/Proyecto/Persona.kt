package Proyecto


// Base de datos
data class Persona(val nombre:String,
                   var apellido: String,
                   var email: String ,
                   var contrasena: String,) {
    companion object {
        var basedatos = listOf<String>()
    }

    var basedatos = listOf<String>()
}