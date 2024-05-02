package atividadesPratica03;
import java.util.Scanner;
public class Atividade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int apt;
		int diaria;
		
		System.out.println("Informe o número do tipo de apartamento desejado \n1 - Simples 2 - Duplo ");
		apt = entrada.nextInt();
		if (apt == 1) {
			System.out.println("Informe a quantidade de diarias:\n");
			diaria = entrada.nextInt();
			if(diaria < 10) {
				System.out.println("Valor cobrado: R$ 100,00");
			}else if(diaria > 10 && diaria <= 15) {
				System.out.println("Valor cobrado: R$ 90,00");
			}else {
				System.out.println("Valor cobrado: R$ 80,00");
			}
		}
		else if(apt == 2) {
			System.out.println("Informe a quantidade de diarias:\n");
			diaria = entrada.nextInt();
			if(diaria < 10) {
				System.out.println("Valor cobrado: R$ 140,00");
			}else if(diaria > 10 && diaria <= 15) {
				System.out.println("Valor cobrado: R$ 120,00");
			}else {
				System.out.println("Valor cobrado: R$ 100,00");
			}
		}else {
			System.out.println("Informação invalida!");
		}
		
		
	}

}
