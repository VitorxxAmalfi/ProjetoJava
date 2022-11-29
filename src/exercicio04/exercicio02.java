package exercicio04;

import java.util.Scanner;

public class exercicio02 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("de o valor do comprimento da caixa:");
		float comprimento=sc.nextFloat();
		System.out.println("de o valor do largura da caixa:");
		float largura=sc.nextFloat();
		System.out.println("de o valor da altura da caixa:");
		float altura=sc.nextFloat();
		
		float volume= (comprimento*largura*altura);
		
		System.out.println("O volume da caixa é:"+volume);
		sc.close();
	
	}

}
