package Teste;

import java.util.Scanner;

public class calculadora {
	
	private static Scanner imput2;

	public static void main(String[] args) {
		
		int n1;
		int n2;
			
		imput2 = new Scanner(System.in);
			
		System.out.println("qual o primeiro número?");
		n1 = imput2.nextInt();
		System.out.println("qual o segundo número?");
		n2 = imput2.nextInt();
				
			System.out.println("soma: " +(n1+n2));
			System.out.println("subtração: " +(n1-n2));
			System.out.println("multiplicação: " +(n1*n2));
			System.out.println("divisão: " +(n1/n2));
			
	}

}
