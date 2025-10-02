package LogicaDeProgramacao.Java.Aula1;
/*Exemplo de Declaração de Vetor */
public class DeclaracaoVetor {
    public static void main(String[] args) {
        //1. Apenas declarando e instanciando ( valores padrão)
        int[] numeros = new int[5]; // Vetor com 5 posições, todas valendo 0

        //2. Declarando e inicializando com valores
        String [] nomes = {"Anna", "Carlos", "Douglas"};//Vetor com 3 posições

        System.out.println("Tamanho do vetor de números: "+ numeros.length);
        System.out.println("Primeiro nome: "+ nomes[0]);
    }
}
