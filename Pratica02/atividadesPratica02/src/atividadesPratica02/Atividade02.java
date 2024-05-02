package atividadesPratica02;
import java.util.Scanner;
public class Atividade02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double c,f;
		
		System.out.println("Informe a temperatura em Celsius: ");
		c = entrada.nextDouble();
		
		f = (c * 1.8)+32;
		
		System.out.println("Temperatura em Fahrenheit: " + f);
		
	}
	
}
