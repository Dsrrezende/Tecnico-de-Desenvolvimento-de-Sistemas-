package LogicaDeProgramacao.Java.Aula7.Ordenador;

import java.util.Random;

public class Programa {
    public static void main(String[] args) {
        int tamanhoVetor = 20;
        int []vetor = new int [tamanhoVetor];
        Random gerador = new Random();
        for (int i = 0; i< vetor.length; i++){
            vetor[i] = gerador.nextInt(1000) +1;
        }
        System.out.println("### Vetor Original ( 20 primeiros elementos) ###");

        for (int i = 0; i< 20; i++){
            System.out.println(vetor[i] + ", ");
        }
        System.out.println("\n---------------------------------");

        Ordenador.selectionSort(vetor);

        for(int i=0; i < vetor.length; i++){
            System.out.printf("%d - %d\n",i, vetor[i]);
        }
    }
}