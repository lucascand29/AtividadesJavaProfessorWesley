package atividadesPratica07;
import java.util.Scanner;
public class TesteAtividade {

	public static void main(String[] args) {
		int i;
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[10];
		for (i = 0; i < vetor.length; i++) {

		System.out.println("Informe um número: ");
		vetor[i] = input.nextInt();
		}
		
		System.out.println("Vetor informado:");
		for (i = 0; i < vetor.length; i++) {

		System.out.printf("v[%d] = %2d\n", i, vetor[i]);

		}
	}	
}
