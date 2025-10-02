/**6 - Escreva um programa que declare duas matrizes de tamanho 2x2. O usuário deve preencher as duas matrizes com números inteiros, e o programa deve criar uma terceira matriz que seja a soma das duas primeiras, elemento por elemento, exibindo o resultado ao final.
 */
programa {
  const inteiro L = 2, C =2
  funcao inicio() {
    inteiro matriz1[L][C], matriz2[L][C], soma[L][C]
    escreva("Digite a primeira matriz: \n")
    para(inteiro i=0; i<L;i++){
      para(inteiro j=0; j<C;j++){
        escreva("Digite o número na posição: [",i,"][",j,"]: ")
        leia(matriz1[i][j])
      }
    }
    escreva("Digite a segunda matriz: \n")
    para(inteiro i=0; i<L;i++){
      para(inteiro j=0; j<C;j++){
        escreva("Digite o número na posição: [",i,"][",j,"]: ")
        leia(matriz2[i][j])
      }
    }
    para(inteiro i=0; i<L;i++){
      para(inteiro j=0; j<C;j++){
        soma[i][j] = matriz1[i][j] + matriz2[i][j]
        escreva(soma[i][j], " | ")
      }
      escreva("\n")
    }
  }
}
