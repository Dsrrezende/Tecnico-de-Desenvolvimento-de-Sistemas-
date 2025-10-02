package LogicaDeProgramacao.Java.Aula3;
import java.util.Scanner;
public class MediaDeNotasVersaoProfessor {
    public static void main(String[] args) {
        float notas; 
        float soma = 0f;
        int cont =0;
        
        Scanner leia =new Scanner(System.in);
        for( int i = 1; i < 5; i ++){
            System.out.print("Digite a " + i +"ª nota: ");
            notas = leia.nextFloat();
            if (notas > 10) {
                continue;
            }else if (notas < 0) {
                break;
            }
            soma += notas;
            cont ++;
        }
        System.out.println("A média das soma das notas é: "+ soma/cont);
        leia.close();
    }
}
