package Proyecto

// Interfaz para correr el codigo

fun main(){
    println(Texto.texto.getTexto("saludo"))

    Thread.sleep(3000)
    println("¿Quieres crear una cuenta?") // algo para los que ya tengan cuenta
    var input = readLine().toString().trim().toUpperCase()

// Bucle que simula el cierre e inico de la aplicacion cuando el usuario rechaza la pregunta
    when (input){

        "SI" ->{ Thread.sleep(2000)
            println("Ingresa la siguiente informacion: ")}

        "NO" ->  do {
            Thread.sleep(3000)
            println("Gracias por visitarnos, vuelve pronto\n")

            Thread.sleep(2000)
            println(Texto.texto.getTexto("saludo"))

            Thread.sleep(3000)
            println("¿Quieres crear una cuenta?")
            var input2 = readLine().toString().trim().toUpperCase()

        } while (input2 == "NO")

    }

    println("Ingresa tu nombre:")
    var nombre: String = readLine().toString().trim()

    // nombre aleatorio en caso de que no se introduzca el nombre
    if (nombre?.isEmpty()) {
        nombre = "Usuario ${(0..100).random()}"
    }


    println("Ingresa tu apellido: ")
    var apellido = readLine().toString().trim()

    // Apellido aleatorio en caso de que no se introduzca el nombre
    if (apellido?.isEmpty()) {
        apellido = "Apellido ${(0..100).random()}"
    }


    // Uso de la clase para crear al usuario
    var usuario  = Usuarios(nombre, apellido,  "adrian@hotmail", "123ABC")


    println("Ingresa tu correo para iniciar sesion: ")
    var input3 = readLine().toString()

    println("Ingresa tu contraseña: ")
    var input4 = readLine().toString()


    // El usuario hace inicio de sesion
    var login = usuario.logIn(input3, input4)


// Interfaz de opciones que puede hacer el usuario
    do{
        Thread.sleep(3000)
        println("\n¿Que tipo de accion quieres hacer con tu cuenta?.\n\n" +
                "Para salir del programa ingrese Salir \n\n" +
                "Acciones de Cuenta: \n" +
                "1- Conocer tu membresia  \n" +
                "2- Conocer los costos de las membresias\n" +
                "3- Suscribirte a la membresia Silver\n\n" +
                "Operaciones Bancarias: \n" +
                "4- Depositar\n" +
                "5- Retirar \n" +
                "6- Obtener Fondos \n" +
                "7- Transferir  \n\n" +
                "Configuracion: \n" +
                "8- Cerrar Sesion \n" +
                "9- Verficar si tu  sesion esta iniciada \n" +
                "10- Obtener tu informacion\n" +
                "11- Cambiar Nombre\n" +
                "12- Cambiar Apellido\n" )

        var input4 = readLine().toString().trim()

        when(input4){
            "1" -> usuario.cuenta.getmembresia()
            "2" -> usuario.cuenta.getcostomembresia()
            "3" -> usuario.cuenta.setMembresia()
            "4" -> usuario.banca.depositar()
            "5" -> usuario.banca.retirar()
            "6" -> usuario.banca.obtenerFondos()
            "7" -> usuario.banca.transferencia()
            "8" -> usuario.cerrar_sesion()
            "9" -> usuario.verificador_iniciosesion()
            "10" -> usuario.getInformacion()
            "11" -> usuario.setNombre()
            "12" -> usuario.setApellido()



            else -> println("Esa opcion no es valida ")

        }


    } while (input4 != "Salir")



} // main

