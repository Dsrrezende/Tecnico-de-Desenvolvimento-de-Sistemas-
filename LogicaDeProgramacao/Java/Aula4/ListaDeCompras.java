package LogicaDeProgramacao.Java.Aula4;
//Biblioteca
import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String[] args) {
        String [] listaMercado = new String [5];

        //entrada de dados e incersão de dadosno vetor
        Scanner entrada = new Scanner(System.in);
        for(int lista = 0 ; lista <listaMercado.length; lista++ ){
            System.out.print("Digite o "+ (lista + 1) +"º item da lista de supermecado: ");
            listaMercado[lista] = entrada.nextLine();
        }
        //Laço for utilizado para percorrer meu vetor e Apresentar a listagem na tela
        for(int lista = 0 ; lista < listaMercado.length; lista++ ){
            System.out.println("Item "+ (lista + 1) +": "+ listaMercado[lista]);
        }
        //Outra forma de Apresentar o resultado
        System.out.println();
        for (String item : listaMercado) {
        System.out.println(item);
        }

        entrada.close();
    }
}
