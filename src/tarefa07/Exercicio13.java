package tarefa07;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[]Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do Produto: ");
		String nomeProduto = sc.next();

		System.out.println("Digite a Quantidade do produto: ");
		float quantidadeAdquirida = sc.nextFloat();
		System.out.println("Digite o valor Unitario do Produto: ");
		float preceUnitario = sc.nextFloat();

		float totalQuantidadeValorUnitario = quantidadeAdquirida * preceUnitario;

		if (quantidadeAdquirida <= 5) {
			float desconto = 2 * totalQuantidadeValorUnitario / 100;
			float valorComDesconto = totalQuantidadeValorUnitario - desconto;
			System.out.println("O seu Produto é " + nomeProduto + " e o valor total apagar com desconto de 2% e : "+ valorComDesconto);
		} else if (quantidadeAdquirida > 5 && quantidadeAdquirida <= 10) {
			float desconto02 = 3 * totalQuantidadeValorUnitario / 100;
			float valorConDesconto02 = totalQuantidadeValorUnitario - desconto02;
			System.out.println("O seu Produto é " + nomeProduto + " e o valor total apagar com desconto de 3% e : "+ valorConDesconto02);
		} else if (quantidadeAdquirida > 10) {
			float desconto03 = 5 * totalQuantidadeValorUnitario / 100;
			float valorComDesconto03 = totalQuantidadeValorUnitario - desconto03;
			System.out.println("O seu Produto é " + nomeProduto + " e o valor total apagar com desconto de 5% e : "+ valorComDesconto03);
		}

		sc.close();
	}
}
