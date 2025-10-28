package LogicaDeProgramacao.Java.Aula10;

import LogicaDeProgramacao.Java.Aula10.FilaCircular.FilaCircular;
import LogicaDeProgramacao.Java.Aula10.Pilha.Pilha;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Daniel", 25);
        Pessoa p2 = new Pessoa("Pedro", 18);
        Pessoa p3 = new Pessoa("David", 20);
        Pessoa p4 = new Pessoa("Marco", 30);

        System.out.println("--- Pilha de pessoas ----");
        Pilha pilha = new Pilha(2);
        pilha.pop();
        pilha.push(p1);
        pilha.push(p2);

        System.out.println("Olhando o topo com peek: "+ pilha.peek().toString());
        pilha.pop();
        pilha.pop();
        pilha.pop();

        System.out.println("---- Fila de pessoas ----");
        FilaCircular fila = new FilaCircular(4);
        fila.dequeue();
        fila.enqueue(p1);
        fila.enqueue(p2);
        fila.enqueue(p3);
        fila.enqueue(p4);
        
        System.out.println("Olhando quem está na frente: "+ fila.front().toString());
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.enqueue(p1);
        fila.enqueue(p2);

    }
}