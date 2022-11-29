package exercicio03;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o custo do carro de fabrica:");
		float custoFabrica=sc.nextInt();
		
		float imposto=45;
		float distribuidora=28;
		
		float valorimposto=(custoFabrica*imposto)/100; 
		float valordistribuidora=(custoFabrica*distribuidora)/100;
		float valorfinal=(valorimposto+valordistribuidora+custoFabrica);
		System.out.println();
		
		sc=close();
		
		
		
	
	}
	
}
