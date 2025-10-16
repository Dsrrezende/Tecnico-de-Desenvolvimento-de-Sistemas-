package LogicaDeProgramacao.Java.Trabalho.ECommerce;

public class Ordenador {
    public static void ordenacaoPorCodigo ( Produto [] produtos, int quantidadeDeProdutos){//BubbleSort
        for (int i = 0; i < quantidadeDeProdutos -1; i++){
            for (int j = 0; j < quantidadeDeProdutos -i -1; j++){
                if (produtos[j].codigo > produtos[j + 1].codigo){
                    Produto temp = produtos [j];
                    produtos[j] = produtos [j+1];
                    produtos [j+1] = temp;
                }
            }
        }
    }

    public static void ordenacaoPorPreco(Produto [] produtos, int quantidadeDeProdutos ){//InsertionSort
        for ( int i=1 ; i < quantidadeDeProdutos;i++){
            Produto chave = produtos[i]; // produto que será inserido na posição correta
            int j = i -1;

            // desloca os produtos com preço maior que chave para a direita
            while (j >= 0 && produtos [j].preco > chave.preco) {
                produtos[j+1] = produtos[j];
                j--;
            }
            produtos[ j + 1] = chave;
        }
    }

    public static void ordenarPorNome(Produto[] produtos, int quantidadeProdutos) {// Busca por String
        for (int i = 0; i < quantidadeProdutos - 1; i++) {
            for (int j = 0; j < quantidadeProdutos - i - 1; j++) {
                if (produtos[j].nome.compareToIgnoreCase(produtos[j + 1].nome) > 0) {
                    Produto temp = produtos[j];
                    produtos[j] = produtos[j + 1];
                    produtos[j + 1] = temp;
                }
            }
        }
    }
}
