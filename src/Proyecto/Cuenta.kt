package Proyecto

// Acciones de las cuentas
open class Cuenta(var correo: String) {

    protected var fondos: Double = 0.0

    fun depositar(): String{
        print(Texto.texto.getTexto("bancaDeposito"))
        fondos += readLine().toString().toDouble()
        return Texto.texto.getTexto("bancaDepositoOk")!!
    }

    fun retirar(): String{
        print(Texto.texto.getTexto("bancaRetiro"))
        var monto = readLine().toString().toDouble()

        var resp = Texto.texto.getTexto("bancaRetiroError")!!
        if(monto <= fondos){
            fondos -= monto
            resp = Texto.texto.getTexto("bancaRetiroOk")!!
        }
        return resp
    }

    fun obtenerFondos(): String{
        println("Tus fondos son de $fondos")
        return Texto.texto.getTexto("bancaSaldo")!!.format(fondos)
    }

}