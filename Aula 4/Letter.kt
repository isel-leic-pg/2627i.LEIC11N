fun main(){
    print("Insira um caracter: ")
    val caracter = readln()[0]

    if(caracter in '0'..'9')
        println("É dígito")
    //if(caracter in 'a'..'z' || caracter in 'A'..'Z')
    //    println("É letra")
    if (caracter in 'a'..'z')
        println("É letra. Em maiúscula é: ${ caracter - ('a'-'A')}")
    if(caracter in 'A'..'Z')
        println("É letra. Em minúscula é: ${ caracter + ('a'-'A')}")
    println("Fim")
}