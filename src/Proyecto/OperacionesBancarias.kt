package Proyecto

import java.util.Date
import java.text.SimpleDateFormat


// Operaciones bancarias que una cuenta free puede acceder

open class OperacionesBancarias {

    /*fun operacion(op: String): String {
        return when (op) {
            "1" -> obtenerFondos()
            "2" -> depositar()
            "3" -> retirar()
            else -> {
                Texto.texto.getTexto("bancaError")!!
            }
        }
    }*/

    companion object   {
        // Se hace el parametro publico para el companion
        var fondos: Double = 0.0
    }

    protected var fondos: Double = 0.0


    fun depositar() {
        print(Texto.texto.getTexto("bancaDeposito"))
        fondos += readLine().toString().toDouble()

        Thread.sleep(3000)
        return println(Texto.texto.getTexto("bancaDepositoOk")!!)
    }

    fun retirar(){
        print(Texto.texto.getTexto("bancaRetiro")) // espacio
        var monto = readLine().toString().toDouble()
        var cajero: Double = 0.0

        var resp = Texto.texto.getTexto("bancaRetiroError")!!
        if(monto <= fondos){
            fondos -= monto
            println("Comenzando la operacion")

            Thread.sleep(2000)
            println("Retirando dinero")

            while (cajero < monto ){
                println("Dinero Retirado $cajero")
                Thread.sleep(3000)
                cajero += monto / 4
            }
            println("Dinero retirado $cajero")

            resp = Texto.texto.getTexto("bancaRetiroOk")!!

        }
        return println(resp)
    }

    fun obtenerFondos() {
        println("Obteniendo tus fondos ")

        Thread.sleep(3000)
        return println(Texto.texto.getTexto("bancaSaldo")!!.format(fondos)) // no imprime el valor
    }


    fun transferencia ()  {


        print(Texto.texto.getTexto("transferencia"))
        var cantidad = readLine().toString().toDouble()


        Thread.sleep(2000)
        print(Texto.texto.getTexto("cuentabancaria"))
        var cuentabancaria = readLine().toString()

        if (cantidad <= fondos && Cuenta.membresia == "Silver"){
            fondos -= cantidad
            var cajero: Double = 0.0
            println("Comenzando la transferencia")
            while (cajero < cantidad ){
                Thread.sleep(2000)
                println("Dinero Transferido $cajero\n")
                    cajero += cantidad / 4
            }
            println("Tu transferencia de $cantidad pesos a la cuenta $cuentabancaria fue exitosa, tus fondos son $fondos") }

        else if (cantidad  <= fondos && Cuenta.membresia != "Silver") {
            println("Tu saldo es suficiente pero no tienes permiso de transferir por tu membresia")}

        else if (cantidad  > fondos && Cuenta.membresia == "Silver") {
            println("Tus saldo es insuficiente") }

        else if (cantidad > fondos && Cuenta.membresia != "Silver"){
            println("Tu saldo es insuficiente y no tienes acceso a esta operacion")
        }

    }



    }



