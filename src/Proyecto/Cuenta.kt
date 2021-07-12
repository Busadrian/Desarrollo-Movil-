package Proyecto

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf

// Acciones de las cuentas
open class Cuenta {

    companion object {

    // la creacion de cuenta, la creacion de usuario ya esta pero tenemos que crear una cuenta ya
    // cuando el usuario exista
    var membresia: String = "Free"}


    fun getmembresia()  {
        return println("Tu membresia es $membresia")
    }

    fun getcostomembresia() {
        println("Actualmente tenemos solo la membresia Silver.")
        print(Texto.texto.getTexto("quemembresia"))
        var membresia  = readLine().toString().trim()
        when (membresia) {
            "Free" -> println("Esta membresia es gratis")
            "Silver" -> println("Tiene un precio de 1000")
            else -> println("No existe esa membresia")
        }

    }

    // quiero que el chequeo se haga sin verificar fondos y que le reste a fondos
    // Todavi se podria autmatizar mas
    fun setMembresia() {
        if (Cuenta.membresia == "Silver") println("Tu membresia ya es Silver")
        else if (Cuenta.membresia == "Free") {
            print(Texto.texto.getTexto("suscripción"))
            var decision = readLine().toString().trim()
            when(decision){
                "Si" -> {
                    println("Procesando tu pago")
                    Thread.sleep(2000)
                    if (OperacionesBancarias.fondos >= 1000 ) {
                        OperacionesBancarias.fondos -= 1000
                        membresia = "Silver"
                        println("Tu pago fue exitoso tu cuenta ahora es $membresia")}
                    else println("Tu transacción no se puede realizar por falta de fondos realiza un deposito")

                }
            }

        }



    }

}

