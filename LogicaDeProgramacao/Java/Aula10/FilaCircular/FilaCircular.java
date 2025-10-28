package LogicaDeProgramacao.Java.Aula10.FilaCircular;

import LogicaDeProgramacao.Java.Aula10.Pessoa;

public class FilaCircular {
    private Pessoa[] elementos;
    private int capacidade;
    private int tamanho;
    private int inicio;
    private int fim;

    public FilaCircular(int capacidade){
        this.elementos = new Pessoa[capacidade];
        this.capacidade = capacidade;
        this.tamanho = 0; 
        this.inicio = 0;
        this.fim = -1;
    }
    public void enqueue(Pessoa elemento){
        if(tamanho == capacidade){
            System.out.println("A fila está cheia! Não foi possível adicionar a pessoa: "+ elemento.getNome());
            return;
        }
        fim = (fim +1)%capacidade;
        // System.out.println((fim +1)%capacidade + "Fim");
        elementos[fim] = elemento;
        tamanho++;
        // System.out.println("A pessoa:  "+ elemento.getNome() + " foi adicionada no final da fila!");
    }

    public Pessoa dequeue(){
        if(isEmpty()){
            System.out.println("A fila está vazia!");
            return null;
        }
        Pessoa p = elementos[inicio];
        elementos[inicio] = null;
        inicio = (inicio + 1)%capacidade;
        // System.out.println((inicio + 1)%capacidade + "Inicio");
        tamanho--;
        // System.out.println("A pessoa " + p.getNome() + " foi removida do inicio da fila!");
        return p;
    }

    public Pessoa front(){
        if(isEmpty()){
            // System.out.println("A fila está vazia!");
            return null;
        }
        return elementos[inicio];
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }
    public int tamanho(){
        return tamanho;
    }

    public void MostrarFila(){
        for(int i = 0; i < tamanho; i++){
            System.out.printf("%dº -%s;\n", i+1, elementos[i].getNome());
        }
    }
}
