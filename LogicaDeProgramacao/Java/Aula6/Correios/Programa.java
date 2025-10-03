package LogicaDeProgramacao.Java.Aula6.Correios;

public class Programa {
    public static void main(String[] args) {
        //1.Cria o objeto endereço
        Endereco endDoJoao = new Endereco();
        endDoJoao.rua = "Rua das Flores";
        endDoJoao.numero = 123;
        endDoJoao.cep = "25845-000";
        endDoJoao.cidade = "Petrópolis";

        // 2.Cria o objeto Pessoa
        Pessoa joao = new Pessoa();
        joao.nome = "João Carlos";
        joao.cpf = "111.222.333-44";

        //3. Conecta os dois objetos 
        joao.endereco = endDoJoao;

        //Acessando dados através da composição
        System.out.println("O "+ joao.nome + " mora na cidade de "+ joao.endereco.cidade + ".");
    }
}
