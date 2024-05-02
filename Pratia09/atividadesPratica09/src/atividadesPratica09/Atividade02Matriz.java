package atividadesPratica09;

import java.util.Scanner;

public class Atividade02Matriz {
	public static void imprime(int[][] mat) {
		System.out.println("Matriz informada:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++)
				if (i % 2 == 0 && j % 2 != 0) {
					System.out.printf("%2d ", mat[i][j]);

				}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int i, j;
		int[][] matriz = new int[5][5];

		for (i = 0; i < matriz.length; i++)
			for (j = 0; j < matriz[i].length; j++) {
				System.out.println("Informe o número: ");
				matriz[i][j] = entrada.nextInt();
			}
		imprime(matriz);

	}

}
