package exemplo;

import java.util.Scanner;

public class exemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor :");
		int valor=sc.nextInt();
		if (valor>20) {
			System.out.println("O valor digitado é maior que 20");
		}
sc.close();
	}

}
