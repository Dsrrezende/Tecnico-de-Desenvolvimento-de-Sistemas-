package LogicaDeProgramacao.Java.Aula3;
/*1. Criar uma nova classe com o nome ClassificadorDeIdade. 
Crie uma variável idade com um valor inicial (ex: 25) e use uma estrutura if-else
if-else para classificar e exibir no console se a pessoa é "Criança", "Adolescente", "Adulto" ou "Idoso". */
public class ClasseficadorDeIdade {
    public static void main(String[] args) {
        int idade =65;
        if (idade< 12) {
            System.out.println("Criança");
        }else if (idade < 18) {
            System.out.println(" Adolecente");
        }else if (idade < 65) {
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }
    }
    
}
