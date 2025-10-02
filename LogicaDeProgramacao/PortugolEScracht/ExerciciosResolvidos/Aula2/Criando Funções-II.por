programa {
  funcao inteiro tabuada(inteiro num, inteiro tab){/* A função tem que esta alocada dentro do programa fora da função inicio */
    retorne num*tab
  }
  funcao inicio() {
    inteiro num, resultado,i
    escreva("Escreva um número para saber sua tabuada: ")
    leia(num)
    para(i=1;i<=10;i++){
      resultado = tabuada(num,i)
      escreva(num, " x ",i, " = ", resultado, "\n")
    }
  }
}
