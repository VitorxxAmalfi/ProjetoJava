package Teste;

import java.util.Scanner;

public class temporizador {

	public static void main(String[] args) {

		System.out.println("cronometro");

		Scanner sc = new Scanner(System.in);
		
System.out.println("horas:");
int horas=sc.nextInt();

System.out.println("minutos:");
int minutos=sc.nextInt();

System.out.println("segundos:");
int segundos=sc.nextInt();


		for (int k = horas; k >= 0; k--) {
			for (int i = minutos; i >= 0; i--) {
				for (int j = segundos; j >= 0; j--) {
					System.out.println(k + ":" + i + ":" + j);
					segundos=59;
					minutos=59;
				}
			}
		}
		sc.close();
	}
	

}
