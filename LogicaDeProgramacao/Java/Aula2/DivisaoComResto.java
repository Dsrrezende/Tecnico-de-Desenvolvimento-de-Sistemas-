package LogicaDeProgramacao.Java.Aula2;
/*Exercicio 3 -->criar uma nova classe com o nome DivisãoComResto. Crie duas variaveis inteiras, totalDeItens (Ex;17) e capacidadeDaCaixa (Ex: 5)
 * calcule quantas caixas serão prenchidascompletamente e quantos itens sobrarão.
 * deverá ser impresso no console o seguinte resultado: 
 * serão preenchidas 3 caixas
 * sobrarão w itens.*/

public class DivisaoComResto {
    public static void main(String[] args) {
        int totalDeItens = 17;
        int capacidadeDaCaixa = 5;
        int resto = totalDeItens % capacidadeDaCaixa;
        int divisao =totalDeItens/capacidadeDaCaixa;
        System.out.println("Serão preenchidas "+ divisao + " Caixas");
        System.out.println("Sobrarão "+ resto + " Itens");
    }
}
