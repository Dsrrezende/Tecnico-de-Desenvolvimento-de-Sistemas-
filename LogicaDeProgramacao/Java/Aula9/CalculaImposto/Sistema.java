package LogicaDeProgramacao.Java.Aula9.CalculaImposto;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar = "";
        do {
            System.out.println("Produto:");
            String desc = sc.next();
            System.out.println("Valor:");
            double valor = sc.nextDouble();
            System.out.println("Quantidade:");
            int qtd = sc.nextInt();
            Produto produto = new Produto(desc, valor, qtd);
            System.out.printf("Descrição: %s\nValor: R$%.2f\nTotal: R$%.2f\nICMS:R$%.2f\n\n", produto.getDescricao(), produto.getValor(), produto.calculaTotal(), produto.calulaICMS());
            System.out.println("Deseja encerrar o programa? (S/N)");
            continuar = sc.next();
        }while(!continuar.equalsIgnoreCase("S"));
        sc.close();
    }
}
