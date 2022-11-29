package exercicio;

import java.util.Scanner;

public class Exercício05 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("digite o primeiro número da multiplicação");
	int numero1=sc.nextInt();
	System.out.println("digite o segundo número da multiplicação");
	int numero2=sc.nextInt();
    int multiplicacao=numero1*numero2;
    		System.out.println("A multiplicação do número" +multiplicacao);
    sc.close();
    
}

}
