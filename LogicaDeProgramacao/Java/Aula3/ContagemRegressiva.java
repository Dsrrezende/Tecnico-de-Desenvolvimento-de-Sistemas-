package LogicaDeProgramacao.Java.Aula3;
/*Crie uma classe ContagemRegressiva. Declare uma variável inicio e atribua um valor (ex: 10). 
Use um laço while para imprimir a contagem regressiva de inicio até 1.*/
public class ContagemRegressiva {
    public static void main(String[] args) {
        int inicio = 10;
        while (inicio > 0) {
            System.out.println(inicio);
            inicio--;   
        }
    }
}