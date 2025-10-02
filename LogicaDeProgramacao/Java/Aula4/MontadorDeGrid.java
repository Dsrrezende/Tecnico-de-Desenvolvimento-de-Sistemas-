package LogicaDeProgramacao.Java.Aula4;
import java.util.Scanner;

public class MontadorDeGrid {
    public static void main(String[] args) {
        int [][] matriz = new int [3][3];

        Scanner Leia = new Scanner(System.in);
        for(int i = 0; i< matriz.length;i++){
            for(int j = 0; j< matriz.length;j++){
                System.out.print("Digite o número na posição ["+(i+1)+"ª] Linha e ["+(j+1)+"ª] Coluna: ");
                
                matriz [i][j] = Leia.nextInt();
            }
        }
        for(int i=0 ;i < matriz.length;i ++){
            System.out.println();
            for(int j=0 ;j < matriz.length;j ++){
                System.out.print(" | "+matriz [i][j]+" | ");
            }
            Leia.close();
        }   
    }
}