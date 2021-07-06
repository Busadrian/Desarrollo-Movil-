package S5

fun main (){
    fun total (cupon:String, precio:Int, operacion: (String,Int) -> Unit):Unit  {

        /*println ("Lo que tienes que pagar es $operacion")*/
        return operacion(cupon,precio)
    }

    fun cantidad (cupon:String, precio:Int){
        when(cupon){
            "NOIVA" -> precio
            "HALFIVA" -> precio * 0.08
            "MINUS100" -> precio - 100
            "PROMO2020" ->
                if (precio <= 1000)
                { precio *.14 }
            else if (precio > 1000 && precio <=2000)
            {precio * 0.04}
            else if (precio > 2000 && precio <= 4000)
            {(precio *.16) / 2 }
            else if (precio > 4000)
            { precio / 3}


            }
    }
    var compra = total("PROMO2020", 20,  :: cantidad)
    println(compra)

}