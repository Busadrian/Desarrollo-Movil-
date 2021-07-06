package Adrian
// ver como se le puede poner a edad el datetime y que se actualize solo
// se pude usar el dataclass como constructor
// verificar id

/*Se cre la data class con la inofmación base para la clase Usuario
con valores nulos para poder definir en cualquier momento */

data class Persona(val nombre:String,
                   val appelido: String,
                   var edad: Int ,
                   val id:String ,
                   var email: String ,
                   var contrasena: String,
                   ){

}
