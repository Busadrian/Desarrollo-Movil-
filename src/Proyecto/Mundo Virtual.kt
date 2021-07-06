package Proyecto
fun main(){
    //Lectura del idioma del usuario en el dispositivo
    Texto.LNG = "es"

    //Imprimir Saludo
    println(Texto.texto.getTexto("saludo"))

    //Inicio de Sesión
    //Consultar Cuentas Precargadas en la Clase Usuarios
    var usuarios = Usuarios("Luis Adrian", "Bustamante", 21, "adrian@hotmail",
        "123ABC")
    var lectura = ""

    while(!usuarios.isLogIn && lectura != "<>"){
        println(Texto.texto.getTexto("logInInstruccion"))
        print(Texto.texto.getTexto("logInCorreo"))
        lectura = readLine().toString()
        if(isSalir(lectura)){
            break
        }
        var correo = lectura
        print(Texto.texto.getTexto("logInContrasena"))
        lectura = readLine().toString()
        if(isSalir(lectura)){
            break
        }
        var contrasena = lectura

        println(usuarios.logIn(correo,contrasena))
    }

    //Operaciones Bancarias
    lectura = ""
    if(usuarios.isLogIn){
        while(lectura != "<>"){
            println(Texto.texto.getTexto("menu"))
            lectura = readLine().toString()
            if(isSalir(lectura)){
                break
            }
            println(usuarios.banca.operacion(lectura))
        }
    }

    println(Texto.texto.getTexto("graciasSalida"))
}

fun isSalir(texto:String): Boolean{
    return texto == Texto.salida


}