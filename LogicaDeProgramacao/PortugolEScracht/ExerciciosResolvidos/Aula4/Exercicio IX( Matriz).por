/**Exercicio IX( Matriz)Escreva um programa que declare uma matriz 3x3 de números reais. O usuário deve preencher todos os elementos da matriz, e o
programa deve calcular e exibir a soma dos elementos da diagonal principal. */
programa {
  const inteiro LINHAS=2, COLUNAS=2
  funcao inicio() {
  real matriz[LINHAS][COLUNAS]
  real soma = 0

  para(inteiro i=0; i<LINHAS;i++){
      para(inteiro j=0;j<COLUNAS;j++){
        escreva(" Digite o ",j+1,"ª número da ",i+1,"ª linha: ")
        leia(matriz[i][j])
        se (i==j){
          soma = soma + matriz [i][j]
        }
      }
    }
    limpa()

    para(inteiro i=0; i<LINHAS;i++){
      escreva("| ")
      para(inteiro j=0; j<COLUNAS;j++){
        escreva(matriz[i][j], " | ")

      }
      escreva("\n")
    }
    escreva("A soma da diagonal principal é : ",soma,"\n")

    
  }
}
