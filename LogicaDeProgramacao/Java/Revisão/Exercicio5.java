package LogicaDeProgramacao.Java.Revisão;
/*Crie um vetor de 5 números inteiros. Peça ao usuário para preencher e exiba:
--> todos os números digitados.
--> a soma e a média. */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int [] vetor = new int[5];
        int soma = 0;
        double media;
    
        Scanner sc = new Scanner(System.in);

        for( int i = 0; i < vetor.length; i++){
        System.out.print("Digite o "+(i+1)+"º número do vetor: ");
        vetor[i] = sc.nextInt();
        }

        System.out.println();
        for(int i = 0; i < vetor.length; i++){
            System.out.println("O vetor na posição "+i+" é "+vetor[i]);
            soma += vetor[i];
        }

        media = (double)soma / vetor.length; /* Como "soma" e "vetor" são declarados int, a divisão deles tbm é int, descartando a casa 
        decimal por isso tive que declarar a variavel "soma" dentro da equação como double, para que o valor da divisão retorne um 
        double tbm.*/

        System.out.println();
        System.out.printf("A soma dos elementos do meu vetor é %d\nA média dos elementos do meu vetor é %.2f",soma,media);
        sc.close();
    }
}
