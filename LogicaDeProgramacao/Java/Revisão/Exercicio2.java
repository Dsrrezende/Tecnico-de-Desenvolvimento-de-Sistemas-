package LogicaDeProgramacao.Java.Revisão;
/*Peça ao usuário seu nome e idade, e exiba uma mensagem personalizada.
(Dica: use concatenação ou interpolação de strings.) */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String [] args){
        String nome;
        int idade;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        idade =sc.nextInt();

        System.out.printf("Olá %s, seja bem-vindo!!!\nSua idade é %d anos.",nome,idade);
        sc.close();
    }    
}
