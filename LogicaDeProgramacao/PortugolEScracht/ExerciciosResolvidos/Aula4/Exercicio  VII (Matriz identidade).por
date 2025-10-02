/**EX VII (Matriz identidade) */
programa {
  const inteiro LINHAS=3, COLUNAS=3
  funcao inicio() {
    inteiro matriz[LINHAS][COLUNAS]

    para(inteiro i=0; i<LINHAS;i++){
      para(inteiro j=0;j<COLUNAS;j++){
        se(i==j){
          matriz[i][j]=1
        }senao{
          matriz[i][j]=0
        }
        escreva(matriz[i][j],"|")
      }
      escreva("\n")
    }
  }
}
