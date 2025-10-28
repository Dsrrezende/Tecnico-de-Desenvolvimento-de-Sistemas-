package LogicaDeProgramacao.Java.Aula10.Embarque;

import LogicaDeProgramacao.Java.Aula10.Pessoa;
import LogicaDeProgramacao.Java.Aula10.Embarque.Embarque;
import LogicaDeProgramacao.Java.Aula10.FilaCircular.FilaCircular;
import LogicaDeProgramacao.Java.Aula10.Pilha.Pilha;

/*
 * Simule o processo de embarque de um micro-ônibus que preenche os assentos de trás para frente. Crie uma Fila principal com 7 objetos Pessoa esperando. O veículo tem capacidade para 4 pessoas por vez. Para simular o embarque, você deve retirar as 4 primeiras pessoas da Fila (com dequeue()) e, uma a uma, adicioná-las a uma Pilha (com push()), que representa a área de entrada. Por fim, esvazie a Pilha (com pop()) para "sentar" as pessoas no ônibus, mostrando que a última pessoa a sair da fila foi, na verdade, a primeira a embarcar no veículo.
 */
public class Embarque {
    public static void main(String[] args) {
        int posicoes = 7;
        FilaCircular filaDeEntrada = new FilaCircular(posicoes);
        Pilha areaDeEmbarque = new Pilha(4);

        filaDeEntrada.enqueue(new Pessoa("Luis", 28));
        filaDeEntrada.enqueue(new Pessoa("David", 27));
        filaDeEntrada.enqueue(new Pessoa("Marco", 65));
        filaDeEntrada.enqueue(new Pessoa("José", 70));
        filaDeEntrada.enqueue(new Pessoa("Pedro", 20));
        filaDeEntrada.enqueue(new Pessoa("Thais", 20));
        filaDeEntrada.enqueue(new Pessoa("Andressa", 25));
        
        while(!filaDeEntrada.isEmpty()){
            for(int i = 0; i < 4 && !filaDeEntrada.isEmpty(); i++){
                System.out.println("A pessoa " + filaDeEntrada.front().getNome() + " está embarcando");
                Pessoa p = filaDeEntrada.dequeue();
                areaDeEmbarque.push(p);
            }
            while (!areaDeEmbarque.isEmpty()) {
                Pessoa p = areaDeEmbarque.pop();
                System.out.println("A pessoa " + p.getNome() + " sentou no ônibus");
            }
        }
    }
}