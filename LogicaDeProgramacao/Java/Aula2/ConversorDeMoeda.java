package LogicaDeProgramacao.Java.Aula2;
/*Exercicio 2 --> criar nova classe com o nome ConversorDeMoedas. Crie uma variavel
 * valorEmDolar e uma taxaDeCambio (ex:5.25).
 * calcule e exiba o valor convertido para reais (R$)no ocnsole.
 * deverá ser impresso no console o seguinte resultado:
 * O Valor em reais (R$) é: 262.5 */

public class ConversorDeMoeda {
    public static void main(String[] args) {
        double valorEmDolar = 100;
        double taxaDeCambio = 5.25;
        double reais = valorEmDolar*taxaDeCambio;

        System.out.println("O valor em Reais (R$) é: "+reais);
    }
}
