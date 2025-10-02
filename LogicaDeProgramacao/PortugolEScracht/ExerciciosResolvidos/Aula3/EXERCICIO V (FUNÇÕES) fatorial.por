/*EXERCICIO V (FUNÇÕES)- Implemente ainda uma função chamada fatorial que receba um número inteiro positivo e retorne o seu fatorial. 
No programa principal, solicite esse número ao usuário, chame a função e mostre o resultado do cálculo. */
programa {
  funcao inteiro fatorial(inteiro n){
    se (n==0){
      retorne 1
    }senao{
      retorne n*fatorial(n-1)
    }
  }
  funcao inicio() {
    inteiro num
    escreva("Escreva um Número para sabe o seu fatorial: ")
    leia(num)
    fatorial(num)
    escreva("O fatorial de ",num," é: ",fatorial(num))

  }
}
