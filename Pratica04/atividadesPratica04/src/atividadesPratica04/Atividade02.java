package atividadesPratica04;
import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double salario, mediaSalario, mediaFilho;
		int filhos, totalFilhos, totalSalario, habitantes ;

		habitantes = 0;
		totalFilhos = 0;
		totalSalario = 0;
		
		System.out.println("Informe o seu salario: ");
		salario = entrada.nextDouble();
		
		while(salario >= 0){
			System.out.println("Informe a quantidade de filhos: ");
			filhos = entrada.nextInt();
			
			habitantes ++;
			totalSalario += salario;
			totalFilhos += filhos;
			
			System.out.println("Informe o seu salario: ");
			salario = entrada.nextDouble();
			
		}
		
		mediaSalario = totalSalario/habitantes;
		mediaFilho = totalFilhos/habitantes;
		
		System.out.printf("Média do salário da população: %.2f \n", mediaSalario);
		System.out.println("Média de filhos da população: "+ mediaFilho);
	}

}
