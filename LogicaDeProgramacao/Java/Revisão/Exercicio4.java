package LogicaDeProgramacao.Java.Revisão;
/*Monte um menu simples no terminal:
1 - Somar
2 - Subtrair
3 - Multiplicar
4 - Sair
O usuário escolhe a opção, insere dois números, e o programa executa a operação.
(Use switch e laço while para repetir até que escolha sair.)*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0, num1, num2;

        while (opcao !=4) {
        System.out.println();
        System.out.println("Qual operação você gostaria de realizar?");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Sair");

        System.out.print("Digite a opção desejada: ");
        opcao = sc.nextInt();
        
        if (opcao == 4) break;
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro Número: ");
                    num1 = sc.nextInt();
                    System.out.print("Digite o segundo Número: ");
                    num2 = sc.nextInt();
                    int soma = num1 + num2;
                    System.out.printf("A soma de %d + %d = %d\n\n",num1,num2,soma);

                    break;

                case 2:
                    System.out.print("Digite o primeiro Número: ");
                    num1 = sc.nextInt();
                    System.out.print("Digite o segundo Número: ");
                    num2 = sc.nextInt();
                    int sub = num1 - num2;
                    System.out.printf("A subtração de %d - %d = %d\n\n",num1,num2,sub);

                    break;

                case 3:
                    System.out.print("Digite o primeiro Número: ");
                    num1 = sc.nextInt();
                    System.out.print("Digite o segundo Número: ");
                    num2 = sc.nextInt();
                    int mult = num1 * num2;
                    System.out.printf("A multiplicação de %d * %d = %d\n\n",num1,num2,mult);
                    
                    break;
                
                default:
                System.out.println("Opção invalida\n");

                break;

            }
        }

        System.out.println("Encerrando...");
        sc.close();
    }    
}
