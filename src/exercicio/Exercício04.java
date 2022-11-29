package exercicio;

import java.util.Scanner;

public class Exercício04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("digite o primeiro número da subtração");
		int numero1=sc.nextInt();
		System.out.println("digite o segundo número da subtração");
		int numero2=sc.nextInt();
	    int subtracao=numero1-numero2;
	    		System.out.println("A subtração do número" +subtracao);
	    sc.close();
	    
	}
}
