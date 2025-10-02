package LogicaDeProgramacao.Java.Aula6;
import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Aluno [] Turma = new Aluno[3];
        Scanner leia = new Scanner(System.in);
        
        for (int i=0; i< Turma.length; i++){
            Turma[i] = new Aluno();

            System.out.print("Digite o nome do "+(i+1)+ "º Aluno: ");
            Turma[i].nome= leia.next();
            System.out.print("Digite a matricula do "+(i+1)+ "º Aluno: ");
            Turma[i].matricula= leia.nextInt();
            System.out.print("Digite a nota final do "+(i+1)+ "º Aluno: ");
            Turma[i].notaFinal= leia.nextDouble();
        }
        for(int i=0; i<Turma.length;i++){
            System.out.println();
            System.out.printf("Dados do %dº Aluno são: \n Nome: %s \n matricula: %d \n Nota: %.2f \n",i+1, Turma[i].nome,Turma[i].matricula,Turma[i].notaFinal);
            Turma[i].verificarAprovacao();
        }

        leia.close();
    }
}
