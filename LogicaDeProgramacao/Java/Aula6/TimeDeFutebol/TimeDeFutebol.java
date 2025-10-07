package LogicaDeProgramacao.Java.Aula6.TimeDeFutebol;

public class TimeDeFutebol {
    String nomeDoTime;
    Jogador [] time = new Jogador[10];
    int vagas = 0;

    public TimeDeFutebol (String nomes, int numeroJogadores){
        this.nomeDoTime = nomes;
        this.time = new Jogador[numeroJogadores];
    }

    
    public void contratarJogador (Jogador novoJogador){
        if (vagas <  time.length){
            time [vagas] = novoJogador;
            vagas ++;
            System.out.println("O Jogador "+ novoJogador.nome + " Foi contratado com sucesso.");
            try {
                Thread.sleep(2000); // pausa por 2 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("Não há vagas disponíveis");
            try {
                Thread.sleep(2000); // pausa por 2 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }

    public void exibirEscalacao (){
        for (int i=0 ; i < vagas; i++){
            System.out.println(time[i].nome + " - "+ time[i].posicao);
        }
    }
}

