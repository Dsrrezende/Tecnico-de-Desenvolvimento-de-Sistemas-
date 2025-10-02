/*Exercicio I- (funções)Crie um programa com uma função chamada dobro que receba um número inteiro como parâmetro e retorne o dobro desse número. 
O programa principal deve solicitar um número ao usuário, chamar a função e exibir o resultado. */
programa {
  funcao inteiro dobro(inteiro num){
    retorne num*2
  }
  funcao inicio() {
    inteiro numero
    escreva("Digite um número para saber o seu dobro: ")
    leia(numero)
    escreva("O dobro do desse numero é: ", dobro(numero))
  }
}
