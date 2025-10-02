/*EXERCICIO III-(FUNÇÕES) -Crie também uma função chamada ehPar que receba um número inteiro e retorne verdadeiro se ele for par, ou falso se for ímpar. O programa
principal deve ler um número e exibir o resultado da verificação. */
programa {
  funcao logico ehpar(inteiro num){//Uma função Logica retorna apenas verdadeiro/falso
    retorne num % 2 == 0
  }
  funcao inicio() {
    inteiro num1 
    logico par
    escreva("Digite um número para saber se ele é ímpar ou par: ")
    leia(num1)
    ehpar(num1)
    par = ehpar(num1)
    escreva("O número ",num1," é par? ", par)
  }
}
