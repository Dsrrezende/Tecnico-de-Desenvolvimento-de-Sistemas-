package LogicaDeProgramacao.Java.Aula10.Pilha;

import LogicaDeProgramacao.Java.Aula10.Pessoa;

public class Pilha {
    private Pessoa[] elementos;
    private int topo;
    private int capacidade;
    public Pilha(int capacidade){
        this.capacidade=capacidade;
        this.elementos = new Pessoa[capacidade];
        this.topo = -1;
    }
    public void push(Pessoa elemento){
        if(topo == capacidade-1){
            System.out.println("A pilha está cheia! Não foi possível adicionar a pessoa: "+ elemento.getNome());
            return;
        }
        topo++;
        elementos[topo] = elemento;
        // System.out.println("A pessoa:  "+ elemento.getNome() + " foi adicionada no topo da pilha!");
    }
    public Pessoa peek(){
        if(isEmpty()){
            System.out.println("A pilha está vazia!");
            return null;
        }
        return elementos[topo];
    }
    public Pessoa pop(){
        if(isEmpty()){
            System.out.println("A pilha está vazia!");
            return null;
        }
        Pessoa p = elementos[topo];
        elementos[topo] = null;
        topo--;
        // System.out.println("A pessoa " + p.getNome() + " foi removida do topo da pilha!");
        return p;
    }
    public boolean isEmpty(){
        return topo == -1;
    }
    public int tamanho(){
        return topo + 1;
    }

    public void MostrarPilha(){
        for(int i = topo; i >=0; i--){
            System.out.printf("%dº -%s;\n", i+1, elementos[i].getNome());
        }
    }
}
