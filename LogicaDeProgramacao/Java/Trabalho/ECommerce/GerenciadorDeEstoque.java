package LogicaDeProgramacao.Java.Trabalho.ECommerce;

import java.util.Scanner;

public class GerenciadorDeEstoque {
    
    public static void main(String[] args) {
        Produto [] produtos = new Produto [100];
        int quantidadeProdutos = 0;
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {

            System.out.println();
            System.out.println("###### Bem vindo ao MENU do Gerenciador De Estoque Artisan.IO ######");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Buscar Produto por Código");
            System.out.println("4 - Buscar Produto por Nome");
            System.out.println("5 - Sair\n");
            
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            System.out.println();
            sc.nextLine();

            switch (opcao) {
            
            case 1:
                if (quantidadeProdutos < produtos.length) {
                    System.out.print("Código: ");
                    long codigo = sc.nextLong();
                    sc.nextLine(); // limpar buffe

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Categoria: ");
                    String categoria = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade em estoque: ");
                    int quantidadeEmEstoque = sc.nextInt();

                    System.out.println();
                    
                    // Cria o produto e adiciona no vetor

                    produtos[quantidadeProdutos] = new Produto(codigo, nome, categoria, preco, quantidadeEmEstoque);
                    quantidadeProdutos++; // incrementa o contador

                    System.out.println("Produto cadastrado com sucesso!");

                }else{
                    System.out.println("Capacidade máxima de produtos atingida!");
                }
                break;

            case 2:
                if (quantidadeProdutos == 0) {
                    System.out.println("Não há produtos Cadastrados.");
                }else{
                    System.out.println("\n====Lista de Produtos====");
                    for(int i = 0; i < quantidadeProdutos;i++){
                        Produto listagem = produtos[i];
                        System.out.printf("Codigo: %d\nNome: %s\nCategoria: %s\nPreço: R$%.2f\nEstoque: %d"+"\n"
                        ,listagem.codigo,listagem.nome,listagem.categoria,listagem.preco,listagem.quantidadeEmEstoque);
                    }
                }
                break;

            case 3:
                System.out.println("Você escolheu buscar um produto pelo código.");
                // Lógica de busca sequencial na próxima seção
                break;

            case 4:
                System.out.println("Você escolheu buscar um produto pelo nome.");
                // Lógica de busca binária na próxima seção
                break;

            case 5:
                System.out.println("Saindo do sistema...");
                break;

            default:
                System.out.println("Opção inválida!");
            }
            
        } while (opcao != 5);
        sc.close();
    }
}
