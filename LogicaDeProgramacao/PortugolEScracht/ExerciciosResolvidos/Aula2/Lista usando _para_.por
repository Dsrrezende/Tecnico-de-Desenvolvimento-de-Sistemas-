//leia uma lista 
programa {
  inteiro idade, qtd, deMaior =0, deMenor=0
  const inteiro maioridade = 18
  funcao inicio() {
    escreva("Quantas pessoas estão na lista? ")
    leia(qtd)

    para( inteiro c=1; c<=qtd; c++){
      escreva("Digite a idade da pessoa: ")
      leia(idade)
      se (idade >= maioridade){
        deMaior++
      }senao{
        deMenor++
      }
    }
    escreva("na lista enviada, temos: ",deMaior," maiores de idade e ",deMenor, " menores de idade.")
  }
}
