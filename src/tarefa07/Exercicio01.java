package tarefa07;

import java.util.Scanner;

public class Exercicio01 {


	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		float numero01 = sc.nextFloat();

		if (numero01 > 0) {
			System.out.println("Positivo");
		} else if (numero01 == 0) {
			System.out.println("Zero");
		} else {
			System.out.println("Negativo");
		}

		sc.close();
	}
}
