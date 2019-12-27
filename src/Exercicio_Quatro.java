import java.util.Scanner;

public class Exercicio_Quatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int x;
		int y;

		for (int i = 0; i < N; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			if (y == 0) {
				System.out.println("Divisão impossível");

			} else {
				double div = (double) x / y;
				System.out.println(div);
			}
		}

		sc.close();

	}

}
