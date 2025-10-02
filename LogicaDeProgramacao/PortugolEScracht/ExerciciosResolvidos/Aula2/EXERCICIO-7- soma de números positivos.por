/*EXERCICIO-7 --> Desenvolva um programa que solicite ao usuário que digite números positivos. O programa deve somar todos os números inseridos até
que o usuário digite um número negativo. Ao final, o programa exibe a soma total.*/
programa {
  funcao inicio() {
    inteiro nun=0, soma=0
    enquanto(nun>=0){
      soma=soma+nun
      escreva("Digite números para somar(digite negativos para parar): ")
      leia(nun)
    }
    escreva("A soma dos Números Digitados é: ", soma)
  }
}
