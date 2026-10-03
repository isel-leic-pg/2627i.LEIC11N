fun main(){
    //println("Vamos fazer contas!")
    print("Vamos fazer contas!\n")
    print("Insira o 1º operando: ")
    val operando1 = readln().toInt()

    //print("Insira o 2º operando: ")
    //val operando2 = readln().toInt()
    val operando2 = readInt("2º operando")

    val resultado = operando1 + operando2
    println(27 + 3)    // 30
    println("27" + 3)  // 273
    println("O resultado de ($operando1 + $operando2) = $resultado")
    //println("O resultado de ($operando1 + $operando2) = ${operando1 + operando2}")
}