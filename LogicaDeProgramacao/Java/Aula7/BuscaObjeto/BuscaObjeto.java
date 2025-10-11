package LogicaDeProgramacao.Java.Aula7.BuscaObjeto;

public class BuscaObjeto {
    public static void selectionSortPorNome ( Item[] vetor){
        int n = vetor.length;
        for (int i=0;i < n-1;i++){
            int indiceDoMenor =i;
            for( int j = i+1; j < n; j++){
                if (vetor [j].nome.compareToIgnoreCase(vetor[indiceDoMenor].nome) < 0) {
                    indiceDoMenor = j;
                }
            }
            Item temp = vetor[indiceDoMenor];
            vetor [indiceDoMenor] = vetor [i];
            vetor[i] = temp;
        }
    }

    public static Item buscaBinariaPorNome ( Item[]vetor, String busca){
        int inicio = 0;
        int fim = vetor.length -1;
        
        while (inicio <= fim) {
            int meio = inicio + (fim-inicio)/2;
            
            int comparacao = busca.compareToIgnoreCase(vetor[meio].nome);

            if (comparacao == 0){
                return vetor[meio];
            }

            if (comparacao < 0){
                fim = meio - 1;
                
            }else{
                inicio = meio + 1;
            }
        }
        return null;
    }
}
