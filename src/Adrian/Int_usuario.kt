package Adrian

// Interface para la clase usuario donde le damos sus metodos basicos y obligatorios

interface int_usuario {

    var ison: Boolean

    fun tengo_cuenta() {
    }

    fun mi_informacion() {
    }

    // Ver como se puede añadir aqui
    /*fun login(){
    }*/

    fun cerrar_sesion(value:String){
        when (value){
            "Cerrar sesion" -> ison = false
            else -> println("No se pudo cerrar sesion, para cerrar sesion ingrese: Cerrar sesion")
        }

    }

    fun verificador_iniciosesion(value:Boolean){
        if (value == false) println ("Tu sesion no esta iniciada")
        else if  (value == true) println("Tu sesion esta iniciada") }


}



