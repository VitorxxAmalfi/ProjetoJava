package exercicio04;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o valor da variavel A:");
		int variavelA=sc.nextInt();
		System.out.println("Digite o valor da variavel B:");
		int variavelB=sc.nextInt();
		System.out.println("Digite o valor da variavel C:");
		int variavelC=sc.nextInt();
		System.out.println("Digite o valor da variavel D:");
		int variavelD=sc.nextInt();
		
		int soma1=variavelA+variavelB;
		int soma2=variavelA+variavelC;
		int soma3=variavelA+variavelD;
		int soma4=variavelB+variavelC;
		int soma5=variavelB+variavelD;
		int soma6=variavelC+variavelD;
		
		System.out.println(soma1);
		System.out.println(soma2);
		System.out.println(soma3);
		System.out.println(soma4);
		System.out.println(soma5);
		System.out.println(soma6);
		
		int multiplicacao1=variavelA+variavelB;
		int multiplicacao2=variavelA+variavelC;
		int multiplicacao3=variavelA+variavelD;
		int multiplicacao4=variavelB+variavelC;
		int multiplicacao5=variavelB+variavelD;
		int multiplicacao6=variavelC+variavelD;
		
		System.out.println(multiplicacao1);
		System.out.println(multiplicacao2);
		System.out.println(multiplicacao3);
		System.out.println(multiplicacao4);
		System.out.println(multiplicacao5);
		System.out.println(multiplicacao6);
		
		sc.close();
	
		
		
		
		
		
		
		
	}
}
