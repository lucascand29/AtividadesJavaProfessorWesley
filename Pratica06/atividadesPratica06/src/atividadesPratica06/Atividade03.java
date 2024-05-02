package atividadesPratica06;
import javax.swing.JOptionPane;

public class Atividade03 {

	public static void main(String[] args) {
		String entrada;
		
		int cont = 0; 
		int media;
		int idade,total =0;
		
		

		entrada =JOptionPane.showInputDialog("Informe sua idade. (Digite -1 para encerrar)");
		idade = Integer.parseInt(entrada);
			for(int i = 1; idade > 0; i++) {
				total = total + idade;
				cont ++;
									
				entrada =JOptionPane.showInputDialog("Informe sua idade. (Digite -1 para encerrar)");
				idade = Integer.parseInt(entrada);

			}

		
		media = total/cont;
		
		JOptionPane.showMessageDialog(null,"A media de idades: " + media);

 
	}

}
