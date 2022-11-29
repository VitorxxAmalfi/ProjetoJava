package exercicio03;

import java.util.Scanner;

public class exercicio09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da prestação:");
		float valorPrestacao=sc.nextFloat();
				
			System.out.println("Digite o tempo de atraso:");
		float tempo=sc.nextFloat();
		
		System.out.println("Digite  valor da taxa:");
		float taxa=sc.nextFloat();
		
		
		float prestacao=valorPrestacao+(valorPrestacao*taxa/100)*tempo;
				System.out.println(prestacao);
				
				
		sc.close();		
	}

}
