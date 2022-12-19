package tarefa07;

import java.util.Scanner;

public class Exercicio12 {


	public static void main(String[]Args) {
		
	Scanner sc = new Scanner (System.in);	
	
	System.out.println("Digite o codigo de Usuario Correto: ");
	int codigoCerto = sc.nextInt();
	
	if(codigoCerto == 1234) {
		System.out.println("Correto");
	}else if(codigoCerto != 1234) {
		System.out.println("Usuario Invalido !!!");
		System.out.println("Digite o codigo novamente: ");
		int novaTentativa = sc.nextInt();
		if(novaTentativa != 1234) {
			System.out.println("Usuario Invalido !!!");
			System.out.println("Digite o codigo novamente: ");
			int novaTentativa02 = sc.nextInt();
			if(novaTentativa02 != 1234) {
				System.out.println("Usuario Invalido !!!");
			}
		}
	}
	
	System.out.println("Digite a senha correta: ");
	int senhaCorreta = sc.nextInt();
	
	if(senhaCorreta == 9999) {
		System.out.println("Acesso Permitido");
	}else if(senhaCorreta != 9999) {
		System.out.println("Senha incorreta");
		System.out.println("Digite novamente sua senha: ");
		int senhaCorreta02 = sc.nextInt();
		if(senhaCorreta02 != 9999) {
			System.out.println("Senha incorreta");
			System.out.println("Digite novamente sua senha: ");
			int senhaCorreta03 = sc.nextInt();
			if(senhaCorreta03 != 9999) {
				System.out.println("Senha incorreta");
				System.out.println("Usuario Bloqueado !!!!");
			}
		}
	}
	
	
	
	sc.close();
	}
}
