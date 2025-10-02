programa {
cadeia nome, categoria
inteiro idade
  funcao inicio() {
    escreva("\nPor favor informe seu nome?: ")
		leia(nome)
		escreva("\nPor favor informe sua idade: ")
    leia(idade)

    se (idade < 10){
      escreva("\nNome: ",nome)
			escreva("\nIdade: ",idade, " Anos")
			escreva("\nCategoria: Escolhinha\n")
    }
    se (idade >=10 e idade < 18){
      escreva("\nNome: ",nome)
			escreva("\nIdade: ",idade," Anos")
			escreva("\nCategoria: Categoria de Base\n")
    }
    se(idade >= 18 e idade <=40 ){
      escreva("\nNome: ",nome)
			escreva("\nIdade: ",idade," Anos")
			escreva("\nCategoria: Profissional\n")
    }
    se(idade > 40){
      escreva("\nNome: ",nome)
			escreva("\nIdade: ",idade," Anos")
			escreva("\nCategoria: Master\n")
    }
    se(idade >= 70){
      escreva("ESQUECE FUTEBOL, SUA ÉPOCA JA PASSOU\n")
    }
  }
}
