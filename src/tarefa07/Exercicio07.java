package tarefa07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int valor01 = sc.nextInt();

		System.out.println("Digite o segundo valor: ");
		int valor02 = sc.nextInt();

		if (valor01 == valor02) {
			System.out.println("Os numero são iguais");
		} else if (valor01 > valor02) {
			System.out.println("O primeiro valor e o maior");
		} else if (valor02 > valor01) {
			System.out.println("O segundo valor e o maior");
		}

		sc.close();
	}
}
