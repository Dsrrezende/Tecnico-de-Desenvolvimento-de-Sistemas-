package LogicaDeProgramacao.Java.Aula4;
import java.util.Scanner;

public class CalculadoraDeMediaVetor {
    public static void main(String[] args) {
        double [] notas = new double[4]; 
        double  media = 0;

        Scanner leia = new Scanner(System.in);
        for (int nota = 0; nota <notas.length;nota++){
            System.out.print("Digite a "+ (nota + 1) + "ª nota bimestral: ");
            notas[nota] = leia.nextDouble();
            media += notas [nota]/4; // ou media = media + notas [nota]/4;
        }
        System.out.printf("Sua média final é %.2f" , media);
        leia.close();
    }
}
