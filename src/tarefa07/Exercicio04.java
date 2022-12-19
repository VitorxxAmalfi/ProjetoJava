package tarefa07;

import java.util.Scanner;

public class Exercicio04 {


public static void main(String[]Args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor 1 :");
		int valor01 = sc.nextInt();
		System.out.println("Digite o valor 2 :");
		int valor02 = sc.nextInt();
		System.out.println("Digite o valor 3 :");
		int valor03 = sc.nextInt();
		
		if(valor01 > valor02 && valor01 > valor03 && valor02 > valor03) {
			System.out.println(valor01+" , "+valor02);
			System.out.println("Os numero digitados em ordem crescente : "+valor02+(" , ")+valor01);
		}else if(valor02 > valor01 && valor02 > valor03 && valor03 > valor01) {
			System.out.println(valor02+" , "+valor03);
			System.out.println("Os numero digitados em ordem crescente : "+valor03+(" , ")+valor02);
		}else if(valor03 > valor01 && valor03 > valor02 && valor02 > valor01) {
			System.out.println(valor03+" , "+valor02);
			System.out.println("Os numero digitados em ordem crescente : "+valor02+(" , ")+valor03);
		}else if(valor02 > valor01 && valor02 > valor03 && valor01 > valor03) {
			System.out.println(valor02+" , "+valor01);
			System.out.println("Os numero digitados em ordem crescente : "+valor01+(" , ")+valor02);
		}
		
	
		sc.close();
	}
}
	

