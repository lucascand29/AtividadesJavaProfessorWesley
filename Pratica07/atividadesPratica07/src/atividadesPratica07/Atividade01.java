package atividadesPratica07;
import java.util.Scanner;
public class Atividade01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int i;
		int[] vetor = new int[10];
		int soma = 0;
		
		for(i = 0; i < vetor.length; i++) {
			System.out.println("Informe um número: ");
			vetor[i] = entrada.nextInt();
		}
		
		System.out.println("Vetor informado:");
		for(i = 0; i < vetor.length;i++){
		System.out.printf("Vetor[%d] = %2d\n", i, vetor[i]);
		}
		

		for(i = 0; i < vetor.length;i++) {
			if(vetor[i]%2 == 0) {
				soma = soma + vetor[i];
			}
		}
		System.out.printf("Soma dos números pares: %d ",soma);
	}

}
