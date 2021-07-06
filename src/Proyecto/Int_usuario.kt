package Proyecto

// Interface para la clase usuario donde le damos sus metodos basicos y obligatorios

interface int_usuario {

    var isLogin: Boolean

    // Funcion para verficar  si ya hay una cuenta con el correo
    fun corre_usado() {
    }

    //Funcion para que las personas que ya tengan una cuenta puedan ver su informacion completa
    fun mi_informacion() {
    }


    fun cerrar_sesion(value:String){
        when (value){
            "Cerrar sesion" -> isLogin = false
            else -> println("No se pudo cerrar sesion, para cerrar sesion ingrese: Cerrar sesion")
        }

    }

    fun verificador_iniciosesion(value:Boolean){
        if (value == false) println ("Tu sesion no esta iniciada")
        else if  (value == true) println("Tu sesion esta iniciada") }

    // Funcione de estado de la cuenta y funcion de metodo para pagar la suscripcion

}



