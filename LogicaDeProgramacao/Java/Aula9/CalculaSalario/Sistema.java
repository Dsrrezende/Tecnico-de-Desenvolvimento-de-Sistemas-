package LogicaDeProgramacao.Java.Aula9.CalculaSalario;

public class Sistema {
    public static void main(String[] args) {
        Funcionario jose = new Funcionario("José da Silva", 5000);
        System.out.println("---- Demonstrativo de pagamento ----");
        System.out.printf("Nome: %s \nSalário Bruto: %.2f\nINSS: %.2f\nVale transporte: %.2f\nSalário Liquido: %.2f", jose.getNome(),jose.getSalario(), jose.calcularInss(), jose.calcularVT(), jose.salarioLiquido());
    }
}
