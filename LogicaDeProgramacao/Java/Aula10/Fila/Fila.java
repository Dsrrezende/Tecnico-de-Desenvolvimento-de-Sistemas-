package LogicaDeProgramacao.Java.Aula10.Fila;

import LogicaDeProgramacao.Java.Aula10.Pessoa;

public class Fila {
    private Pessoa[] elementos;
    private int tamanho;
    private int capacidade;
    public Fila(int capacidade){
        this.capacidade = capacidade;
        this.elementos = new Pessoa[capacidade];
        this.tamanho = 0;
    }
    public void enqueue(Pessoa elemento){
        if(tamanho == capacidade){
            System.out.println("A fila está cheia! Não foi possível adicionar a pessoa: "+ elemento.getNome());
            return;
        }
        elementos[tamanho]= elemento;
        tamanho++;
        System.out.println("A pessoa:  "+ elemento.getNome() + " foi adicionada no final da fila!");
    }
    public Pessoa dequeue(){
        if(isEmpty()){
            System.out.println("A fila está vazia!");
            return null;
        }
        Pessoa p = elementos[0];
        // desloca todos para frente
        for(int i = 0; i < tamanho-1; i++){
            elementos[i] = elementos[i+1];
        }
        elementos[tamanho - 1] = null;
        tamanho--;
        System.out.println("A pessoa " + p.getNome() + " foi removida do inicio da fila!");
        return p;
    }

    public Pessoa front(){
        if(isEmpty()){
            System.out.println("A fila está vazia!");
            return null;
        }
        return elementos[0];
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