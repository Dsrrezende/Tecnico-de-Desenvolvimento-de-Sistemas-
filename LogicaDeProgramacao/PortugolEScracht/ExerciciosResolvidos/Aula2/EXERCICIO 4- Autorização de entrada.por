/*EXERCICIO 4- Um cliente que promove eventos e solicitou um programa que seja capaz de identificar se uma pessoa é maior de idade. Pessoas com
menos de 16 anos não podem entrar nos eventos. Entre 16 e 18 anos somente acompanhado pelos responsáveis. Maiores de 18 podem
entrar normalmente. (O programa deve executar até que o usuário digite 0)*/
programa {
  funcao inicio() {
    inteiro idade
    faca{
      escreva("Digite a idade da pessoa: ")
      leia(idade)
      se(idade==0){
        escreva("Programa Finalizado pelo Usúario")
      }senao se(idade<16){
        escreva("Não pode entrar","\n")
      }senao se(idade <18){
        escreva("Pode entrar, mas acompanhado pelos responsaveis\n")
      }senao{
        escreva("Pode entrar\n")
      }

     }enquanto(idade !=0)
    }
  }
}
