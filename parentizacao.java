package parentezes;
import javax.swing.JOptionPane;

public class parentizacao {
    public static void main(String[] args) {
        String expressao = JOptionPane.showInputDialog("Digite a expressão:");

        if (verificaParametrizacao(expressao)) {
            JOptionPane.showMessageDialog(null, "A expressão está correta!");
        } else {
            JOptionPane.showMessageDialog(null, "A expressão está incorreta!");
        }
    }

    public static boolean verificaParametrizacao(String expressao) {
        int contador = 0;

        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                contador++;
            } else if (c == ')') {
                contador--;
            }
            if (contador < 0) {
                return false;
            }
        }

        return contador == 0;
    }
}