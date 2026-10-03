fun main() {
    print("Insira um número: ")
    val ano = readln().toInt()

    val dias = if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) 366 else 365

    println("O ano $ano tem $dias dias. É bissexto? ${if(dias==366) "sim" else "não"}")
    
}