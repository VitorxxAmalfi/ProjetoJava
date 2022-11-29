package exercicio03;

import java.util.Scanner;

public class Exercicio05 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus fahrenheit:");
		float grausfahrenheit=sc.nextFloat();
		float grausCelsius = (grausfahrenheit-32)*5/9;
		System.out.println("A temperatura em gruas Celsius corresponde a:"+grausCelsius);
		
		sc.close();
				
	}


}
