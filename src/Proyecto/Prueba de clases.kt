package Proyecto

fun main(){
    var adrian = UsuariosSilver("Luis Adrian", "Bustamante", 21, "adrian@hotmail",
        "123ABC")
    adrian.logIn(adrian.email, adrian.clave)
    adrian.banca.operacion("1")

}