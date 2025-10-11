package LogicaDeProgramacao.Java.Trabalho.ECommerce;

import java.util.Scanner;

public class GerenciadorDeEstoque {
    
    public static void main(String[] args) {
        Produto [] produtos = new Produto [100];
        int quantidadeDeProdutos = 0;
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {

            System.out.println();
            System.out.println("###### Bem vindo ao MENU do Gerenciador De Estoque Artisan.IO ######");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos por código");
            System.out.println("3 - Listar Produtos por Preço");
            System.out.println("4 - Buscar Produto por Código");
            System.out.println("5 - Buscar Produto por Nome");
            System.out.println("6 - Sair\n");
            
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            System.out.println();
            sc.nextLine();

            switch (opcao) {
            
            case 1:// Cadastra os Produtos no Sistema
        
                if (quantidadeDeProdutos < produtos.length) {
                    long codigo;
                    while (true) {
                        try{
                            System.out.print("Código: ");
                            codigo = sc.nextLong();
                            sc.nextLine();
                            break;
                        }catch(Exception e){
                            System.out.println("Erro: digite um número inteiro válido para o código!");
                            sc.nextLine(); 
                        }
                    }

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Categoria: ");
                    String categoria = sc.nextLine();

                    double preco;
                    while (true) {
                        System.out.print("Preço: ");
                        try{
                            preco = sc.nextDouble();
                            sc.nextLine();
                            break;
                        }catch(Exception e){
                            System.out.println("Erro: digite um valor valido para o preço!");
                            sc.nextLine(); 
                        }
                    }

                    int quantidadeEmEstoque;
                    while (true) {
                        System.out.print("Quantidade em estoque: ");
                        try{
                            quantidadeEmEstoque = sc.nextInt();
                            sc.nextLine();
                            break;
                        }catch(Exception e){
                            System.out.println("Erro: digite um número inteiro válido para a quantidade em Estoque!");
                            sc.nextLine(); 
                        }
                    }

                    System.out.println();
                    
                    // Cria o produto e adiciona no vetor

                    produtos[quantidadeDeProdutos] = new Produto(codigo, nome, categoria, preco, quantidadeEmEstoque);
                    quantidadeDeProdutos++; // incrementa o contador

                    System.out.println("Produto cadastrado com sucesso!");

                }else{
                    System.out.println("Capacidade máxima de produtos atingida!");
                }
                break;

            case 2://Lista os Produtos Cadastrados por código
                if (quantidadeDeProdutos == 0) {
                    System.out.println("Não há produtos Cadastrados.");
                }else{
                    System.out.println("\n====Lista de Produtos Cadastrados====");

                    Produto[] produtosParaExibir = new Produto[quantidadeDeProdutos];// Cria um vetor temporário para não alterar o vetor principal

                    for (int i = 0; i < quantidadeDeProdutos; i++){
                        produtosParaExibir[i] = produtos[i];
                    }

                    Ordenador.ordenacaoPorCodigo(produtosParaExibir, quantidadeDeProdutos); //Ordena por codigo

                    for(int i = 0; i < quantidadeDeProdutos;i++){// exibo os produtos ordenados
                        Produto listagem = produtosParaExibir[i];
                        System.out.printf("Codigo: %d\nNome: %s\nCategoria: %s\nPreço: R$%.2f\nEstoque: %d"+"\n"
                        ,listagem.codigo,listagem.nome,listagem.categoria,listagem.preco,listagem.quantidadeEmEstoque);
                        System.out.println();
                    }
                }
                break;
            case 3: // Lista produtos ordenados por preço
                if (quantidadeDeProdutos == 0) {
                    System.out.println("Não há produtos cadastrados.");
                } else {
                    System.out.println("\n==== Lista de Produtos por Preço (Maior para Menor) ====");

                    Produto[] produtosParaExibir = new Produto[quantidadeDeProdutos];

                    // Cria uma cópia do vetor principal
                    for (int i = 0; i < quantidadeDeProdutos; i++) {
                        produtosParaExibir[i] = produtos[i];
                    }

                    // Ordena apenas o vetor temporário
                    Ordenador.ordenacaoPorPreco(produtosParaExibir, quantidadeDeProdutos);

                    System.out.println("\n====Lista de Produtos Ordenados por Preço====");

                    // Exibe os produtos ordenados
                    for (int i = 0; i < quantidadeDeProdutos; i++) {
                    Produto ordemPreco = produtosParaExibir[i];
                    System.out.printf("Código: %d\nNome: %s\nCategoria: %s\nPreço: R$%.2f\nEstoque: %d\n\n",
                        ordemPreco.codigo, ordemPreco.nome, ordemPreco.categoria, ordemPreco.preco, ordemPreco.quantidadeEmEstoque);
                    }
                }
                break;


            case 4://busca produtos por codigo
                System.out.println("Você escolheu buscar um produto pelo nome.");

                if (quantidadeDeProdutos == 0) {
                    System.out.println("Não há produtos cadastrados.");
                    break;
                }

                System.out.print("Digite o nome do produto que deseja buscar: ");
                String precoBuscado = sc.nextLine();

                // Cria um vetor temporário para não alterar o original
                Produto[] produtosParaBuscar = new Produto[quantidadeDeProdutos];
                for (int i = 0; i < quantidadeDeProdutos; i++) {
                    produtosParaBuscar[i] = produtos[i];
                }

                // Ordena o vetor temporário antes da busca binária
                Ordenador.ordenarPorNome(produtosParaBuscar, quantidadeDeProdutos);

                // Executa a busca binária no vetor temporário
                Produto produtoEncontrado = Buscador.buscaBinariaPorNome(produtosParaBuscar, precoBuscado, quantidadeDeProdutos);

                if (produtoEncontrado != null) {
                    System.out.println("\n==== Produto Encontrado ====");
                    System.out.printf("Código: %d\nNome: %s\nCategoria: %s\nPreço: R$%.2f\nEstoque: %d\n",
                        produtoEncontrado.codigo,
                        produtoEncontrado.nome,
                        produtoEncontrado.categoria,
                        produtoEncontrado.preco,
                        produtoEncontrado.quantidadeEmEstoque);
                } else {
                    System.out.println("Produto não localizado.");
                }

                break;

            case 5://Busca produtos por nome
                System.out.println("Você escolheu buscar um produto pelo nome.");
                if (quantidadeDeProdutos == 0) {
                    System.out.println("Não há Produtos cadastrados");
                    break;
                }
                System.out.print("Digite o nome do produto que deseja Buscar: ");
                String nomeBuscado = sc.nextLine();

                // Ordena o vetor antes da busca binária
                Ordenador.ordenarPorNome(produtos, quantidadeDeProdutos);

                // Busca binária
                Produto nomeencontrado = Buscador.buscaBinariaPorNome(produtos, nomeBuscado, quantidadeDeProdutos);
                if (nomeencontrado != null) {
                    System.out.println("\n====Produto Encontrado====");
                    System.out.printf("Código: %d\nNome: %s\nCategoria: %s\nPreço: R$%.2f\nEstoque: %d"+"\n"
                    ,nomeencontrado.codigo,nomeencontrado.nome,nomeencontrado.categoria,nomeencontrado.preco,nomeencontrado.quantidadeEmEstoque);

                }else{
                    System.out.println("Produto não Localizado.");
                }

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
