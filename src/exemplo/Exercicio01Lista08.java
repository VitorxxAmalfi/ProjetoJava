package exemplo;

import java.util.Scanner;

/*1) Apresentar os resultados de uma tabuada
 *  de multiplicar (de 1 at� 10) de um n�mero qualquer.
 */
public class Exercicio01Lista08 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Digite um n�mero :");
		int numero = sc.nextInt();
		int contadora = 1;
		
		while (contadora <= 10) {
			System.out.println(numero+" x "+contadora+" = "+numero*contadora);
			contadora++;
		}
		
	}

}
