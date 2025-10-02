/*EXERCICIO II- (FUNÇÕES) Em seguida, desenvolva uma função chamada mediaNotas que receba três notas do tipo real e retorne a média dessas notas. No programa
principal, peça as três notas ao usuário, chame a função e mostre se o aluno está aprovado (média maior ou igual a 6) ou reprovado. */
programa {
	inclua biblioteca Matematica-->M
  funcao real mediaNotas(real nota1,real nota2, real nota3){
    real media,arredondar
    media = ((nota1+nota2+nota3)/3)
    arredondar=M.arredondar(media, 2)
    retorne arredondar
  }
  funcao inicio() {
    real nota1,nota2, nota3, media

    escreva("Digite sua primeira nota: ")
    leia(nota1)
    escreva("Digite sua sua segunda nota: ")
    leia(nota2)
    escreva("Digite sua terceira nota: ")
    leia(nota3)
    //mediaNotas(nota1,nota2,nota3)-->linha não necessária
    media = mediaNotas(nota1,nota2,nota3)

    se (media<6){
      escreva("==============================================")
      escreva("\nSua média foi ",media," você foi Reprovado.\n")
      escreva("==============================================")
    }senao{
      escreva("=========================================================")
      escreva("\nParabéns, sua média foi ",media," você foi Aprovado!!!!\n")
      escreva("=========================================================")
    }
  }
}
