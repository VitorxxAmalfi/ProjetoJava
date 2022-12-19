package tarefa09;

public class Exercicio03 {

	public static void main(String[] args) {

		int contador = 1;
	

		do {

			if (contador % 4 == 0) {
				System.out.println(contador);
			}

			contador++;
		} while (contador < 200);

	}

}
