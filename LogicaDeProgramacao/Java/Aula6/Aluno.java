package LogicaDeProgramacao.Java.Aula6;
public class Aluno {
    String nome;
    int matricula;
    double notaFinal;
    
    void verificarAprovacao(){
        if (notaFinal >= 7.0){
            System.out.println(nome+" está APROVADO(A)!");
        }else{
            System.out.println(nome + " está em RECUPERAÇÃO!");
        }
    }
}
