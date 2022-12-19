package tarefa08;

public class Exercicio07 {


	public static void main(String[] Args) {

		int ant = 1, pos = 1, cont = 1, aux;

		while (cont <= 15) {

			System.out.println(ant + " ");

			aux = ant + pos;
			ant = pos;
			pos = aux;

			cont++;
		}
	}
}
