package atividadesPratica02;
import java.util.Scanner;
public class Atividade05 {
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		double raio,comprimento,area,volume;
		
		System.out.println("Informe o raio da esfera: ");
		raio = entrada.nextDouble();
		
		comprimento = 2 * Math.PI * raio;
		area = Math.PI*Math.pow(raio, 2);
		volume = (3/4)*Math.PI*Math.pow(raio,3);
		
		
		System.out.printf("Comprimento: %.2f %n  Area: %.2f %n  Volume: %.2f %n",(comprimento),(area),(volume));
		
	}
	
}
