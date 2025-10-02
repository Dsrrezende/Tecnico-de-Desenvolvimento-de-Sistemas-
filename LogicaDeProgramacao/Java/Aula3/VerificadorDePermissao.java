package LogicaDeProgramacao.Java.Aula3;
/*2. Criar uma nova classe com o nome VerificadorDePermissao. 
Crie duas variáveis, altura (ex: 1.55) e estaAcompanhada (ex: true). 
Verifique e exiba no console se a pessoa pode entrar no brinquedo, 
sabendo que a regra é ter altura mínima de 1.60m OU estar acompanhada. */
public class VerificadorDePermissao {
    public static void main(String[] args) {
        float altura = 1.84f;
        boolean estaAcompanhada=true;

        if (altura >= 1.60 || estaAcompanhada) {
            System.out.println("Pode entrar no brinquedo");
        }else{
            System.out.println("Não pode entrar no brinquedo");
        }
    }
}
