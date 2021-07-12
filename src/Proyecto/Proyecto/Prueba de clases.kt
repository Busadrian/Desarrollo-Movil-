package Proyecto

fun main(){
    println("Gracias por entrar a nuestra aplicación")
    println("¿Quieres crear una cuenta?") // algo para los que ya tengan cuenta
    var input = readLine().toString().trim().toUpperCase()


    when (input){ // agrear otro valot que si no se cumple se repite y poder inresar a su cuenta ya creada y un else
        "SI" -> println("Ingresa la siguiente informacion: ")// opcion id
        "NO" ->  do {                                        // Hacer algo para  cuando no se ingresa el valor
            println("Gracias por visitarnos, vuelve pronto\n")

            Thread.sleep(3000)
            println("Gracias por entrar a nuestra aplicación")
            println("¿Quieres crear una cuenta?")
            var input2 = readLine().toString().trim().toUpperCase()

        } while (input2 == "NO")

    }
    // todavia no checa los valores por la base de datos,
    println("Ingresa tu nombre:")
    var nombre: String? = readLine().toString().trim()

    // nombre en caso de que el valor ingresado es null (no funciona aun)
    val nombre2 = nombre ?: "Usuario ${(0..100).random()}"

    println("Ingresa tu apellido: ")
    val apellido = readLine().toString().trim()
    println("Ingresa tu edad: ")
    var edad = readLine()!!.toInt() // agrrar el try and catch
    println("Ingresa tu email: ")
    var email = readLine().toString().trim()
    println("Ingresa tu clave: ")
    var clave = readLine().toString().trim()
    //println("Ingresa tu Id (opcional): ") // Como hacerlo opcional
    //var Id = readLine()!!.toInt()


    // Informacion que inres a la base de datos
    var usuario  = Usuarios(nombre2, apellido, edad, email, clave)
    // Persona.basedatos.add(nombre)

    println("Ingresa tu correo para iniciar sesion: ") // Agregar algo si la constraseña esta bien
    var input3 = readLine().toString()

    println("Ingresa tu contraseña: ")
    var input4 = readLine().toString()

    usuario.logIn(input3, input4) // opcion por si lo da erroneo



    do{
        Thread.sleep(3000)
        println("\n¿Que tipo de accion quieres hacer con tu cuenta?.\n\n" +
                "Al introducir una opcion distinta se cierra el programa \n\n" +
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
                "9- Verficar si tu  sesion esta iniciada \n" )
        var input4 = readLine().toString().trim()

        when(input4){
            "1" -> usuario.cuenta.getmembresia()
            "2" -> usuario.cuenta.getcostomembresia()
            "3" -> usuario.cuenta.setMembresia()
            "4" -> usuario.banca.depositar()
            "5" -> usuario.banca.retirar()
            "6" -> usuario.banca.obtenerFondos()
            "7" -> usuario.banca.transferencia()
            "8" -> usuario.cerrar_sesion() // cuando se cierre la sesion que se acabe el codigo poner una funcion que solo permita si la sesion esta on
            "9" -> usuario.verificador_iniciosesion()

        }


    } while (input4 != "Salir")



} // main

