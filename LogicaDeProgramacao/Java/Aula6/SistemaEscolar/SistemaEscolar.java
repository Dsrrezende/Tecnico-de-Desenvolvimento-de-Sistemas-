package LogicaDeProgramacao.Java.Aula6.SistemaEscolar;
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
            Turma[i].nota= leia.nextDouble();
        }
        for(int i=0; i<Turma.length;i++){
            
            Turma[i].mostrarDados(i+1);
            Turma[i].verificarAprovacao();
        }

        leia.close();
    }
}
