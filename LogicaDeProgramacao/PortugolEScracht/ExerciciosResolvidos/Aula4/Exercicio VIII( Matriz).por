/**Exercicio VIII( Matriz) Escreva um programa que declare uma matriz 4x4 de números inteiros. O usuário deve preencher todos os elementos da matriz e, ao
final, o programa deve exibi-la no console no formato de tabela, com linhas e colunas organizadas. */
programa {
  const inteiro LINHAS=2, COLUNAS=2
  funcao inicio() {
    inteiro matriz[LINHAS][COLUNAS]

    para(inteiro i=0; i<LINHAS;i++){
      para(inteiro j=0; j<COLUNAS;j++){
        escreva("Digite o ",j+1,"º Número para a ",i+1,"ª matriz: ")
        leia(matriz[i][j])
      }
    }
    para(inteiro i=0; i<LINHAS;i++){
      escreva("| ")
      para(inteiro j=0; j<COLUNAS;j++){
        escreva(matriz[i][j], " | ")
      }
      escreva("\n")
    }
  }
}
