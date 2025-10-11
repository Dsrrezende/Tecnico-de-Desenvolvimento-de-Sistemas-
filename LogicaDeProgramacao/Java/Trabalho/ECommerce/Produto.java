package LogicaDeProgramacao.Java.Trabalho.ECommerce;

public class Produto {
    //Atributos
    long codigo;
    String nome;
    String categoria;
    double preco;
    int quantidadeEmEstoque ;
    
    //Construtor
    public Produto (long codigo, String nome, String categoria, double preco, int quantidadeEmEstoque){
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

}
