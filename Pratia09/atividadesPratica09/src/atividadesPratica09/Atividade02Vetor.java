package atividadesPratica09;
import java.util.Scanner;
public class Atividade02Vetor {

	public static void imprime(double [] vet) {
		for(int i = 0; i < vet.length ;i++) {
			if(vet[i] < 0) {
				System.out.printf("Vetor[%d] = %1.2f\n", i , vet[i]);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int i;
		double [] vetor = new double [10];

		for(i = 0; i < vetor.length;i++) {
			System.out.println("Informe um número real: ");
			vetor[i] = entrada.nextDouble();
		}

		imprime(vetor);
	}

}
