package LogicaDeProgramacao.Java.Aula8.Exercicio1;

public class Programa {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("Douglas",2000);

        System.out.println("Funcionário: "+ funcionario.nome);
        System.out.println("Salário: "+ funcionario.salario);
        System.out.println("Inss: "+ funcionario.calcularInss());
        System.out.println("Vale Transporte: "+ funcionario.calcularValeTransporte());
        System.out.println("Salário Líquido: "+(funcionario.salario-funcionario.calcularInss()-funcionario.calcularValeTransporte()));
        
    }

}
