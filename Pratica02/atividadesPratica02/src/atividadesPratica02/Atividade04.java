package atividadesPratica02;
import java.util.Scanner;
public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double a,b,c;
		System.out.println("Informe o cateto a:");
		a=entrada.nextDouble();
		System.out.println("Informe o cateto b:");
		b=entrada.nextDouble();
		
		c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
		System.out.printf("c: %.2f ",(c));
	}

}
