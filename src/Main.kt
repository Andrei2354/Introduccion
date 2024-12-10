fun main() {
    printAll()
    bucleFor()
    bucleWhile()
    ejemploLista()
    ejemploDataClass()
    ejemploWhen("2")
    ejemploClase()
}

fun printAll(){
    val entero = 1
    val str = "Andrei"
    val boolean = true
    val double = 13.0
    val float = 3.14

    println("Entero: $entero")
    println("String: $str")
    println("Boolean: $boolean")
    println("Double: $double")
    println("Float: $float")
}

fun bucleWhile() {
    var contador = 0
    while (contador < 13) {
        println(++contador)
    }
}

fun bucleFor() {
    val numeros = listOf(1, 2, 3, 4, 5)
    for (numero in numeros) {
        println("Número: $numero")
    }
}

fun ejemploLista() {
    val coloresInmutables = listOf("rojo", "azul", "verde")
    println("Primer color: ${coloresInmutables[0]}")

    val coloresMutables = mutableListOf("amarillo", "naranja")
    coloresMutables.add("morado")
    println("Colores actualizados: $coloresMutables")
}

fun ejemploDataClass() {
    val producto = Producto("Laptop", 1200.0)
    println(producto)
}

fun ejemploWhen(cantidad: String) {
    val mensaje = when (cantidad) {
        "1"-> "1 manzana"
        "2" -> "2 manzana"
        "3" -> "3 manzana"
        else -> "Muchas manzanas"
    }
    println(mensaje)
}

class Producto1(val nombre: String, val precio: Double) {
    fun info() {
        println("El equipo es $nombre y su precio: $precio")
    }
}

fun ejemploClase() {
    val producto = Producto1("Laptop", 1200.0)
    producto.info()
}

data class Producto(val nombre: String, val precio: Double)
