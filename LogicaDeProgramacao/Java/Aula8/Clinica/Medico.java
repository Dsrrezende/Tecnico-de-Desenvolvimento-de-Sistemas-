package LogicaDeProgramacao.Java.Aula8.Clinica;

public class Medico {
    private int crm;
    private String nome;
    private double salario;
    private double valorConsulta;
    private static int totalMedicos;

    public void pagamentoDinheiro(){
        this.salario += this.valorConsulta;
    }

    public void pagamentoPlano(){
        this.salario += this.valorConsulta * 0.8;
    }

    public Medico(int crm, String nome, double salario, double valorConsulta) {
        this.crm = crm;
        this.nome = nome;
        this.salario = salario;
        this.valorConsulta = valorConsulta;
        totalMedicos += 1;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
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
        if(salario > 0){
            this.salario = salario;
        }else{
            System.out.println("Salário não pode ser negativo!");
        }
    }
    public void setValorConsulta(double valorConsulta) {
        if(valorConsulta > 0){
            this.valorConsulta = valorConsulta;
        }else{
            System.out.println("Valor da consulta não pode ser negativo!");
        }
    }

    public double getValorConsulta() {
        return valorConsulta;
    }


    public static int getTotalMedicos() {
        return totalMedicos;
    }

    public static void setTotalMedicos(int totalMedicos) {
        Medico.totalMedicos = totalMedicos;
    }

    

}
