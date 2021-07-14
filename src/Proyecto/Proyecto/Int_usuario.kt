package Proyecto

// Interface para la clase usuario donde le damos sus metodos basicos y obligatorios

interface int_usuario {

    // Varieble que te muestra si la sesion esta iniciada
    var isLogIn: Boolean


    // Funcion para hacer el cierre de sesion
    fun cerrar_sesion(){
        print(Texto.texto.getTexto("cerrarsesion"))
        var decision = readLine().toString().trim().toUpperCase()
        println("Procesando la operación")

        Thread.sleep(2000)
        when (decision){
            "SI" ->  { println("Tu sesion se cerró ")
                isLogIn = false
            }
            "NO" -> println("Su cuenta sigue abierta")
            else -> println("No se pudo cerrar sesion, para cerrar sesion ingrese: Cerrar sesion")
        }

    }

    // Funcion que verifica si la sesion esta iniciada
    fun verificador_iniciosesion(){
        if (this.isLogIn == false) println ("Tu sesion no esta iniciada")
        else if  (this.isLogIn == true) println("Tu sesion esta iniciada") }


}



