programa {
  inclua biblioteca Util
  funcao inicio() {
    inteiro nun, contar
    inteiro i
    escreva("Digite até quando vc gostaria que eu contasse?: ")
    leia(contar)
    para(i=1;i<=contar;i++){
      limpa()
      escreva("Loading... ")
      escreva(i,"%\n")
      Util.aguarde(200)
    }
    escreva("Carregamento concluido")
  }
}
