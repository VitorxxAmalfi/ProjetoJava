package Teste;

import java.util.Scanner;

public class calculadora {
	
	private static Scanner imput2;

	public static void main(String[] args) {
		
		int n1;
		int n2;
			
		imput2 = new Scanner(System.in);
			
		System.out.println("qual o primeiro n�mero?");
		n1 = imput2.nextInt();
		System.out.println("qual o segundo n�mero?");
		n2 = imput2.nextInt();
				
			System.out.println("soma: " +(n1+n2));
			System.out.println("subtra��o: " +(n1-n2));
			System.out.println("multiplica��o: " +(n1*n2));
			System.out.println("divis�o: " +(n1/n2));
			
	}

}
