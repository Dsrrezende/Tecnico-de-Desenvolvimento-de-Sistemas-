//EXERCICIO 2- Construa um algoritimo que leia um número e exiba na tela o seu sucessor e antecessor
programa {
  inteiro nun, ant, sus
  funcao inicio() {
    
    escreva("Digite um número: ")
    leia(nun)
    ant = nun - 1
    sus = nun + 1
    escreva("\n")
    escreva("Você digitou o número: ", nun, "\n")
    escreva("O Antecessor de ",nun," é ",ant," e o sucessor é ", sus,"\n")
    
  }
}
