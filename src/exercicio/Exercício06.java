package exercicio;

import java.util.Scanner;

public class Exerc�cio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("digite o primeiro n�mero da divis�o");
		float numero1=sc.nextFloat();
		System.out.println("digite o segundo n�mero da divis�o");
		float numero2=sc.nextInt();
	    float divisao=numero1/numero2;
	    		System.out.println("A divis�o do n�mero" +divisao);
	    sc.close();
	    
	}


}
