import java.util.Scanner;

public class Exercicio_Dois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("[10,20]");
		System.out.println("Digite o número de valores inteiros que deseja analisar.");

		int n = sc.nextInt();

		int in = 0;
		int out = 0;

		System.out.println("Digite os valores.");

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();

	}

}
