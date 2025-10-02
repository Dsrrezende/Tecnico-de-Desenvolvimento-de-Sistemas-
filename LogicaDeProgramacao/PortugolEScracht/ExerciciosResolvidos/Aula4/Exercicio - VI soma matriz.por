/**EX VI (Matriz) */
programa {
  const inteiro LINHAS=2, COLUNAS=2
  funcao inicio() {
    inteiro matriz1[LINHAS][COLUNAS], matriz2 [LINHAS][COLUNAS], matrizSoma[LINHAS][COLUNAS]
    //Primeira Matriz
    para(inteiro i=0; i<LINHAS;i++){
      para(inteiro j=0;j<COLUNAS;j++){
        escreva(" Digite o ",j+1,"ª número da ",i+1,"ª linha da matriz 1: ")
        leia(matriz1[i][j])
      }
    }
    //Segunda Matriz
    para(inteiro i=0; i<LINHAS;i++){
      para(inteiro j=0;j<COLUNAS;j++){
        escreva(" Digite o ",j+1,"ª número da ",i+1,"ª linha da matriz 1: ")
        leia(matriz2[i][j])
      }
    }
    //Matriz Soma
    para(inteiro i=0; i<LINHAS;i++){
      para(inteiro j=0;j<COLUNAS;j++){
        matrizSoma[i][j]= matriz1[i][j] + matriz2 [i][j]
      }
    }
    limpa()
    escreva("RESULTADO:\n\n")
    para(inteiro i=0; i<LINHAS;i++){
      para(inteiro j=0;j<COLUNAS;j++){
        escreva(matriz1[i][j],"|")
      }
      escreva("\n")
    }
    escreva(" + \n")

    para(inteiro i=0; i<LINHAS;i++){
      para(inteiro j=0;j<COLUNAS;j++){
        escreva(matriz2[i][j],"|")
      }
      escreva("\n")
    }
    escreva(" = \n")
    
    para(inteiro i=0; i<LINHAS;i++){
      para(inteiro j=0;j<COLUNAS;j++){
        escreva(matrizSoma[i][j],"|")
      }
      escreva("\n")
    }
  }
}
