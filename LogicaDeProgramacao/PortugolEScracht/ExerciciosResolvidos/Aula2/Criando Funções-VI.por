programa {
  inclua biblioteca Util--> u
  funcao cronometro (inteiro atual, inteiro segundos){
    se(atual > segundos)
      retorne
    senao{
      limpa()
      escreva("Segundos: ", atual)
      u.aguarde(1000)
      cronometro(atual +1, segundos)
    }
  }
  funcao inicio() {
    inteiro tempo
    escreva("Digite o tempo em segundos para o Cronometro: ")
    leia(tempo)
    cronometro(0,tempo)
    limpa()
    escreva("Cronometro Encerrado!")
  }
}
