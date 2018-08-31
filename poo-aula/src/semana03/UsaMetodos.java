package semana03;

public class UsaMetodos {

	public static void main(String[] args) {
		
//		Metodos.imprimir();
//		Metodos.imprimir("Aula de java");
//		Metodos.imprimir("Sexta-feira");
//		
//		Metodos.gerar();
//		Metodos.gerar(10);
//		for (int i = 0; i < 10; i++) {
//			Metodos.lancarDado();			
//		}
		
		double x = 1.2;
		double y = 4.5;
		double r = Metodos.somar(x,y);
		System.out.println(r);
		
		System.out.println(Metodos.calcular(10, 2, "/"));
	}
}
