programa {
  inclua biblioteca Util
  funcao inicio() {
    inteiro nun, contar
    nun = 1
    escreva("Digite até quando vc gostaria que eu contasse?: ")
    leia(contar)
    enquanto(nun<=contar){
      limpa()
      escreva(nun++," \n")
      Util.aguarde(200)
    }
    
  }
}
