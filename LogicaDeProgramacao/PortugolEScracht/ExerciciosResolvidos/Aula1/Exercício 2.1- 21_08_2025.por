//Exercício 2.1- 21/08/2025
// criar um algoritimo que receba quatro notas e calcule a media. se a média for maior que 7 deverá se exibida a mensagem, aprovado
// caso contrario deverá ser escrito a mensagem reprovado.
programa {
  real nota1, nota2, nota3, nota4, media
  funcao inicio() {
    escreva("Digite sua primeira nota: ")
    leia(nota1)
    escreva("Digite sua segunda nota: ")
    leia(nota2)
    escreva("Digite sua terceira nota: ")
    leia(nota3)
    escreva("Digite sua quarta nota: ")
    leia(nota4)
    media = ((nota1+nota2+nota3+nota4)/4)

    escreva("##################################","\n")
    se(media >=7)
    escreva("Sua média foi ",media," APROVADO!!!!","\n")
    senao
    escreva("Sua média foi ",media," REPROVADO","\n")
    escreva("##################################","\n")
    


  }
}
