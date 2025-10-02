package LogicaDeProgramacao.Java.Aula5;
public class Aluno {
    
    String nome;
    int matricula;
    double notaFinal;
    
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
    
        aluno1.nome = "Carlos Pereira";
        aluno1.matricula = 201;
        aluno1.notaFinal = 7.5;
    
        System.out.println("Matricula do aluno: "+ aluno1.matricula);
    }
}

