package S6

import S6.R2.Product

class SmartWatch : Product(0f,  "" ,  "") {
    // Duda sobre el constructor de arriba
    //pregunta sobre porque se hace como en el ejemplo

    val price = 0f
    val name = ""
    val sku = ""

    override fun getTotalPrice(quantity: Int): Float {
        return price * quantity
    }
}