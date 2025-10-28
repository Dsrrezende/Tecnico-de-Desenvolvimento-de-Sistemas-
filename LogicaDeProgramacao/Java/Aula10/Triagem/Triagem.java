package LogicaDeProgramacao.Java.Aula10.Triagem;

import LogicaDeProgramacao.Java.Aula10.Pessoa;
import LogicaDeProgramacao.Java.Aula10.FilaCircular.FilaCircular;

/*
 * 1. Triagem de Vacinação (Duas Filas) Desenvolva um programa que simule a triagem de uma fila de vacinação. Primeiro, crie uma Fila principal e adicione 5 objetos Pessoa com idades variadas (ex: 25, 65, 40, 70, 30). Em seguida, crie duas novas filas: FilaPrioridade e FilaComum. Processe a fila principal removendo uma pessoa de cada vez: se a idade da Pessoa for 60 anos ou mais, ela deve ser adicionada à FilaPrioridade; caso contrário, deve ir para a FilaComum. Ao final, imprima o estado das duas filas de destino.
 */

public class Triagem {
    public static void main(String[] args) {
        int posicoes = 5;
        FilaCircular filaDeEntrada = new FilaCircular(posicoes);
        FilaCircular filaPrioridade = new FilaCircular(posicoes);
        FilaCircular filaComum = new FilaCircular(posicoes);

        filaDeEntrada.enqueue(new Pessoa("Luis", 28));
        filaDeEntrada.enqueue(new Pessoa("David", 27));
        filaDeEntrada.enqueue(new Pessoa("Marco", 65));
        filaDeEntrada.enqueue(new Pessoa("José", 70));
        filaDeEntrada.enqueue(new Pessoa("Pedro", 20));

        int tamanho = filaDeEntrada.tamanho();

        for (int i = 0; i < tamanho; i++){
            Pessoa p = filaDeEntrada.dequeue();
            if(p.getIdade() >= 60){
                filaPrioridade.enqueue(p);
            }else{
                filaComum.enqueue(p);
            }
        }

        System.out.println("As pessoas na fila preferencial são: ");
        filaPrioridade.MostrarFila();
        System.out.println("As pessoas na fila comum são: ");
        filaComum.MostrarFila();
    }
}
