package Proyecto

//Subclase de las operaciones bancarias para los miembros silver
class OperacionesBancariasSilver : OperacionesBancarias {

    // Cosntructor de la clase OperacionesBancarias
    constructor(correo: String) : super(correo)

    //Funcion para hacer transferencia de dinero
    fun transferencia (monto:Double, cuentabancaria:String){
        if (monto >= fondos){
            fondos -= monto
            println("Tu transferencia a la cuenta $cuentabancaria de $monto fue exitosa, tu saldo restante es $fondos")}
        else { println("Tus saldo es insuficiente") } }




}