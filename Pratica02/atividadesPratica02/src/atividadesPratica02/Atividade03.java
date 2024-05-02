package atividadesPratica02;
import java.util.Scanner;
public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		int salMin = 1412;
		double salPessoa,quantSal;
		
		System.out.println("Informe o seu sálario: ");
		salPessoa = entrada.nextDouble();
		
		quantSal = salPessoa / salMin;
		
		System.out.println("Quantidade de sálario recebido: " + quantSal);
		
	}

}
