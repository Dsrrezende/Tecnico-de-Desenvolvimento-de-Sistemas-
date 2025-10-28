package LogicaDeProgramacao.Java.Aula9.CalculaSalario;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularInss () {
        // 11% do salario
        return salario * 0.11;
    }

    public double calcularVT () {
        // 6% do salario
        return salario * 0.06;
    }

    public double salarioLiquido () {
        double inss = calcularInss();
        double valeTransp = calcularVT();
        // Salario menos os descontos
        return salario - inss - valeTransp;
    } 
}
