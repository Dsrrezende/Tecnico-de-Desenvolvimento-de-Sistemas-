package LogicaDeProgramacao.Java.Aula9.CalculaImposto;

public class Produto {
    private String descricao;
    private double valor;
    private int qtd;
    
    public Produto(String descricao, double valor, int qtd) {
        this.descricao = descricao;
        setValor(valor);
        setQtd(qtd);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor > 0){
            this.valor = valor;
        }else{
            System.out.println("O valor precisa ser positivo, tente novamente!");
        }
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        if(qtd > 0){
            this.qtd = qtd;
        }else {
            System.out.println("A quantidade precisa ser maior que zero, tente novamente!");
        }
    }

    public double calculaTotal(){
        return valor * qtd;
    }

    public double calulaICMS(){
        double total = calculaTotal();
        return total * 0.12;
    }

}