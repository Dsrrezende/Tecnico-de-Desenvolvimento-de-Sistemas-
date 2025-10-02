programa {
  funcao inteiro fatorial (inteiro n){
    se(n==0){
      retorne 1
    }senao{
      se(n==1)
        escreva(n, " = ")
      senao
        escreva(n," * ")
        retorne n * fatorial(n-1)
    }
      
  }
  funcao inicio() {
    inteiro num
    escreva("Digite um número para descobrir se fatorial: ")
    leia(num)
    escreva(fatorial(num),"\n")
  }
}
