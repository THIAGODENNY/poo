package semana06;

public class Casamentos {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		
		p1.codigo = 1;
		p1.nome = "Marcio";
		
		p2.codigo = 2;
		p2.nome = "Sabrina";
		
		p1.conjuge = p2;
		p2.conjuge = p1;
		
		p3.codigo = 3;
		p3.nome = "Kiko";
		
		p1.mostrar();
		System.out.println("------------------");
		p2.mostrar();
		System.out.println("------------------");
		p3.mostrar();
		
		
	}
}
