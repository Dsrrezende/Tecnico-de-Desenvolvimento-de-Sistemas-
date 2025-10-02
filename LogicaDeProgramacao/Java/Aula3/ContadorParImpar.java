package LogicaDeProgramacao.Java.Aula3;
/*Crie uma classe ContadorParImpar. Use um laço for para iterar de 1 a 20. 
Dentro do laço, use uma estrutura if-else para verificar se o número atual é par 
ou ímpar e imprima a mensagem correspondente (ex:"O número 2 é par").*/
public class ContadorParImpar {
    public static void main(String[] args) {

        for(int i=1; i<=20; i++){
            if (i%2==0) {
                System.out.println("O número "+ i +" é par");
            }else{
                System.out.println("O número "+ i +" é ímpar");
            }
        }
    }
}
