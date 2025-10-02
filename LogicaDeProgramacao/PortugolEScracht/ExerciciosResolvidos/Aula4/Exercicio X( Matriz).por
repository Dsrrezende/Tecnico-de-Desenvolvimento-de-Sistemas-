/**Exercicio X( Matriz)-->Escreva um programa que declare uma matriz 5x5 de números inteiros. O usuário deve preencher a matriz, e, em seguida, informar um
número para pesquisa. O programa deve mostrar a posição (linha e coluna) onde o número foi encontrado ou exibir uma mensagem
avisando que o número não existe na matriz. */
programa {
  const inteiro LINHAS=5, COLUNAS=5
  funcao inicio() {
    inteiro matriz[LINHAS][COLUNAS],num, qtd=0

    //Pede ao Usuário que preencha a matriz
    para(inteiro i=0; i<LINHAS;i++){
      para(inteiro j=0; j<COLUNAS; j++){
        escreva("Digite o ",j+1,"º número da ",i+1,"ª linha: ")
        leia(matriz[i][j])
      }
    }

    limpa()
    //Pede ao Usuário para inserir um número a ser quesquisado na matriz
    escreva("Digite um número para saber pesquisar sua posição na matriz: ")
    leia(num)

    //Mostra a Matriz digitada
    para(inteiro i=0; i<LINHAS;i++){
      escreva("| ")
      para(inteiro j=0; j<COLUNAS;j++){
        escreva(matriz[i][j], " | ")
      }
      escreva("\n")
    }
    escreva("\n")

    //Informa a posição (linha/coluna) do número digitado
    para(inteiro i=0; i<LINHAS;i++){
      para(inteiro j=0; j<COLUNAS; j++){
        se(num==matriz[i][j]){
          qtd++
        }
      }
    }
    se(qtd>0){
      escreva("O número digitado '",num,"' aparece ",qtd," vez(es) na matriz digitada, e sua localização é/são: \n")
      para(inteiro i=0; i<LINHAS;i++){
        para(inteiro j=0; j<COLUNAS; j++){
          se(num==matriz[i][j]){
            escreva("Linha '",i,"' e Coluna '",j,"'.\n")
          }
        }
      }
    }senao
      escreva("O número digitado não pertence a matriz.")
  }
}



