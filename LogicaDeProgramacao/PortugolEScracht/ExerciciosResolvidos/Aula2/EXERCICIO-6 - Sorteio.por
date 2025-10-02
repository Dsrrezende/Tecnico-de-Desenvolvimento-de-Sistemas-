/*EXERCICIO-6 --> Escreva um programa onde o computador escolhe um número entre 1 e 100. O usuário deve tentar adivinhar o número, e o programa
deve informar se o palpite está acima, abaixo ou correto. O jogo continua até que o usuário acerte.*/
programa {
  inclua biblioteca Util--> u
  funcao inicio() {
    inteiro palpite,sorteado =u.sorteia(1,100)
    faca{
      escreva("Digite um palpite para encontrar o número sorteado(de 1 a 100): ")
      leia(palpite)
      se(palpite==sorteado){
        escreva("Você acertou, o número era: ",sorteado)
      }senao se(palpite<sorteado){
        escreva("O número ",palpite," está abaixo do número sorteado\n")
      }senao{
        escreva("O número ",palpite, " esta acima do número sorteado\n")
      }
    }enquanto(palpite!=sorteado)
  }
}
