package LogicaDeProgramacao.Java.Aula10.Desfazer;

import java.util.Scanner;

import LogicaDeProgramacao.Java.Aula10.Pessoa;
import LogicaDeProgramacao.Java.Aula10.Pilha.Pilha;


/*
 *  Implemente um sistema simples de "desfazer cadastro" para um evento, usando sua Pilha. O programa deve criar uma Pilha com capacidade para 5 pessoas e simular o cadastro de três Pessoa (Ana, Bruno, Carla) usando o método push(). Após os cadastros, o programa deve simular um usuário clicando no botão "desfazer" duas vezes, o que deve executar o método pop() duas vezes, removendo Carla e depois Bruno, provando que o último a se cadastrar é o primeiro a ser removido.
 */

public class Desfazer {
    public static void main(String[] args) {
        Pilha cadastros = new Pilha(5);
        String opcao;
        Scanner sc = new Scanner(System.in);

        cadastros.push(new Pessoa("Ana", 34));
        cadastros.push(new Pessoa("José", 24));
        cadastros.push(new Pessoa("Maria", 29));

        while (!cadastros.isEmpty()) {
            System.out.println("Deseja desfazer o cadastro?(S/N)");
            opcao = sc.next();
            if(opcao.equalsIgnoreCase("S")){
                Pessoa p = cadastros.pop();
                System.out.println("A pessoa " + p.getNome() + " foi removida do sistema");
            }else{
             continue;   
            }
        }
        System.out.println("Todas as pessoas cadastradas foram removidas!");
        sc.close();
    }
}