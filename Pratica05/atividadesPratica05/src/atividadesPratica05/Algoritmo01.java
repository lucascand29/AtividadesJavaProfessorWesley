package atividadesPratica05;
import javax.swing.JOptionPane;
public class Algoritmo01 {

	public static void main(String[] args) {
		String entrada;
		int numero1, numero2, soma;
		do {
		entrada = JOptionPane.showInputDialog("Informe o primeiro número: ");
		// Converte a entrada para inteiro e armazena em numero1:
		numero1 = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("Informe o segundo número: ");
		// Converte a entrada para inteiro e armazena em numero2:
		numero2 = Integer.parseInt(entrada);
		soma = numero1 + numero2;
		JOptionPane.showMessageDialog(null, "A soma é: " + soma);
		// System.exit(0);
		entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		
	}

}


