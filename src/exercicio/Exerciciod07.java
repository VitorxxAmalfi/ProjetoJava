package exercicio;

import java.util.Scanner;

public class Exerciciod07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius");
		float grausCelsius=sc.nextFloat();
		float grausFahrenheit = (9*grausCelsius + 160)/5;
		System.out.println("A temperatura em gruas Fahrenheit corresponde a:"+grausFahrenheit);
		
		sc.close();
				
	}

}
