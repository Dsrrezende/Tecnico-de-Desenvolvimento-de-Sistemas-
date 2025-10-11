package LogicaDeProgramacao.Java.Aula7.Ordenador;

public class Ordenador {
    public static void bubblesort ( int [] vetor){
        int n = vetor.length;
        for (int i = 0; i< n - 1; i++){
            for (int j = 0; j < n-1; j++){
                if (vetor [j] > vetor[j+1]){
                    int temp = vetor [j];
                    vetor[j] = vetor [j+1];
                    vetor [j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort ( int [] vetor){
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++){
            int indicadorDoMenor = i;
            for (int j = i+1; j < n; j++){
                if (vetor [j] < vetor [indicadorDoMenor]){
                    indicadorDoMenor =j;
                }
            }
            int temp = vetor [indicadorDoMenor];
            vetor [indicadorDoMenor] = vetor [i];
            vetor[i] = temp;
        }
    }

    public static void insertionSort(int [] vetor){
        for ( int i=1 ; i < vetor. length;i++){
            int chave = vetor[i];
            int j = i -1;
            while (j >= 0 && vetor [j] > chave) {
                j = j - 1;
            }
            vetor[ j + i] = chave;
        }
    }
}
