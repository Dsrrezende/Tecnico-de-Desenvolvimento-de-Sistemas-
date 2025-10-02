programa {
  funcao real mediaNotas(real media){
  	media=media/3
    retorne media
  }
  funcao inicio() {
    real nota1,nota2,nota3,resultado
    escreva("Digite a primeira nota: ")
    leia(nota1)
    escreva("Digite a segunda nota: ")
    leia(nota2)
    escreva("Digite a terceira nota: ")
    leia(nota3)
    resultado= nota1+nota2+nota3
    mediaNotas(resultado)
    escreva("Sua média é: ",mediaNotas(resultado))
  }
}