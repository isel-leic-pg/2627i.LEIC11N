fun main() {
    val a = readInt("Lado 1? ", default=2)
    val b = readInt("Lado 2? ", 3)
    val c = readInt("Lado 3? ")

    val type = when {
        a+b <= c || a +c <= b || b + c <= a -> "Impossível"
        a == b && b == c -> "Equilátero"
        a == b || b == c || a == c -> "Isósceles"
        else -> "Escaleno"
    }
    println("O triângulo é $type")
}

fun readInt(texto: String, default:Int = 1): Int {
    print(texto)
    val resultado = readln().trim().toIntOrNull()
    /*if (resultado == null)
        return default
    else
        return resultado*/
    return if (resultado == null) default else resultado
}






