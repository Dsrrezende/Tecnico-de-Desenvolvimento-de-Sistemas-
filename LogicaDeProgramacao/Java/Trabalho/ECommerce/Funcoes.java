package LogicaDeProgramacao.Java.Trabalho.ECommerce;

import java.util.Scanner;

public class Funcoes {
    public static void exibirMenu() {
        System.out.println("\n###### MENU Gerenciador De Estoque Artisan.IO ######");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar Produtos por código");
        System.out.println("3 - Listar Produtos por Preço");
        System.out.println("4 - Buscar Produto por Código");
        System.out.println("5 - Buscar Produto por Nome");
        System.out.println("6 - Sair\n");
        System.out.print("Digite a opção desejada: ");
    }

    public static int cadastrarProduto(Produto[] produtos, int quantidadeDeProdutos, Scanner sc) {
        if (quantidadeDeProdutos >= produtos.length) {
            System.out.println("Capacidade máxima de produtos atingida!");
            return quantidadeDeProdutos; // Retorna a quantidade sem alterações
        }

        // Entrada do código
        long codigo;
        while (true) {
            try {
                System.out.print("Código: ");
                codigo = sc.nextLong();
                sc.nextLine(); // limpa buffer
                break;
            } catch (Exception e) {
                System.out.println("Erro: digite um número inteiro válido para o código!");
                sc.nextLine(); // limpa buffer
            }
        }

        // Entrada do nome
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        // Entrada da categoria
        System.out.print("Categoria: ");
        String categoria = sc.nextLine();

        // Entrada do preço
        double preco;
        while (true) {
            try {
                System.out.print("Preço: ");
                preco = sc.nextDouble();
                sc.nextLine(); // limpa buffer
                break;
            } catch (Exception e) {
                System.out.println("Erro: digite um valor válido para o preço!");
                sc.nextLine(); // limpa buffer
            }
        }

        // Entrada da quantidade em estoque
        int quantidadeEmEstoque;
        while (true) {
            try {
                System.out.print("Quantidade em estoque: ");
                quantidadeEmEstoque = sc.nextInt();
                sc.nextLine(); // limpa buffer
                break;
            } catch (Exception e) {
                System.out.println("Erro: digite um número inteiro válido para a quantidade em estoque!");
                sc.nextLine(); // limpa buffer
            }
        }

        // Cria o produto e adiciona no vetor
        produtos[quantidadeDeProdutos] = new Produto(codigo, nome, categoria, preco, quantidadeEmEstoque);
        quantidadeDeProdutos++; // incrementa o contador

        System.out.println("\nProduto cadastrado com sucesso!");
        return quantidadeDeProdutos;
    }


    public static void listarProdutosPorCodigo(Produto[] produtos, int quantidadeDeProdutos) {
        if (quantidadeDeProdutos == 0) {
            System.out.println("Não há produtos cadastrados.");
            return;
        }

        System.out.println("\n==== Lista de Produtos Cadastrados ====");

        // Cria uma cópia do vetor para não alterar o original
        Produto[] vetorCopia = new Produto[quantidadeDeProdutos];
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            vetorCopia[i] = produtos[i];
        }

        // Ordena por código
        Ordenador.ordenacaoPorCodigo(vetorCopia, quantidadeDeProdutos);

        // Exibe os produtos ordenados
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            Produto listaProduto = vetorCopia[i];
            System.out.printf("Código: %d\nNome: %s\nCategoria: %s\nPreço: R$%.2f\nEstoque: %d\n\n",
            listaProduto.codigo, listaProduto.nome, listaProduto.categoria, listaProduto.preco, listaProduto.quantidadeEmEstoque);
        }
    }


    public static void listarProdutosPorPreco(Produto[] produtos, int quantidadeDeProdutos) {
        if (quantidadeDeProdutos == 0) {
            System.out.println("Não há produtos cadastrados.");
            return;
        }

        System.out.println("\n==== Lista de Produtos por Preço ====");

        // Cria uma cópia do vetor para não alterar o original
        Produto[] vetorCopia = new Produto[quantidadeDeProdutos];
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            vetorCopia[i] = produtos[i];
        }

        // Ordena por preço (InsertionSort)
        Ordenador.ordenacaoPorPreco(vetorCopia, quantidadeDeProdutos);

        // Exibe os produtos ordenados
        for(int i =0; i <vetorCopia.length; i++){
            Produto listaProduto = vetorCopia[i]; 
            System.out.printf("Código: %d\nNome: %s\nCategoria: %s\nPreço: R$%.2f\nEstoque: %d\n\n",
            listaProduto.codigo, listaProduto.nome, listaProduto.categoria, listaProduto.preco, listaProduto.quantidadeEmEstoque);
        }
    }


    public static void buscarProdutoPorCodigo(Produto[] produtos, int quantidadeDeProdutos, Scanner sc) {
        if (quantidadeDeProdutos == 0) {
            System.out.println("Não há produtos cadastrados.");
            return;
        }

        System.out.print("Digite o código do produto que deseja buscar: ");
        long codigoBuscado = sc.nextLong();
        sc.nextLine(); // limpa buffer

        int indice = Buscador.buscaSequencial(produtos, codigoBuscado, quantidadeDeProdutos);

        if (indice != -1) {
            Produto buscarProduto = produtos[indice];
            System.out.println("\n==== Produto Encontrado ====");
            System.out.printf("Código: %d\nNome: %s\nCategoria: %s\nPreço: R$%.2f\nEstoque: %d\n",
            buscarProduto.codigo, buscarProduto.nome, buscarProduto.categoria, buscarProduto.preco, buscarProduto.quantidadeEmEstoque);
        } else {
            System.out.println("Produto não localizado.");
        }
    }


    public static void buscarProdutoPorNome(Produto[] produtos, int quantidadeDeProdutos, Scanner sc) {
        if (quantidadeDeProdutos == 0) {
            System.out.println("Não há produtos cadastrados.");
            return;
        }

        System.out.print("Digite o nome do produto que deseja buscar: ");
        String nomeBuscado = sc.nextLine();

        // Ordena o vetor por nome antes da busca binária
        Ordenador.ordenarPorNome(produtos, quantidadeDeProdutos);

        // Executa a busca binária
        Produto encontrado = Buscador.buscaBinariaPorNome(produtos, nomeBuscado, quantidadeDeProdutos);

        if (encontrado != null) {
            System.out.println("\n==== Produto Encontrado ====");
            System.out.printf("Código: %d\nNome: %s\nCategoria: %s\nPreço: R$%.2f\nEstoque: %d\n",
            encontrado.codigo, encontrado.nome, encontrado.categoria,encontrado.preco, encontrado.quantidadeEmEstoque);
        } else {
            System.out.println("Produto não localizado.");
        }
    }

}
