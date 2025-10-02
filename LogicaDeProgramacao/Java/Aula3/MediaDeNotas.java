package LogicaDeProgramacao.Java.Aula3;
import java.util.Scanner;
public class MediaDeNotas {
    public static void main(String[] args) {
        float notas, media; 
        float soma = 0f;
        float cont = 0f;
        
        Scanner leia =new Scanner(System.in);
        for( int i = 1; i <=5; i ++){
            System.out.print("Digite a " + i +"ª nota: ");
            notas = leia.nextFloat();
            if (notas > 10) {
                continue;
            }else if (notas < 0) {
                break;
            }
            soma = soma + notas;
            cont++;
        }
        leia.close();
        media = soma/cont;
        if (soma> 0) {
            System.out.println("A média das soma das notas é: "+ media);
        }else{
            System.out.println("Programa Interrompido!!!");
        }
    }
}
