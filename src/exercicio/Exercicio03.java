/*) Solicite um valor do teclado exiba a sua soma*/

package exercicio;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("digite o primeiro n�mero soma");
		int numero1=sc.nextInt();
		System.out.println("digite o segundo n�mero da soma");
		int numero2=sc.nextInt();
	    int soma=numero1+numero2;
	    		System.out.println("A soma do n�mero" +soma);
	    sc.close();
		
	}

}
