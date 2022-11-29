package exercicio;

import java.util.Scanner;

public class Exercício {

	/*1) Solicite um valor do teclado e exiba o o seu sucessor.*/
	
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor:");
	int numero=sc.nextInt();
	int sucessor=numero+1;

	System.out.println("O sucessor do numero " +sucessor); 
	sc.close();
	}
}
