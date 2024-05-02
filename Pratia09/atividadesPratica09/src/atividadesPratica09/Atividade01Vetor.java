package atividadesPratica09;
import java.util.Scanner;
public class Atividade01Vetor {
	
	public static void imprime(int[] vet) {
		System.out.println("Vetor informado:");
		for(int i = 0; i < vet.length;i++){
		System.out.printf("Vetor[%d] = %2d\n", i, vet[i]);
		}
	}
	
	public static void soma(int[] vet) {
		int soma=0;
		for(int i = 0; i < vet.length;i++) {
			if(vet[i]%2 == 0) {
				soma = soma + vet[i];
			}
		}
		System.out.printf("Soma dos números pares: %d ",soma);
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i;
		int[] vetor = new int[10];

		for(i = 0; i < vetor.length; i++) {
			System.out.println("Informe um número: ");
			vetor[i] = entrada.nextInt();
		}
		
		imprime(vetor);
		soma(vetor);

	}

}
