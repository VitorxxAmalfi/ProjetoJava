package exercicio04;

import java.util.Scanner;

public class exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da variavel A:");
		int variavelA=sc.nextInt();
		System.out.println("Digite o valor da variavel B:");
		int variavelB=sc.nextInt();
		
		int resultado01= (variavelA*2);
		int resultado02= (variavelB*2);
		
		int resultadoFinal= (resultado01-resultado02);
		System.out.println("O resultado final é:"+resultadoFinal);
		
		sc.close();
		
		
		

	} 
	}
