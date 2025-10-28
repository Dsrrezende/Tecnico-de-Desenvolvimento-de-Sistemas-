package LogicaDeProgramacao.Java.Aula8.Clinica;

import java.util.Scanner;

public class Clinica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medico medico1 = new Medico(12345, "Ana Maria", 0, 250);
        Medico medico2 = new Medico(45678, "Antonio", 0, 300);
        Medico medico3 = new Medico(8985, "José", 0, 350);
        double consulta;

        System.out.println("--- Sistema Clinica ---");
        System.out.printf("Adicione o novo valor da consulta do médico %s:", medico2.getNome());
            if(sc.hasNextDouble()){
                consulta = sc.nextDouble();
                medico2.setValorConsulta(consulta);
            }else{
                System.out.println("Entrada inválida");
            }

        medico1.pagamentoDinheiro();
        medico2.pagamentoPlano();
        medico3.pagamentoPlano();

        System.out.println("Nome: " + medico1.getNome() + " Salario: " + medico1.getSalario());
        System.out.println("Nome: " + medico2.getNome() + " Salario: " + medico2.getSalario());
        System.out.println("Nome: " + medico3.getNome() + " Salario: " + medico3.getSalario());
        System.out.println("Total de médicos cadastrados: " + Medico.getTotalMedicos());
        sc.close();
    }
}
