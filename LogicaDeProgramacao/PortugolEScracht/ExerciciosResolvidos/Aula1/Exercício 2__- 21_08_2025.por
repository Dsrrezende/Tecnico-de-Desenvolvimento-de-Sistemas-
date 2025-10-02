//Exercício 2***- 21/08/2025
//escreva um numero que encontre o valor maximo entre 2 numeros
//exemplo: entrada: digite um numero: 2 digite outro numero
//saida: o numero 2 é maior que numero 1
programa {
  inteiro nun1, nun2

  funcao inicio() {
    escreva("Digite um número: ")
    leia(nun1)
    escreva("Digite outro número: ")
    leia(nun2)

    se(nun1 > nun2)
    escreva("O número ",nun1," é maior que ",nun2,".")
    senao
    escreva("O número ",nun1," é menor que ",nun2,".")
    
  }
}
