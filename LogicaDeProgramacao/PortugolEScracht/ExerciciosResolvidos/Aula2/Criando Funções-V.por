programa {
  inclua biblioteca Util -->u
  funcao timer (inteiro segundos){
    se(segundos <0)
     retorne
    senao{
      limpa()
      escreva("Segundos: ",segundos)
      u.aguarde(1000)
      timer(segundos-1)
    }

  }
  funcao inicio() {
    inteiro tempo
    escreva("Digite o tempo em segundos para o timer: ")
    leia(tempo)
    timer(tempo)
    limpa()
    escreva("timer encerrado!")
  }
}
