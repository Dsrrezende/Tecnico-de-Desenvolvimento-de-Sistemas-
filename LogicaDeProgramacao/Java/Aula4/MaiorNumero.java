package LogicaDeProgramacao.Java.Aula4;
import javax.swing.JOptionPane;

public class MaiorNumero {
    public static void main(String[] args) {
        int [] pontuacao = new int [6];

        for (int i=0; i<pontuacao.length;i++){
            String numeroStr = JOptionPane.showInputDialog("Entre com o "+( i+1) + "º ponto: ");
            pontuacao[i] = Integer.parseInt(numeroStr);
        }
        int maior = pontuacao[0];
        for ( int i=1 ; i<pontuacao.length;i++){
            if (pontuacao[i] > maior) {
                maior = pontuacao[i];
            }
        }
        JOptionPane.showMessageDialog(null, "O maior ponto digitado foi: " + maior);
    }
}
