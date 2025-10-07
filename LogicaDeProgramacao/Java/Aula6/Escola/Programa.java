package LogicaDeProgramacao.Java.Aula6.Escola;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Escola senai = new Escola("Curso TI",10);
        String nome;
        int mat;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a nome do Aluno: ");
        nome = leia.nextLine();
        System.out.print("Digite a matrícula do Aluno: ");
        mat =leia.nextInt();

        Aluno novoAluno = new Aluno(nome,mat);
        senai.matricular((novoAluno));
        leia.close();

    }
}
