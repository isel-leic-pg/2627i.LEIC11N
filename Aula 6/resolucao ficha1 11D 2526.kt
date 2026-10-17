fun readLetter(validLetters: String ) : Char
{
    while( true ) {
        val line = readln().trim()
        if ( !line.isEmpty() /*line.length != 0*/ ) {   // Se não for linha vazia
            val letter = line[0].uppercaseChar()
            if ( letter in validLetters ) return letter
        }
    }
}
    fun main() {
        println("Pense num número entre 0 e 15")
        var range = 0 .. 15
        do {
            val middle = (range.last + range.first) / 2
            print("$range: O número é maior que ${middle} ? (S/N) ")
            range = if (readLetter("SN") == 'S' ) (middle + 1)..range.last
            else range.first..middle
        }while (range.first != range.last)
        println( "O número é ${ range.first }")


   /* val phrase: List<String> = listOf("uma", "frase", "é", "uma", "lista")
        //é equivalente a
    val phrase2 = listOf("uma", "frase", "é", "uma", "lista")

    val emptyList = listOf<String>()
    val intList = listOf(1, 2, 3)
    val doubleList = listOf(1.0, 2.0, 3.0)
    val charList = listOf('a', 'b', 'c')

    println(phrase) //[uma, frase, é, uma, lista]
    println("intList=$intList") //intList=[1, 2, 3]

    phrase.size //5
    phrase.lastIndex //4
    phrase.first()
    phrase.last()
    phrase[0] //"uma"

    for (i in 0 .. phrase.size-1)
        print(phrase[i] + ' ') //output: uma frase é uma lista


    for (i in phrase.indices)
        print(phrase[i] + ' ') //output: uma frase é uma lista


    for (word in phrase) print(word + ' ')

    val otherPhrase = phrase + listOf("de", "palavras")
    println(otherPhrase) //[uma, frase, é, uma, lista, de, palavras]
    println(phrase + "fim.") //[uma, frase, é, uma, lista, fim.]

    val otherPhrase2 = phrase - listOf("lista", "frase")
    println(otherPhrase2) //[uma, é, uma]
    println(phrase - "é") //[uma, frase, uma, lista]

    if("uma" in phrase) println("existe") //existe
    if("aa" !in phrase) println("não existe") //não existe

    val phrase12 = ["uma","frase","é","uma","lista"]

    println(phrase.indexOf("outra")) //-1
    println(phrase.indexOf("uma")) //0, é o índice da 1ª ocorrência
    println(phrase.lastIndexOf("uma")) //3, é o índice da última ocorrência

    for (index in 1..5)
        print("$index ")

    for (c in "Kotlin")
        print("$c ") //output: K o t l i n

    println(listOf('A', 'B') + ('C'..'E')) // [A, B, C, D, E]

    println(listOf('A', 'B', 'C', 'D', 'B', 'A') - ('A'..'C')) //[D] */

}
