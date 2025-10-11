package LogicaDeProgramacao.Java.Trabalho.ECommerce;

import java.util.Scanner;

public class GerenciadorDeEstoque {
    
    public static void main(String[] args) {
        Produto [] produtos = new Produto [100];
        int quantidadeDeProdutos = 0;
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {

            Funcoes.exibirMenu();
            opcao = sc.nextInt();
            System.out.println();
            sc.nextLine();

            switch (opcao) {
            
            case 1:// Cadastra os Produtos no Sistema
        
                Funcoes.cadastrarProduto(produtos, quantidadeDeProdutos, sc);
                break;

            case 2://Lista os Produtos Cadastrados por código

                Funcoes.buscarProdutoPorCodigo(produtos, quantidadeDeProdutos, sc);
                break;

            case 3: // Lista produtos ordenados por preço

                Funcoes.listarProdutosPorPreco(produtos, quantidadeDeProdutos);
                break;

            case 4://busca produtos por codigo
                
                Funcoes.buscarProdutoPorCodigo(produtos, quantidadeDeProdutos, sc);

                break;

            case 5://Busca produtos por nome
                
                Funcoes.buscarProdutoPorNome(produtos, quantidadeDeProdutos, sc);
                
                break;


            case 6://Opção para saída do sistema
                System.out.println("Saindo do sistema...");
                break;

            default://Opção para caso o usuario digite uma opção inválida
                System.out.println("Opção inválida!");
            }
            
        } while (opcao != 6);
        sc.close();
    }
}
