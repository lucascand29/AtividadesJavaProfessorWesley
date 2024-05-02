package atividadesPratica03;
import java.util.Scanner;
public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double a, b, c, delta, raiz1, raiz2;
		
		System.out.println("Informe o valor do coeficiente A\n");
		a = entrada.nextDouble();
		System.out.println("Informe o valor do coeficiente B\n");
		b = entrada.nextDouble();
		System.out.println("Informe o valor do coeficiente C\n");
		c = entrada.nextDouble();
		
		delta = Math.pow(b,2) - (4*a*c);
		System.out.println("Valor do Delta: \n"+delta);
		
		if(a == 0 && b == 0 && c == 0) {
			System.out.println("Igualdade confirmada: 0 = 0");
		}else if(a == 0 && b == 0 && c != 0) {
			System.out.println("Coeficientes informados incorretamente.");
		}else if(a == 0 && b != 0) {
			System.out.println("Esta é uma equação de primeiro grau");
			raiz1 = -c/b;
			System.out.printf("X = -%.2f / %.2f = %.2f",c,b,delta);
		}else if(a!=0){
			System.out.println("Essa é uma equação de sugundo grau");
			if(delta < 0) {
				System.out.println("Essa equação não possui raízes reais");
			}else if(delta == 0) {
				raiz1 = (-b)/(2*a);
				System.out.println("Esta equação possui duas raízes reais iguais.");
				System.out.printf("Raiz = (- %.2f) / (2* %.2f) =  %.2f",b,a,raiz1);
			}else if(delta > 0) {
				System.out.println("Esta equação possui duas raízes reais iguais.");
				raiz1 = (-b + Math.sqrt(delta))/(2*a);
				raiz2 = (-b - Math.sqrt(delta))/(2*a);
				System.out.printf("Raiz 1 = %.2f  \n Raiz 2 = %.2f",raiz1,raiz2);
			}
		}
		
	}

}
