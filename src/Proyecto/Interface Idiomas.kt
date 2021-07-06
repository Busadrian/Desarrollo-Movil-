package Proyecto

interface Idiomas {
    //Cargar Textos
    abstract fun loadTexto()
    //Función para obtener el texto en un idioma determinado
    abstract fun getTexto(id: String): String?
}