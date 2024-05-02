package atividadesPratica05;
import java.util.Scanner;
public class Atividade01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
		int numeroInvertido = 0;
		int soma, somaMulti;
		int mil,cent,dez,uni;
		System.out.println("Informe um número de 3 digitos:");
		int numero = entrada.nextInt();
		
		int numeroSoma = numero;

		while(numero >0) {
				if(numero <1000) {
					numeroInvertido *= 10; 
					numeroInvertido += (numero % 10);
					numero /= 10;
				}
			}
		soma = numeroInvertido + numeroSoma;
		System.out.println("Numero invertido: "+numeroInvertido);
		System.out.println("Resultado: "+soma);
		

				uni = (soma % 10)*3;
				soma /= 10;
		
				dez = (soma % 10)*2;
				soma /= 10;
		
				cent = (soma % 10)*1;
				soma /= 10;

				mil = (soma % 10)*0;
				soma /= 10;

			
			System.out.println("Unidade: "+uni);
			System.out.println("Dezena: "+dez);
			System.out.println("Centana: "+cent);
			System.out.println("Milhar: "+mil);
			
			somaMulti = uni + dez + cent + mil;
			
			System.out.println("Soma multiplicação "+somaMulti);
			
			
	}

}
