package exercicio03;

import java.util.Scanner;

public class Exerc�cio02 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o numero de eleitores:");
		int quantidadeleitores=sc.nextInt();
		
		System.out.println("Digite o n�mero de votos em branco:");
		int brancos=sc.nextInt();
		
		System.out.println("Digite o n�mero de votos nulos:");
		int nulos=sc.nextInt();
		
		System.out.println("Digite o numero de votos validos:");
		int validos=sc.nextInt();
		
		float porcentgemvotosbrancos= (brancos/quantidadeleitores)*100;
		float porcentgemvotosnulos= (nulos/quantidadeleitores)*100;
		float porcentgemvotosvalidos= (validos/quantidadeleitores)*100;
				
							
				System.out.println("A quantidade de eleitores total �:"+porcentgemvotosbrancos);
				System.out.println("A quantidade de eleitores total �:"+porcentgemvotosnulos);
				System.out.println("A quantidade de eleitores total �:"+porcentgemvotosvalidos);
		
		sc.close();
	}

}
