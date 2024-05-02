package atividadesPratica05;
import java.util.Scanner;
public class Atividade02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int nota, idade;
		double salario;
		String sexo;
		
		
		do {
			System.out.println("Informe a sua nota: ");
			nota = entrada.nextInt();
			
			System.out.println("Informe seu salário: ");
			salario = entrada.nextDouble();
			
			System.out.println("Informe seu sexo (m) ou (f): ");
			sexo = entrada.next();
			
			System.out.println("Informe sua idade: ");
			idade = entrada.nextInt();
		}while(nota >= 0 && nota <=10 && salario > 0 && sexo == "m" || sexo == "f" && idade >= 0 && idade <= 150 );
		

	}

}
