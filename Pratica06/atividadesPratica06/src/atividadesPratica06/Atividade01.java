package atividadesPratica06;
import javax.swing.JOptionPane;
public class Atividade01 {

	public static void main(String[] args) {
		String entrada;
		
		int numero1,numero2, soma = 0;
		
		entrada = JOptionPane.showInputDialog("Informe o primeiro número: ");
		numero1 = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog("Informe o segundo número: ");
		numero2 = Integer.parseInt(entrada);
		
		System.out.println("Sequencia de números: ");
		for (int i = numero1; i < numero2; i++) {

			System.out.println(i);
			
			if(i % 2 != 0) {
				soma = soma + i;
				
			}
			

		}
		
		JOptionPane.showMessageDialog(null, "A soma dos números ímpas: "+ soma);
	}

}
