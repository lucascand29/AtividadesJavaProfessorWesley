package atividadesPratica02;
import java.util.Scanner;
public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int diagMaior, diagMenor, area;
		
		System.out.println("Informe a diagonal maior: ");
		diagMaior = entrada.nextInt();
		
		System.out.println("Informe a diagonal menor: ");
		diagMenor = entrada.nextInt();
		
		area = (diagMaior * diagMenor)/2;
		
		
		System.out.println("A area do losangole é: "+ area);
	}

}
