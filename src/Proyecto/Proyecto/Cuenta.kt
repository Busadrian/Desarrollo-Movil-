package Proyecto

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf


open class Cuenta {

    companion object tarjeta{

    var membresia: String = "Free"}


    fun getmembresia()  {
        return println("Tu membresia es $membresia")
    }

    // Imprimrir el costo que tiene cada memebresia
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

    // Cambio de Membresia
    fun setMembresia() {
        println("Iniciando proceso para de suscipcion")
        Thread.sleep(3000)

        print(Texto.texto.getTexto("suscripción"))
        var decision = readLine().toString().trim()
        when(decision){
                "Si" -> {
                    Thread.sleep(2000)
                    print("Ingresa tu pago: ")
                    var pago = readLine()!!.toInt()

                    Thread.sleep(2000)
                    println("Procesando tu pago")
                    Thread.sleep(2000)
                    if (pago >= 1000 ) {
                        membresia = "Silver"
                        println("Tu pago fue exitoso tu cuenta ahora es $membresia")}
                    else println("Tu transacción no se puede realizar por falta de fondos realiza un deposito")

                }
            }

        }



    }



