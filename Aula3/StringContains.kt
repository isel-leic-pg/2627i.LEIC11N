fun main() {
	val frase = "Aprender Kotlin é incrível!"

	// O Kotlin converte para: frase.contains("Kotlin")
	if ("Kotlin" in frase) {
		println("A palavra 'Kotlin' está na frase!") // Verdadeiro
	}

	if ("Java" !in frase) {
		println("A palavra 'Java' não foi encontrada.") // Verdadeiro
	}
	
	
	
	val intervaloLetras = "A".."C"

	println("B" in intervaloLetras)       // true (B vem depois de A e antes de C)
	println("Bernardo" in intervaloLetras) // true (Começa com B, então está no meio)
	println("Carlos" in intervaloLetras)   // false 
	/* Termina em C, logo tudo o que vem depois de C não faz parte do intervalo - "Ca" é uma string maior que "C", cuja 2ª letra já não aparece na string "C") */
	println("Daniel" in intervaloLetras)   // false (D vem depois de C)
	
	val intervalo2 = "J".."K"
	println("KOTLIN" in intervalo2) // Retorna false! 
	/* O limite superior é "K". Quando é feita a comparação de "KOTLIN" com "K", vê que ambas começam com 'K'. No entanto, "KOTLIN" tem mais letras a seguir, o que a torna "maior" do que apenas "K" na ordem do dicionário. Como "KOTLIN" > "K", fica fora do intervalo*/
	
	val intervalo3 = "J".."KZ"
	println("KOTLIN" in intervalo3) // Retorna true! ("KZ" vem depois de "KO" na tabela ASCII)
}


