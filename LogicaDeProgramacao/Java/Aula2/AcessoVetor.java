package LogicaDeProgramacao.Java.Aula2;
public class AcessoVetor {
    public static void main(String[] args) {
        double[] notas = new double [4];
        notas [0] = 7.5;
        notas[1]= 8.0;

        System.out.println("nota doo 1º Bimestre; "+notas[0]);

        notas[0] = 8.5;
        System.out.println("nota corrigida do primeiro bimestre: "+notas[1]);
    }
}
