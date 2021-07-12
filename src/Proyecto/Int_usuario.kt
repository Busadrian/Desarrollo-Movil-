package Proyecto

// Interface para la clase usuario donde le damos sus metodos basicos y obligatorios

interface int_usuario {

    var isLogIn: Boolean

    // Funcion para verficar  si ya hay una cuenta con el correo
    fun corre_usado() {
    }

    //Funcion para que las personas que ya tengan una cuenta puedan ver su informacion completa
    fun mi_informacion() {
    }


    fun cerrar_sesion(){
        print(Texto.texto.getTexto("cerrarsesion"))
        var decision = readLine().toString().trim()
        println("Procesando la operación")

        Thread.sleep(2000)
        when (decision){
            "Si" ->  { println("Tu sesion se cerró ")
                isLogIn = false
            }
            "No" -> println("Su cuenta sigue abierta")
            else -> println("No se pudo cerrar sesion, para cerrar sesion ingrese: Cerrar sesion")
        }

    }

    fun verificador_iniciosesion(){
        if (this.isLogIn == false) println ("Tu sesion no esta iniciada")
        else if  (this.isLogIn == true) println("Tu sesion esta iniciada") }


}



