package exercicio08;

import java.util.Scanner;

/*1) Apresentar os resultados de uma tabuada
 * de multiplicar  (de 1 ate 10)
 */

public class exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número :");
		int numero = sc.nextInt();
		int contadora = 0;
		
		while (contadora<10);
			System.out.println(numero*contadora);
		int	contadora++;
			
	}
}
