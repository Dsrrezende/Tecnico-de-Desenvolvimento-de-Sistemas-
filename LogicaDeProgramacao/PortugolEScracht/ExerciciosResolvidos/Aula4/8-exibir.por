/**Escreva um programa que declare uma matriz 4x4 de números inteiros. O usuário deve preencher todos os elementos da matriz e, ao final, o programa deve exibi-la no console no formato de tabela, com linhas e colunas organizadas. */

programa {
  const inteiro L = 3, C= 3
  funcao inicio() {
    inteiro matriz[L][C]
    para(inteiro i=0; i<L;i++){
      para(inteiro j=0; j<C;j++){
        escreva("Digite o número na posição: [",i,"][",j,"]: ")
        leia(matriz[i][j])
      }
    }
    escreva("+---+---+---+\n")
    para(inteiro i = 0;i<L; i++){
      escreva("| ")
      para(inteiro j=0;j<C;j++){
        escreva(matriz[i][j], " |")
      }
      escreva("\n+---+---+---+\n")  
    }
  }
}
