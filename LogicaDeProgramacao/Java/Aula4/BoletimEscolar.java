package LogicaDeProgramacao.Java.Aula4;
import javax.swing.JOptionPane;

public class BoletimEscolar {

    // Constantes 
    private static final int QTD_ALUNOS = 3;  
    private static final int QTD_NOTAS = 4;   

    public static void main(String[] args) {
        String[] nomes = new String[QTD_ALUNOS];
        double[][] boletim = new double[QTD_ALUNOS][QTD_NOTAS];
        double[] medias = new double[QTD_ALUNOS];

        // Entrada de nomes e notas
        for (int i = 0; i < QTD_ALUNOS; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º aluno: ");

            for (int j = 0; j < QTD_NOTAS; j++) {
                String notasStr = JOptionPane.showInputDialog("Digite a " + (j + 1) + "ª nota bimestral do aluno " + nomes[i] + ":");
                notasStr = notasStr.replace(",", ".");
                boletim[i][j] = Double.parseDouble(notasStr);
            }
        }

        // Calcular médias
        for (int i = 0; i < QTD_ALUNOS; i++) {
            double soma = 0;
            for (int j = 0; j < QTD_NOTAS; j++) {
                soma += boletim[i][j];
            }
            medias[i] = soma / QTD_NOTAS;
        }

        // Exibir boletim
        String resultado = "=== BOLETIM ESCOLAR ===\n";
        resultado += QTD_ALUNOS + " alunos | " + QTD_NOTAS + " notas cada\n\n";

        for (int i = 0; i < QTD_ALUNOS; i++) {
            resultado += "Aluno: " + nomes[i] + "\n";
            resultado += "Notas: ";

            for (int j = 0; j < QTD_NOTAS; j++) {
                resultado += boletim[i][j];
                if (j < QTD_NOTAS - 1) { // separador entre as notas
                    resultado += " | ";
                }
            }

            resultado += "\nMédia: " + String.format("%.2f", medias[i]);

            if (medias[i] >= 6.0) {
                resultado += " (APROVADO)";
            } else {
                resultado += " (REPROVADO)";
            }
            resultado += "\n------------------------\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
