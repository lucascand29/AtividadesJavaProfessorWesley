package atividadesPratica03;
import java.util.Scanner;
public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int sexo;
		int idade;
		
		System.out.println("Informe o seu sexo, 1 - para Masculino e 2 - para Feminino: ");
		sexo = entrada.nextInt();
		if (sexo == 1) {
			
			System.out.println("Informe sua idade:");
			idade = entrada.nextInt();
			
			if (idade <= 15 ) {
				System.out.println("Valor: 60 reais");			
			}else if(idade > 15 && idade <= 18) {
				System.out.println("Valor: 75 reais");
			}else if(idade > 18 && idade <= 30) {
				System.out.println("Valor: 90 reais");
			}else if(idade > 30 && idade <= 40) {
				System.out.println("Valor: 85 reais");
			}else if(idade > 30 && idade <= 40) {
				System.out.println("Valor: 85 reais");
			}else {
				System.out.println("Valor: 85 reais");
			}
		}
		
		else if(sexo == 2){
			System.out.println("Informe sua idade:");
			idade = entrada.nextInt();
			
			if (idade <= 18 ) {
				System.out.println("Valor: 60 reais");			
			}else if(idade > 18 && idade <= 25) {
				System.out.println("Valor: 90 reais");
			}else if(idade > 26 && idade <= 40) {
				System.out.println("Valor: 85 reais");
			}else {
				System.out.println("Valor: 80 reais");
			}
		}else {
			System.out.println("Informação invalida!");
		}

	}

}
