/**Escreva um programa que declare uma matriz 3x3 de números reais. O usuário deve preencher todos os elementos da matriz, e o programa deve calcular e exibir a soma dos elementos da diagonal principal. */
programa {
  const inteiro L=3,C=3
  funcao inicio() {
    real matriz[L][C]
    real soma = 0
    para(inteiro i=0; i<L;i++){
      para(inteiro j=0; j<C;j++){
        escreva("Digite o número na posição: [",i,"][",j,"]: ")
        leia(matriz[i][j])
        se(i == j){
          soma = soma + matriz[i][j]
        }
      }
    }
    para(inteiro i = 0;i<L; i++){
      escreva("| ")
      para(inteiro j=0;j<C;j++){
        escreva(matriz[i][j], " |")
      }
      escreva("\n")  
    }
    escreva("A soma da diagonal é: ", soma) 
  }
}
