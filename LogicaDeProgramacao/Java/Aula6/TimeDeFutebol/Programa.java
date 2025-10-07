package LogicaDeProgramacao.Java.Aula6.TimeDeFutebol;

public class Programa {
    public static void main(String[] args) {
       TimeDeFutebol team = new TimeDeFutebol("Flamengo",11); 
       Jogador pedro = new Jogador("Pedro","Atacante");
       Jogador arrasca = new Jogador("Giogian de Arrascaeta","Meia-Atacante");
       Jogador plata = new Jogador("Gonzalo Plata","Ponta Direita");

       System.out.print("\033[H\033[2J");
       System.out.flush();
       team.contratarJogador(pedro);
       team.contratarJogador(arrasca);
       team.contratarJogador(plata);
       System.out.print("\033[H\033[2J");
       System.out.flush();
       System.out.println("=====ESCALAÇÃO=====");
       team.exibirEscalacao();
    }
}
