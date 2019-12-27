import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("CALCULADORA DE MÉDIA PONDERADA");
		System.out.println("\nQuantas médias deseja calcular?");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("Média: %.1f%n\n", media);
		}
		
		sc.close();
	}

}
