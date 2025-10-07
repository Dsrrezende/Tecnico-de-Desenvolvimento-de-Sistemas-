package LogicaDeProgramacao.Java.Aula6.Escola;

public class Escola {
    String nomeDoCurso;
    String sigla;
    Aluno [] alunosMatriculados;
    int vagasOcupadas = 0;

    public Escola (String nome, int totalDeVagas){
        this.nomeDoCurso = nome;
        this.alunosMatriculados = new Aluno [totalDeVagas];
    }
    public void matricular(Aluno novAluno){
        if (vagasOcupadas <  alunosMatriculados.length){
            alunosMatriculados [vagasOcupadas] = novAluno;
            vagasOcupadas ++;
            System.out.println("Matrícula de "+ novAluno.nome+ " Realizada com sucesso.");
        }else{
            System.out.println("Não há vagas disponíveis");
        }
    }
}
