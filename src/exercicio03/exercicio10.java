package exercicio03;

import java.util.Scanner;

public class exercicio10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da variavel A:");
		int variavelA=sc.nextInt();
		
		System.out.println("Digite o valor da variavel B:");
		int variavelB=sc.nextInt();
		
		 int variavelAuxiliar;
		 
		 variavelAuxiliar=variavelA;
				 variavelA=variavelB;
				 variavelB=variavelAuxiliar;
				 
				 System.out.println("O valor da variavel A é:"+variavelA);
		 System.out.println("O valor da variavel B é:"+variavelB);
		 
		sc.close();
		
	}
	
}
