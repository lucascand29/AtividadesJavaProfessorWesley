package atividadesPratica06;
import javax.swing.JOptionPane;
public class Atividade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  entrada;
		
		int n, total = 1;
		
		entrada = JOptionPane.showInputDialog("Informe um número para fatorar: ");
		n = Integer.parseInt(entrada);
		
		if(n == 0) {
			JOptionPane.showMessageDialog(null, "Resultado = 1");
		}else if (n < 0) {
			JOptionPane.showMessageDialog(null, "Número inválido");
		}else {
			System.out.println("Sequencia de números: ");
			for(int i = n; i > 0; i--) {
				System.out.println(i);
				total =  total * i;

			}
		}
		JOptionPane.showMessageDialog(null,"resultado: "+ total);

	}

}
