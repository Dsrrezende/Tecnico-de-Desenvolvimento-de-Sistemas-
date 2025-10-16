package LogicaDeProgramacao.Java.Trabalho.ECommerce;

import java.util.Scanner;

public class Funcoes {
    public static void cabecalho(){
        System.out.println("====== PLANO DA SITUAÇÃO DE APRENDIZAGEM ========");
        System.out.println("Segmento: Técnico");
        System.out.println("Unidade (s) Curricular (es): Lógica de programação");
        System.out.println("Curso (s): Técnico em Desenvolvimento de Sistemas");
        System.out.println("Instrutor (a): Marco Aurelio Hansen de Oliveira");
        System.out.println("Alunos: Douglas Rezende / Fernanda Nunes / Gabriel Lischt / Thaíssa");
        System.out.println("\nPressione ENTER para iniciar o Programa...");
        @SuppressWarnings("resource") // suprime aviso de Scanner não fechado
        Scanner tecla = new Scanner(System.in);
        tecla.nextLine();
        Util.limpa();
    }
    
    public static void exibirMenu() {
        System.out.println("\n###### Bem vindo ao Gerenciador De Estoque da Artisan.IO ######");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar Produtos por Código");
        System.out.println("3 - Listar Produtos por Preço");
        System.out.println("4 - Buscar Produto por Código");
        System.out.println("5 - Buscar Produto por Nome");
        System.out.println("6 - Sair do Programa\n");
        System.out.print("Digite a opção desejada: ");
    }
    
    public static int cadastrarProduto(Produto[] produtos, int quantidadeDeProdutos, Scanner sc) {
        if (quantidadeDeProdutos >= produtos.length) {
            Util.limpa();
            System.out.println("Capacidade máxima de produtos atingida!");
            Util.aguarde(3);
            Util.limpa();
            return quantidadeDeProdutos; // Retorna a quantidade sem alterações
        }
        Util.limpa();
        System.out.println("==== CADASTRO DE PRODUTO ====\n");
        
        // Entrada do código
        long codigo;
        while (true) {
            try {
                System.out.print("Código: ");
                codigo = sc.nextLong();
                sc.nextLine(); // limpar Scanner
                break;
            } catch (Exception e) {
                System.out.println("Erro: digite um número inteiro válido para o código!");
                sc.nextLine(); // limpar Scanner
                Util.aguarde(3);
                Util.limpa();
            }
        }
        
        // Verifica se o produto já existe pelo código
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            if (produtos[i].codigo == codigo) {
                
                System.out.println(produtos[i].nome+" já cadastrado.");
                System.out.println("Estoque atual: "+produtos[i].quantidadeEmEstoque);
                System.out.print("Digite a quantidade a adicionar ao estoque: ");
                
                int quantidadeAdicionar;
                while (true) {
                    try {
                        quantidadeAdicionar = sc.nextInt();
                        sc.nextLine();
                        break;
                    } catch (Exception e) {
                        System.out.print("Erro: digite um número inteiro válido para a quantidade: ");
                        sc.nextLine();
                        Util.aguarde(3);
                        Util.limpa();
                    }
                }
                produtos[i].quantidadeEmEstoque += quantidadeAdicionar;
                System.out.println("\nEstoque atualizado com sucesso!");
                Util.aguarde(3);
                Util.limpa();
                return quantidadeDeProdutos; // não adiciona novo produto
            }
            Util.limpa();
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
                sc.nextLine(); // limpar Scanner
                break;
            } catch (Exception e) {
                System.out.println("Erro: digite um valor válido para o preço!");
                sc.nextLine(); // limpar Scanner
                Util.aguarde(3);
                Util.limpa();
            }
        }
        
        // Entrada da quantidade em estoque
        int quantidadeEmEstoque;
        while (true) {
            try {
                System.out.print("Quantidade em estoque: ");
                quantidadeEmEstoque = sc.nextInt();
                sc.nextLine(); // limpar Scanner
                break;
            } catch (Exception e) {
                System.out.println("Erro: digite um número inteiro válido para a quantidade em estoque!");
                sc.nextLine(); // limpar Scanner
                Util.aguarde(3);
                Util.limpa();
            }
        }
        
        // Cria o produto e adiciona no vetor
        produtos[quantidadeDeProdutos] = new Produto(codigo, nome, categoria, preco, quantidadeEmEstoque);
        quantidadeDeProdutos++; // incrementa o contador
        Util.limpa();
        System.out.println("\nProduto cadastrado com sucesso!");
        Util.aguarde(2);
        Util.limpa();
        return quantidadeDeProdutos;
    }
 
    public static void listarProdutosPorCodigo(Produto[] produtos, int quantidadeDeProdutos) {
        if (quantidadeDeProdutos == 0) {
            System.out.println("Não há produtos cadastrados.");
            
            Util.aguarde(3);
            Util.limpa();
            return;
        }
        Util.limpa();
        System.out.println("\n==== Lista de Produtos Cadastrados por Código ====");
        
        // Cria uma cópia do vetor para não alterar o original
        Produto[] vetorCopia = new Produto[quantidadeDeProdutos];
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            Produto listaPorCodigo = produtos[i];
            vetorCopia[i] = new Produto(listaPorCodigo.codigo, listaPorCodigo.nome, listaPorCodigo.categoria, listaPorCodigo.preco, listaPorCodigo.quantidadeEmEstoque);
        }
        
        // Ordena por código
        Ordenador.ordenacaoPorCodigo(vetorCopia, quantidadeDeProdutos);
        
        // Exibe os produtos ordenados
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            Produto listaProduto = vetorCopia[i];
            System.out.printf("Código: %d\nNome: %s\nCategoria: %s\nPreço: R$%.2f\nEstoque: %d\n\n",
            listaProduto.codigo, listaProduto.nome, listaProduto.categoria, listaProduto.preco, listaProduto.quantidadeEmEstoque);
            System.out.println("----------------------------------------");
        }
        
        System.out.println("\nPressione ENTER para voltar ao menu...");
        @SuppressWarnings("resource") // suprime aviso de Scanner não fechado
        Scanner tecla = new Scanner(System.in);
        tecla.nextLine();
        
        
        Util.limpa();
    }
     
    public static void listarProdutosPorPreco(Produto[] produtos, int quantidadeDeProdutos) {
        if (quantidadeDeProdutos == 0) {
            Util.limpa();
            System.out.println("Não há produtos cadastrados.");
            Util.aguarde(3);
            Util.limpa();
            return;
        }
        Util.limpa();
        System.out.println("\n==== Lista de Produtos Cadastrados por Preço ====");
        
        // Cria uma cópia do vetor para não alterar o original
        Produto[] vetorCopia = new Produto[quantidadeDeProdutos];
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            Produto listarPorPreco = produtos[i];
            vetorCopia[i] = new Produto(listarPorPreco.codigo, listarPorPreco.nome, listarPorPreco.categoria, listarPorPreco.preco, listarPorPreco.quantidadeEmEstoque);
        }
        
        // Ordena por preço (InsertionSort)
        Ordenador.ordenacaoPorPreco(vetorCopia, quantidadeDeProdutos);
        
        // Exibe os produtos ordenados
        for(int i =0; i <vetorCopia.length; i++){
            Produto listaProduto = vetorCopia[i];
            System.out.printf("Código: %d\nNome: %s\nCategoria: %s\nPreço: R$%.2f\nEstoque: %d\n\n",
            listaProduto.codigo, listaProduto.nome, listaProduto.categoria, listaProduto.preco, listaProduto.quantidadeEmEstoque);
        }
        System.out.println("\nPressione ENTER para voltar ao menu...");
        @SuppressWarnings("resource") // suprime aviso de Scanner não fechado
        Scanner tecla = new Scanner(System.in);
        tecla.nextLine();
        Util.limpa();
    }
     
    public static void buscarProdutoPorCodigo(Produto[] produtos, int quantidadeDeProdutos, Scanner sc) {
        if (quantidadeDeProdutos == 0) {
            System.out.println("Não há produtos cadastrados.");
            Util.aguarde(3);
            Util.limpa();
            return;
        }
        Util.limpa();
        System.out.print("Digite o código do produto que deseja buscar! \n");
        
        long codigoBuscado;
        while (true) {
            try {
                System.out.print("Código: ");
                codigoBuscado = sc.nextLong();
                sc.nextLine(); // limpar Scanner
                break;
            } catch (Exception e) {
                System.out.println("Erro: digite um número inteiro válido para o código!");
                sc.nextLine(); // limpar Scanner
                Util.aguarde(3);
                Util.limpa();
                
            }
        }
        
        int indice = Buscador.buscaSequencial(produtos, codigoBuscado, quantidadeDeProdutos);
        Util.limpa();
        if (indice != -1) {
            Produto buscarProduto = produtos[indice];
            System.out.println("\n==== Produto Encontrado ====");
            System.out.printf("Código: %d\nNome: %s\nCategoria: %s\nPreço: R$%.2f\nEstoque: %d\n",
            buscarProduto.codigo, buscarProduto.nome, buscarProduto.categoria, buscarProduto.preco, buscarProduto.quantidadeEmEstoque);
            System.out.println("----------------------------------------");
        } else {
            System.out.println("Produto não localizado.");
        }
        System.out.println("\nPressione ENTER para voltar ao menu...");
        @SuppressWarnings("resource") // suprime aviso de Scanner não fechado
        Scanner tecla = new Scanner(System.in);
        tecla.nextLine();
        Util.limpa();
    }
      
    public static void buscarProdutoPorNome(Produto[] produtos, int quantidadeDeProdutos, Scanner sc) {
        if (quantidadeDeProdutos == 0) {
            System.out.println("Não há produtos cadastrados.");
            Util.aguarde(3);
            Util.limpa();
            return;
        }
        Util.limpa();
        System.out.print("Digite o nome do produto que deseja buscar: ");
        String nomeBuscado = sc.nextLine();
        
        // Ordena o vetor por nome antes da busca binária
        Ordenador.ordenarPorNome(produtos, quantidadeDeProdutos);
        
        // Executa a busca binária
        Produto encontrado = Buscador.buscaBinariaPorNome(produtos, nomeBuscado, quantidadeDeProdutos);
        Util.limpa();
        if (encontrado != null) {
            System.out.println("\n==== Produto Encontrado ====");
            System.out.printf("Código: %d\nNome: %s\nCategoria: %s\nPreço: R$%.2f\nEstoque: %d\n",
            encontrado.codigo, encontrado.nome, encontrado.categoria,encontrado.preco, encontrado.quantidadeEmEstoque);
            System.out.println("----------------------------------------");
            
        } else {
            System.out.println("Produto não localizado.");
        }
        System.out.println("\nPressione ENTER para voltar ao menu...");
        @SuppressWarnings("resource") // suprime aviso de Scanner não fechado
        Scanner tecla = new Scanner(System.in);
        tecla.nextLine();
        Util.limpa();
    }
    
    public static void opcaoInvalida (){
        Util.limpa();
        System.out.println("Opção inválida!");
        Util.aguarde(3);
        Util.limpa();
    }

    public static void fimDoPrograma(){
        Util.limpa();
        System.out.println("Gerenciador de estoque finalizado.\n");
        System.out.println("Desenvolvido e projetado pela equipe:");
        System.out.println("========================================");
        System.out.println("Artisan.IO - Equipe de Desenvolvimento 2025");
        System.out.println("========================================");
        Util.aguarde(10);
        Util.limpa();
    }

}
