package Proyecto


// agregar una funcion para el cambio y acceso de informacion
// Agregar una funcion para cuando no esten iniciadso cancele o nos lo deje acceder


 open class Usuarios (val name:String, val apellido:String, var edad: Int, var email:String, var clave:String) :int_usuario {

     private lateinit var usuario: Persona
     lateinit var banca: OperacionesBancarias
     lateinit var cuenta: Cuenta
     override var isLogIn: Boolean = false
     val sexo: String = ""


    //Impresión cuando se use el primer
     // hacer un generador de id
    init {
        println(
            "Creaste tu usuario con siguientes datos nombre:$name , apellido $apellido, " +
                    "edad: $edad, email:$email, constraseña:$clave con la excepción de tu id")
    }

    constructor(name: String, apellido: String, edad: Int, email: String, clave: String, id: Int) :
            this(name, apellido, edad, email, clave) {
        println(
            "Tu usuario fue creado con los siguientes datos nombre:$name , apellido $apellido," +
                    "edad: $edad, email:$email, constraseña:$clave con el id de $id")
    }

    // Base de datos de los usuarios
    private var usuarios = mutableListOf<Persona>(
        Persona("Luis Adrian", "Bustamante", 21, "adrian@hotmail",
            "123ABC",),
        Persona("Daniel", "Diego", 21,  "daniel@hotmail",
            "456DEF"),
        Persona("Jose", "Cuenca", 21,  "jose@hotmail",
            "789GHI",),
        Persona("Josue", "Alejandro", 21,  "josue@hotmail",
            "101112JKL", )
    )


    fun logIn(email: String, contrasena: String) {
        var resp = Texto.texto.getTexto("logInError")
        for (usuario in usuarios) {
            if (usuario.email == email && usuario.contrasena == contrasena) {
                resp = Texto.texto.getTexto("logInOk")
                // Se inicializan las variables
                this.isLogIn = true
                this.usuario = usuario
                this.banca = OperacionesBancarias()
                this.cuenta = Cuenta()
                break
            }
        }
        return println(resp)
    }

     // Funcion para cerrar sesion
     override fun cerrar_sesion() {
         super.cerrar_sesion()
     }

     // Funcion para verficar si hay sesiones iniciadas en otros dispositivos
    override fun verificador_iniciosesion() {
        super.verificador_iniciosesion()
    }

}