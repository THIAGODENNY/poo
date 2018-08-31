package semana03;

/**
 * Classe de teste de métodos
 * 
 * @author thiago
 * 
 */
public class Metodos {

	/**
	 * Imprime sempre a mesma mensagem em tela
	 */
	public static void imprimir() {
		System.out.println("Apostila de Java");
		imprimir("oba");
	}

	/**
	 * Recebe um texto e o imprime em tela
	 * 
	 * @param texto
	 *            - o texto a ser impresso
	 */
	public static void imprimir(String texto) {
		System.out.println(texto);
		System.out.println(texto.length());
	}

	/**
	 * Gera um número aleatorio
	 */
	public static void gerar() {
		System.out.println(Math.random());
		System.out.println(Math.random() * 100);
		System.out.println((int) (Math.random() * 1000));
	}

	/**
	 * Gera um número aleatóri
	 * 
	 * @param limite
	 */
	public static void gerar(int limite) {
		System.out.println((int) (Math.random() * limite));
	}

	public static void lancarDado() {
		System.out.println((int) (Math.random() * 5) + 1);
	}
	
	public static void somar(int a , int b){
		System.out.println(a + b);
	}
	
	public static double somar(double x , double y){
		return x + y;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param op
	 * @return
	 */
	public static double calcular(double x , double y , String op) {
		switch (op.toLowerCase()) {
		case "+":
			return x + y;
		case "-":
			return x - y;
		case "*":
			return x * y;
		case "/":
			return x / y;
		default: 
			return 0;
		}
		
		
	}
}
