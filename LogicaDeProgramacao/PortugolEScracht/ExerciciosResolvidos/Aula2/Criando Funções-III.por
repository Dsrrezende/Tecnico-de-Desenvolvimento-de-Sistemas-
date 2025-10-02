programa {
  funcao escreve_tabuada(inteiro num){
    para(inteiro i=1;i<=10;i++){
      escreva(num, " x ",i, " = ",num * i,"\n")
    }
  }
  funcao inicio() {
    inteiro num, i, resultado
    escreva("Escreva um número para saber sau tabuada: ")
    leia(num)
    escreve_tabuada(num)
    
  }
}
