package atividadesPratica07;
import java.util.Scanner;
public class Atividade03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int i;
		double[] vetor = new double [10];
		double maior = vetor[0];
		double menor = vetor[0];
		
		for(i = 0; i < vetor.length;i++) {
			System.out.println("Informe um número real: ");
			vetor[i] = entrada.nextDouble();
		}
		
		for(i = 0; i < vetor.length; i++) {
			if(vetor[i] < menor) {
				menor = vetor[i];
			}
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		
		System.out.printf("\nVetor[Misterio] - menor número: %1.2f", menor);
		System.out.printf("\nVetor[Misterio] - maior número: %1.2f", maior);

	}

}
