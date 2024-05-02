package atividadesPratica08;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int i, j;
		int[][] matriz = new int[5][5];

		for (i = 0; i < matriz.length; i++)
			for (j = 0; j < matriz[i].length; j++) {
				System.out.println("Informe um número: ");
				matriz[i][j] = entrada.nextInt();
			}

		int tamanho = matriz.length;

		for (i = 0; i < tamanho; i++) {
			int temp = matriz[i][i];
			matriz[i][i] = matriz[i][tamanho - 1 - i];
			matriz[i][tamanho - 1 - i] = temp;
		}

		System.out.println("Matriz resultante:");
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				System.out.printf("%2d ", matriz[i][j]);

			}
			System.out.println("");
		}
	}

}
