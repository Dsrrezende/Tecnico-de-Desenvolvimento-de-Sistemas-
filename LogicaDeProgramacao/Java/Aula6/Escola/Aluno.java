package LogicaDeProgramacao.Java.Aula6.Escola;
public class Aluno {
    String nome;
    int matricula;
    double nota;

    public Aluno (String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        
    }
    
    void verificarAprovacao(){
        if (nota >= 7.0){
            System.out.println(nome+" está APROVADO(A)!");
        }else{
            System.out.println(nome + " está em RECUPERAÇÃO!");
        }
    }
    void mostrarDados(int num){
        System.out.println();
        System.out.printf("Dados do %dº Aluno sã: \nNome: %s \nMatricula: %d \nNota: %.2f\n",num,nome,matricula,nota);
    }
}
