package exercicio;

import java.util.Scanner;

public class Exerc�cio05 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("digite o primeiro n�mero da multiplica��o");
	int numero1=sc.nextInt();
	System.out.println("digite o segundo n�mero da multiplica��o");
	int numero2=sc.nextInt();
    int multiplicacao=numero1*numero2;
    		System.out.println("A multiplica��o do n�mero" +multiplicacao);
    sc.close();
    
}

}
