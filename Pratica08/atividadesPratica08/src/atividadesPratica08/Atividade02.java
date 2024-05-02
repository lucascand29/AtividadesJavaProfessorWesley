package atividadesPratica08;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int i, j;
		int[][] matriz = new int[5][5];

		for (i = 0; i < matriz.length; i++)
			for (j = 0; j < matriz[i].length; j++) {
				System.out.println("Informe o número: ");
				matriz[i][j] = entrada.nextInt();
			}

		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++)
				if (i % 2 == 0 && j % 2 != 0) {
						System.out.printf("%2d ", matriz[i][j]);
						
				}
			System.out.println();
		}
	}

}
