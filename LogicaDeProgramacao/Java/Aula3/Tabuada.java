package LogicaDeProgramacao.Java.Aula3;
import javax.swing.JOptionPane;

public class Tabuada {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Digite o número que deseja saber a Tabuada: ");
            int numero = Integer.parseInt(numeroStr);

         StringBuilder tabuada = new StringBuilder("A Tabuada do " + numero + " é:\n");

        for (int i = 1; i <= 10; i++) {
            tabuada.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
        }

        JOptionPane.showMessageDialog(null, tabuada.toString());
    }
}
