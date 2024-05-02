package atividadesPratica06;
import javax.swing.JOptionPane;
public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada;
		
		int menor = 10000 , maior = -10000;
		entrada = JOptionPane.showInputDialog("Informe um número: (Digite 0 para terminar) ");
		int n = Integer.parseInt(entrada);
		
		for(int i = 1; n != 0; i++) {
			if(n > maior) {
				maior = n;
			}else if (n < menor) {
				menor = n;
			}
			
			entrada = JOptionPane.showInputDialog("Informe um número: (Digite 0 para terminar) ");
			n = Integer.parseInt(entrada);
			
		}
		
		JOptionPane.showMessageDialog(null, "O maior número registrado "+ maior);
		JOptionPane.showMessageDialog(null, "O menor número registrado "+ menor);
	}

}
