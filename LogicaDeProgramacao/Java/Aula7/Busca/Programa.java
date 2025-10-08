package LogicaDeProgramacao.Java.Aula7.Busca;

public class Programa {
    public static void main(String[] args) {
        int [] vetor = {1,2,3,4,5,6,7,};
        int busca = 7;

        int posicao = Buscador.buscaBinaria(vetor,busca);
        if (posicao == -1){
            System.out.println("O número não está na lista");
        }else{
        System.out.printf("O item buscado etsá na posição: %d e é o item: %d ",posicao,vetor[posicao]);
        }
    }
}
