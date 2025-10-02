/**Escreva um programa que declare uma matriz 5x5 de números inteiros. O usuário deve preencher a matriz, e, em seguida, informar um número para pesquisa. O programa deve mostrar quantas vezes esse número aparece na matriz e em quais posições (linha x coluna). Se o número não for encontrado, uma mensagem de aviso deve ser exibida.
 */
programa {
  const inteiro L = 2, C=2
  funcao inicio() {
    inteiro matriz[L][C]
    inteiro pesquisa, qtd=0
    para(inteiro i=0; i<L;i++){
      para(inteiro j=0; j<C;j++){
        escreva("Digite o número na posição: [",i,"][",j,"]: ")
        leia(matriz[i][j])
      }
    }
    escreva("Digite o número para pesquisar: ")
    leia(pesquisa)
    para(inteiro i=0; i<L;i++){
      para(inteiro j=0; j<C;j++){
        se(pesquisa == matriz[i][j]){
          qtd++
        }
      }
    }
    se(qtd>0){
      escreva("O número aparece: ", qtd, " na matriz.\n")
      para(inteiro i=0; i<L;i++){
      para(inteiro j=0; j<C;j++){
        se(pesquisa == matriz[i][j]){
          escreva("Nas posições: [",i,"][",j,"]\n")
        }
      }
    }
    }
    
  }
}
