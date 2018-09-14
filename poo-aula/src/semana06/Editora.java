package semana06;

public class Editora {
	
	public String nome;
	public Livro[] livros;
	
	public void mostrarTodosLivros() {
		for (int i = 0; i < livros.length; i++) {
			livros[i].mostrar();
		}		
	}
}
