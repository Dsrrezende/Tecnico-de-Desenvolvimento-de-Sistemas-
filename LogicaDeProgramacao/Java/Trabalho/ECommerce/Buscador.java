package LogicaDeProgramacao.Java.Trabalho.ECommerce;

public class Buscador {
    public static int buscaSequencial (Produto [] vetor, long codigo, int quatidadeDeProdutos){
        for(int i= 0; i< quatidadeDeProdutos; i++){
            if (vetor[i].codigo == codigo){
                return i; // Quando o Indice for encontrado.
            }
        }
        return -1; // Quando o Indice não for encontrado.
    }

    public static Produto buscaBinariaPorNome(Produto[] vetor, String nomeBuscado, int quantidadeDeProdutos){
        int inicio = 0;
        int fim = quantidadeDeProdutos - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            int comparacao = vetor[meio].nome.compareToIgnoreCase(nomeBuscado);

            if (comparacao == 0){
                return vetor[meio]; // Produto encontrado
            }

            if (comparacao < 0) {
                inicio = meio + 1; // nome buscado está à direita
            } else {
            fim = meio - 1; // nome buscado está à esquerda
            }
        }
        return null; // Produto não encontrado
    }
}
