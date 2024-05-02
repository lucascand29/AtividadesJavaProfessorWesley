package atividadesPratica09;

import java.util.Scanner;

public class Atividade03Vetor {

	public static void imprime(double[] vet) {
		double maior = vet [0], menor = vet [0];
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] < menor) {
				menor = vet[i];
			}
			if(vet[i] > maior) {
				maior = vet[i];
			}
		}
		
		System.out.printf("\nVetor[Misterio] - menor número: %1.2f", menor);
		System.out.printf("\nVetor[Misterio] - maior número: %1.2f", maior);

	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int i;
		double[] vetor = new double[10];
		double maior = vetor[0];
		double menor = vetor[0];

		for (i = 0; i < vetor.length; i++) {
			System.out.println("Informe um número real: ");
			vetor[i] = entrada.nextDouble();
		}

		imprime(vetor);

	}

}
