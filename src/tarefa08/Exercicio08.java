package tarefa08;

public class Exercicio08 {

	public static void main(String[] Args) {

		int celsius = 0;

		while (celsius <= 10) {

			int cont02 = celsius * 10;
			int Fahrenheit = (9 * cont02 + 160) / 5;

			System.out.println(cont02 + "ºC" + " são " + Fahrenheit + "ºF");

			celsius++;
		}
	}
}
