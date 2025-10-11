package LogicaDeProgramacao.Java.Aula7.BuscaObjeto;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item [] itens = {
            new Item("Uva",10),
            new Item("Maça",8),
            new Item("Pera",12),
            new Item("Arroz",9),
            new Item("Batata",12),
            new Item("Milho",12),
        };
        
        String busca;
        for( int i = 0; i < itens.length; i++){
            System.out.println("- Nome: "+itens[i].nome+"- Valor: "+itens[i].valor);
        }
        System.out.println();

        BuscaObjeto.selectionSortPorNome(itens);
        System.out.print("\n\n\n");
        for (int i = 0; i < itens.length; i++) {
            System.out.println("- Nome: "+ itens[i].nome + " - Valor: " + itens[i].valor);
        }

        System.out.println();
        System.out.print("Digite um nome de produto para buscar: ");
        busca = sc.nextLine();

        Item encontrado = BuscaObjeto.buscaBinariaPorNome(itens, busca);

        if(encontrado == null){
           System.out.println("Item não encontrado...");
        }else {
            System.out.println("O item buscado é: " + encontrado.nome + " - R$ " + encontrado.valor);
            System.out.println();
        }

        sc.close();
    }
}
