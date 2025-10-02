/*EXERCICIO IV (FUNÇÕES)-Depois, implemente uma função chamada maiorNumero que receba dois números inteiros e retorne o maior entre eles. 
O programa deve exibir o valor retornado por essa função. */
programa {
  funcao inteiro maiorNumero(inteiro num1, inteiro num2){
    se (num1<num2){
      num1=num2-1
      retorne num1
    }
    senao se( num1>num2){
      num2=num1-1
      retorne num2 
    }senao{
      //num1==num2--> linha não necessária
      retorne 0
    }
  }
  funcao inicio() {
    inteiro num1, num2, maior
    escreva("Digite um número: ")
    leia(num1)
    escreva("Digite outro número: ")
    leia(num2)
    maior = maiorNumero(num1,num2)
    se(maior==0){
      escreva("O Números digitados são iguais e não existe maior entre eles.")
    }
    senao{
      escreva("O maior número entre ",num1, " e ", num2," é: ",maior)
    }
  }
}
