package Proyecto

class Texto: Idiomas {

    private var texto: MutableMap<String, MutableMap<String,String>> = mutableMapOf()

    init {
        loadTexto()
    }

    override fun loadTexto() {
        //Cargar textos en español
        texto["es"] = mutableMapOf(
            "saludo" to "!Bienvenidos a La Poderosisima App Fintech!",
            "logInInstruccion" to "Ingresa tu Correo y Contraseña. Para salir Ingresa: $salida",
            "logInCorreo" to "Correo: ",
            "logInContrasena" to "Contraseña: ",
            "logInError" to "El correo/contrasena no coinciden\n",
            "logInOk" to "¡Bienvenido! Disfruta de la App.\n",
            "graciasSalida" to "\n\nNos vemos pronto\n",
            "menu" to "Ingrese la operación que desea realizar:\n1.Consultar Saldo\n2.Depositar\n3.Retirar\nIngrese $salida para salir",
            "bancaError" to "¡Operación Incorrecta!\n",
            "bancaSaldo" to "\nTus fondos son %.2f pesos\n",
            "bancaDeposito" to "\n¿Cuánto Desea Depositar?\nMonto: ",
            "bancaDepositoOk" to "¡Deposito exitoso!\n",
            "bancaRetiroError" to "*****Fondos insuficientes*****",
            "bancaRetiroOk" to "Retiro exitoso\n",
            "bancaRetiro" to "¿Cuánto desea retirar?\nMonto: ",
            "quemembresia" to "De que membresia quieres conocer el precio? \n Membresia:",
            "ingresapago" to "Inserta tu pago de la membresia",
            "suscripción" to "¿Deseas suscribirte a la membresia Silver?\n",
            "transferencia" to "¿Cuanto quieres transferir? \n Cantidad:\n",
            "tipomembresia" to "¿Que tipo de memebresia tienes? \n Membresia:\n",
            "cuentabancaria" to "¿A que cuentabancaria quieres transferir? \n Cuentabancaria:\n",
            "cerrarsesion" to "¿Quiere cerrar su sesión?: "

        )
    }

    override fun getTexto(id: String): String? {
        //Verificar si el idioma está disponible, sino español por defecto
        if(LNG !in texto.keys){
            LNG = "es"
        }
        return texto[LNG]!![id]
    }

    companion object{
        var LNG = "es"
        val salida = "<>"
        var texto = Texto()
    }

}