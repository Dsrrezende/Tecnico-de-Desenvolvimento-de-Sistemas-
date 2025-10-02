// Uso condicional com o comando "escolha"
//Importante Utilizar o comando pare para para o código quando uma das condições forem atendidas
programa {
  inteiro  diaDaSemana
  funcao inicio() {
    //imput
    escreva("Digite um dia da semana com números de 1 a  7: ")
    leia(diaDaSemana)
    //output
    escolha(diaDaSemana){
    caso 1:
    escreva("Domingo")
    pare
    caso 2:
    escreva ("Segunda")
    pare
    caso 3:
    escreva ("Terça")
    pare
    caso 4:
    escreva("Quarta")
    pare
    caso 5:
    escreva("Quinta")
    pare
    caso 6:
    escreva ("Sexta")
    pare
    caso 7:
    escreva(" Sábado")
    pare
    caso contrario:
    escreva(" Dia Invalido")
    }
    
  }
}
