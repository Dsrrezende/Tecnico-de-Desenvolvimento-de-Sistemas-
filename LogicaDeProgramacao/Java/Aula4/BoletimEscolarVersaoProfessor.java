package LogicaDeProgramacao.Java.Aula4;
import javax.swing.JOptionPane;

public class BoletimEscolarVersaoProfessor {
public static void main(String[] args) {
    double[][] notas = new double[3][4];
    double[] medias = new double[3];
    double soma = 0;

    for(int i=0;i<notas.length;i++){
        for (int j=0;j<notas[i].length;j++){
            String notaInputada = JOptionPane.showInputDialog(null,"Digite a "+(j+1)+ "ª nota do Aluno "+(i+1));
            notas[i][j] = Double.parseDouble(notaInputada);
            soma=soma+notas[i][j];
            }
            medias[i]=soma/notas[i].length;
            soma=0;
    }
    String mensagem = "Notas Alunos\n";
    for(int i=0; i<medias.length;i++){
        mensagem += "Aluno " + (i+1) + "- média " + String.format("%.2f",medias[i])+"\n";
    }
    JOptionPane.showMessageDialog(null,mensagem);   
}    
}