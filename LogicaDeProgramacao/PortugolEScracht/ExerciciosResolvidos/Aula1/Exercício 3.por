//EXERCÍCIO 3 - Contrua um algoritmo que leia o nome de um aluno, disciplinas, duas notas e exiba na tela a média
programa {
  //variaveis
  cadeia aluno, disciplina1, disciplina2
  real nota1, nota2, media

  funcao inicio() {
    escreva("Digite seu nome: ")
    leia(aluno)
    escreva("Digite o nome da sua primeira disciplina: ")
    leia(disciplina1)
    escreva("Digite o nome da sua segunda disciplina: ")
    leia(disciplina2)
    escreva("Digite a nota você tirou em ",disciplina1,": ")
    leia(nota1)
    escreva("Digite a nota você tirou em ",disciplina2,": ")
    leia(nota2)

    media = ((nota1+nota2)/2)

    escreva("\n")
    escreva("Nome: ",aluno,"\n")
    escreva("Você tirou ",nota1," em ",disciplina1, " e ",nota2," em ",disciplina2,"\n")
    escreva("Sua média foi: ",media,"\n")


    
  }
}
