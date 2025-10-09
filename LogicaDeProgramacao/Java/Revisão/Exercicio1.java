package LogicaDeProgramacao.Java.Revisão;
/*Crie um programa que peça ao usuário dois números inteiros e mostre:
a soma, subtração, multiplicação e divisão entre eles.
(Dica: pratique o uso do Scanner e operadores aritméticos.) */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int num1, num2, soma, subtracao, multiplicacao,divisao;
        
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um Número: ");
        num1 = leia.nextInt();
        System.out.print("Digite o segundo Número: ");
        num2 = leia.nextInt();

        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        
        System.out.printf("A soma de %d + %d = %d\n",num1,num2,soma);
        System.out.printf("A subtração de %d - %d = %d\n",num1,num2,subtracao);
        System.out.printf("A multiplicacao de %d * %d = %d\n",num1,num2,multiplicacao);
        
        if (num2 != 0) {
            divisao = num1 / num2;
            System.out.printf("A divisão de %d / %d = %d\n", num1, num2, divisao);
        } else {
            System.out.println("Não é possível dividir por zero!");
        }


       

        leia.close();
    }
}
