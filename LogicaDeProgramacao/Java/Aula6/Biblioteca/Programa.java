package LogicaDeProgramacao.Java.Aula6.Biblioteca;

public class Programa {
    public static void main(String[] args) {
        
        //Objeto Autor
        Autor george = new Autor("George R.R Martin","Americano");
        //george.nome = "George R.R Martin";       (sem construtor)
        //george.nacionalidade = "Americano";       (sem construtor)

        //Objeto Livro
        Livro geloEfogo = new Livro("As Crônicas de Gelo e Fogo",1990);
        //geloEfogo.titulo = "As Crônicas de Gelo e Fogo";      (sem construtor)
        //geloEfogo.anoPublicacao = 1990;                       (sem construtor)

        //Conectar os dois objetos
        geloEfogo.autor = george;

        //Acessando dados através da composição
        System.out.println("O Livro "+ geloEfogo.titulo + " foi escrito por "+ george.nome);

    }
}
