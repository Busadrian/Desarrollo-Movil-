package Adrian

class Usuario(val name:String, val apellido:String, var edad: Int, var email:String, var clave:String) : int_usuario {

    //variable disponible en el caso que el usario la quiera indicar
    val sexo: String = ""
    var membresia: String = "Free"
    override var ison: Boolean = false

    init {
        println(
            "Tu usuario fue creado con los siguientes datos nombre:$name , apellido $apellido, " +
                    "edad: $edad, email:$email, constraseña:$clave con la excepción de tu id"
        )
    }

    // Segundo constrcutor en el caso que el usiario no pona su ID
    // idea de dar un numero random
    constructor(name: String, apellido: String, edad: Int, email: String, clave: String, id: Int) :
            this(name, apellido, edad, email, clave) {
        println(
            "Tu usuario fue creado con los siguientes datos nombre:$name , apellido $apellido," +
                    "edad: $edad, email:$email, constraseña:$clave con el id de $id"
        )
    }


    // Falta agregar la clase persona*
    //Base de datos de los usuarios de la app
    //Diferencia Jose lo hizo con data class
    private var base_datos_usuarios = mutableListOf<Persona>(
        Persona(
            "Luis Adrian", "Bustamante", 21, "AdrianB", "adrian@hotmail",
            "123ABC",
        ),
        Persona(
            "Daniel", "Diego", 21, "DanielD", "daniel@hotmail",
            "456DEF",
        ),
        Persona(
            "Jose", "Cuenca", 21, "JoseC", "jose@hotmail",
            "789GHI",
        ),
        Persona(
            "Josue", "Alejandro", 21, "JosueA", "josue@hotmail",
            "101112JKL",
        )
    )

    /*fun logIn(email:String,contrasena:String): String{
        var resp = "El correo/contrasena no coinciden";
        for(usuario in base_datos_usuarios){
            if(usuario.email == email && usuario.contrasena == contrasena){
                resp = "LogIn Exitoso"
                /*this.usuario = usuario*/
                /*this.cuenta = Cuenta(this.usuario.email)*/
                break
            }
        }
        return resp
    }*/

    fun logIn(email: String, contrasena: String): String {
        var resp = "El correo/contrasena no coinciden";
        for (usuario in base_datos_usuarios) {
            if (usuario.email == email && usuario.contrasena == contrasena) {
                resp = "LogIn Exitoso"
                /*this.usuario = usuario*/
                /*this.cuenta = Cuenta(this.usuario.email)*/
                break
            }
        }
        return resp


    }



    override fun cerrar_sesion(value: String) {
        super.cerrar_sesion(value)
    }

    override fun verificador_iniciosesion(value: Boolean) {
        super.verificador_iniciosesion(value)
    }


    }












/*class Usuario {
    private var usuarios = mutableListOf<Persona>(
        Persona("José","jose@cuenca.com","123"),
        Persona("Luis Adrian","luis@bustamante.com","123"),
        Persona("Daniel Diego","daniel@diego.com","123"),
        Persona("Josue Alejandro","josue@alejandro.com","123"))

    private lateinit var usuario: Persona
    lateinit var cuenta: Cuenta

    // Funcion que verifica si el usuario tiene cuenta o n
    fun logIn(email:String,contrasena:String): String{
        var resp = "El correo/contrasena no coinciden";
        for(usuario in usuarios){
            if(usuario.email == email && usuario.contrasena == contrasena){
                resp = "LogIn Exitoso"
                this.usuario = usuario
                this.cuenta = Cuenta(this.usuario.email)
                break
            }
        }
        return resp
    }
}*/