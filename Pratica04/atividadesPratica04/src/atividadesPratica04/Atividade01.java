package atividadesPratica04;
import java.util.Scanner;
public class Atividade01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota,quantAluno,quant90,quantRepro, falta;
		double maiorNota, menorNota,soma;
		double media;
		
		System.out.println("Informe a sua nota: ");
		nota = entrada.nextInt();
		
		quantAluno = 0;
		quant90 = 0;
		quantRepro = 0;
		maiorNota = -1;
		menorNota = 100;
		soma = 0;
		
		 do {
			System.out.println("Informe quantidade de falta: ");
			falta = entrada.nextInt();
			
			quantAluno ++;
			soma += nota;
			
			if(nota >= 90) {
				quant90 ++;
			}
			if(nota < 70 || falta >= 20) {
				quantRepro ++;
			}
			
			if(nota > maiorNota) {
				maiorNota = nota;
			}else if(nota < menorNota) {
				menorNota = nota;
			}
			
			System.out.println("Informe a sua nota: ");
			nota = entrada.nextInt();
			
			media = soma / quantAluno;
		}while(nota >=0);


		System.out.println("Total de alunos com nota maior do que 90: " + quant90);
		System.out.println("Total de alunos reprovados: " + quantRepro);
		System.out.printf("A maior nota: %.2f \nA menor nota: %.2f \n",maiorNota, menorNota);
		System.out.println("Média da sala: "+ media);
	}

}
