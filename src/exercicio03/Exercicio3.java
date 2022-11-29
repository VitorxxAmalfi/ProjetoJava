package exercicio03;

import java.util.Scanner;

public class Exercicio3 {
	
	public void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
				
				System.out.println("Digite o salario mensal bruto:");
				float salario=sc.nextFloat();
				
				System.out.println("Digite percentual de reajuste:");
				float percentual=sc.nextFloat();
	
				float valorAumento=(salario*percentual)/100;
						float salarioLiquido=salario+valorAumento;
						
						System.out.println(salarioLiquido);
						
						sc.close();
						}

}
