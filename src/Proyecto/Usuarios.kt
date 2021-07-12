package Proyecto

import com.google.gson.Gson
import com.google.gson.stream.JsonReader
import java.io.FileReader

open class Usuarios (val name:String, val apellido:String, var edad: Int, var email:String, var clave:String) :int_usuario {

     private var usuarios = cargarUsuarios()

    //Impresión cuando se use el primer constructor
    init {
        println(
            "Tu usuario fue creado con los siguientes datos nombre:$name , apellido $apellido, " +
                    "edad: $edad, email:$email, constraseña:$clave con la excepción de tu id")
        usuarios.add(Persona(name,apellido,edad,email,clave))
    }

    constructor(name: String, apellido: String, edad: Int, email: String, clave: String, id: Int) :
            this(name, apellido, edad, email, clave) {
        println(
            "Tu usuario fue creado con los siguientes datos nombre:$name , apellido $apellido," +
                    "edad: $edad, email:$email, constraseña:$clave con el id de $id")
        usuarios.add(Persona(name,apellido,edad,email,clave))
    }


    // Checar si es necesario el de persona por el constructor
    private lateinit var usuario: Persona
    lateinit var banca: OperacionesBancarias
    override var isLogin: Boolean = false
    var isLogIn = false
    val sexo: String = ""
    var membresia: String = "Free"

    fun logIn(email: String, contrasena: String): String? {
        var resp = Texto.texto.getTexto("logInError")
        for (usuario in usuarios) {
            if (usuario.email == email && usuario.contrasena == contrasena) {
                resp = Texto.texto.getTexto("logInOk")
                this.isLogIn = true
                this.usuario = usuario
                this.banca = OperacionesBancarias(this.usuario.email)
                break
            }
        }
        return resp
    }

    // Funcion para cerrar sesion
    override fun cerrar_sesion(value: String) {
        super.cerrar_sesion(value)
    }

    // Funcion para verficar si hay sesiones iniciadas en otros dispositivos
    override fun verificador_iniciosesion(value: Boolean) {
        super.verificador_iniciosesion(value)
    }

    companion object{
        fun cargarUsuarios(): MutableList<Persona>{
            // Base de datos de los usuarios
            var gson = Gson()
            var reader = JsonReader(FileReader("src/Proyecto/usuarios.json"))
            var data: Personas = gson.fromJson(reader, Personas::class.java)
            return data.personas
        }
    }

}