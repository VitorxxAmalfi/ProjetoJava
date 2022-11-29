package exercicio03;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos anos você tem:");
		int anos=sc.nextInt();
		
		System.out.println("Digite o valor de meses vividos desde seu ultimo mêsversario:");
		int meses=sc.nextInt();
		
		System.out.println("Em qual dia do mês que você está?");
		int dias=sc.nextInt();
		
		int resultado= (anos*365)+(meses*30)+dias;
				
				System.out.println("A sua idade expressa em dias É:"+resultado);
				
				sc.close();
				
		
		
				
		
	}
}
