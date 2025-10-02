package LogicaDeProgramacao.Java.Aula5;
import java.util.Scanner;

public class Aluno2 {
    String nome;
    int matricula;
    double notaFinal;
        
    public static void main(String[] args) {
        Aluno2 [] Turma = new Aluno2[3];
        Scanner leia = new Scanner(System.in);
        
        for (int i=0; i< Turma.length; i++){
            Turma[i] = new Aluno2();

            System.out.print("Digite o nome do "+(i+1)+ "º Aluno: ");
            Turma[i].nome= leia.next();
            System.out.print("Digite a matricula do "+(i+1)+ "º Aluno: ");
            Turma[i].matricula= leia.nextInt();
            System.out.print("Digite a nota final do "+(i+1)+ "º Aluno: ");
            Turma[i].notaFinal= leia.nextDouble();
        }
        for(int i=0; i<Turma.length;i++){
            System.out.printf("Dados do %dº Aluno são: \n Nome: %s \n matricula: %d \n Nota: %.2f \n",i+1, Turma[i].nome,Turma[i].matricula,Turma[i].notaFinal);
        }
        leia.close();
    }
}
