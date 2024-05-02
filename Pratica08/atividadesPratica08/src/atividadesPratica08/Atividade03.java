package atividadesPratica08;
import java.util.Scanner;
public class Atividade03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i,j;
		int[][] matriz = new int [5][5];
		
		for(i = 0; i < matriz.length;i++)
			for(j = 0; j < matriz[i].length;j++) {
				System.out.println("Informe um número:");
				matriz[i][j] = entrada.nextInt();
			}
		
		for(i = 0; i < matriz.length;i++) {
			for(j = 0; j < matriz[i].length;j++) 
				System.out.printf("%2d ",matriz[j][i]);
			
			System.out.println();
			}

	}

}
