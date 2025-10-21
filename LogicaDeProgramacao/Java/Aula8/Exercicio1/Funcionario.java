package LogicaDeProgramacao.Java.Aula8.Exercicio1;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public double calcularInss(){
        return salario * 0.11;
    }
    
    public double calcularValeTransporte(){
        return salario *0.06;
    }
}

