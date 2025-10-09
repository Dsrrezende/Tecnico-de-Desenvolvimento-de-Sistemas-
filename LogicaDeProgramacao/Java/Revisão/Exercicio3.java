package LogicaDeProgramacao.Java.Revisão;
/*Peça ao usuário três notas e calcule a média. Informe se ele foi aprovado, em recuperação ou reprovado (use if/else). */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a Primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a Segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite a Terceira nota: ");
        nota3 = sc.nextDouble();

        media = (nota1+nota2+nota3)/3;

        if (media >= 6) {
            System.out.printf("Parabéns sua média foi %.2f você foi Aprovado!!!", media);
        }else if ( media <6 && media >= 4){
            System.out.printf("Ainda não foi dessa vez, sua média foi %.2f você esta de Recuperação!!!", media);
        }else{
            System.out.printf("Sua média foi %.2f Infelizmente você foi Reprovado!!!", media);
        }
        sc.close();
    }    
}
