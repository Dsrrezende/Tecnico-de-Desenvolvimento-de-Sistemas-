//EXERCICIO 3 --> Aproveite o código dos exercícios anteriores e escreva um código que receba dois números inteiros e escreva todos os números pares
//entre eles.*/
programa {
  inteiro n1, n2
  funcao inicio() {
    escreva("digite o primeiro número: ")
    leia(n1)
    escreva("digite o segundo número: ")
    leia(n2)

    se ( n1<n2){
      para( inteiro i=n1;i<=n2;i++){
        se (i % 2==0){
          escreva(i,"\n")
        }
      }
    }senao{
      para( inteiro i=n1;i>=n2;i--){
        se (i % 2==0){
          escreva(i,"\n")
        }
      }
    }
  }
}
