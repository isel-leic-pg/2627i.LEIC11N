fun main() {
    print("Insira um número: ")
    val numero = readln().trim().toInt()

    if (numero >= 0) {
        println("positivo: $numero.")
        println("nice!")
    }
    //if (numero < 0)
    else {
        println("negativo: $numero.")
        println("not nice")
    }
}