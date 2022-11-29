package exercicio;

import java.util.Scanner;

public class Exercício06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("digite o primeiro número da divisão");
		float numero1=sc.nextFloat();
		System.out.println("digite o segundo número da divisão");
		float numero2=sc.nextInt();
	    float divisao=numero1/numero2;
	    		System.out.println("A divisão do número" +divisao);
	    sc.close();
	    
	}


}
