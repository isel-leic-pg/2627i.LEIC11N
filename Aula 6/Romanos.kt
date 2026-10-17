fun main() {
    val romanos = listOf("I", "II", "III", "IV", "V")
    val arabes = listOf("1", "2", "3", "4", "5")

    print("Insira um número entre 1 e 5 para converter para numeração romana: ")
    val numero = readln()
    println("O número $numero em numeração romana é ${romanos[arabes.indexOf(numero)]}") //O número 3 em numeração romana é III
}