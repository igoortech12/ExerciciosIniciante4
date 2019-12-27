import java.util.Scanner;

public class Exercicio_Um {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DESCOBRIR OS NUMEROS IMPARES DENTRO DE UM INTERVALO
		//QUE VAI DE 0 ATÉ O NUMERO DIGITADO.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
	

