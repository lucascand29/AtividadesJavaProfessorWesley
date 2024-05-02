package atividadesPratica09;

public class Teste {
	public static int Subrotina4(int p1, int p2) {
		int a, b, soma;
		a = p1;
		b = p2;
		soma = a + b;
		return (soma);
	}

	public static void main(String[] args) {
		int x, y, s;
		x = 5;
		y = 7;
		s = Subrotina4(x, y);
		System.out.println("A soma é:" + s);
	}
}
