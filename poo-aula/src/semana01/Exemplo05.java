package semana01;

public class Exemplo05 {

	public static void main(String[] args) {
		if (args.length == 3) {
			int numero1 = Integer.parseInt(args[0]);
			int numero2 = Integer.parseInt(args[2]);
			String operador = args[1];

			if (operador.equals("+")) {
				System.out.println(numero1 + numero2);
			} else if (operador.equals("-")) {
				System.out.println(numero1 - numero2);
			} else if (operador.equals("*")) {
				System.out.println(numero1 * numero2);
			} else if (operador.equals("/")) {
				System.out.println(numero1 / numero2);
			} else {
				System.out.println("Operador Desconhecido!");
			}

		} else {
			System.out.println("N�mero de argumentos incorreto!");
			System.out.println("Forne�a dois n�meros e o operador!");
		}

	}

}
