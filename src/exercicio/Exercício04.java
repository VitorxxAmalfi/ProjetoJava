package exercicio;

import java.util.Scanner;

public class Exerc�cio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("digite o primeiro n�mero da subtra��o");
		int numero1=sc.nextInt();
		System.out.println("digite o segundo n�mero da subtra��o");
		int numero2=sc.nextInt();
	    int subtracao=numero1-numero2;
	    		System.out.println("A subtra��o do n�mero" +subtracao);
	    sc.close();
	    
	}
}
