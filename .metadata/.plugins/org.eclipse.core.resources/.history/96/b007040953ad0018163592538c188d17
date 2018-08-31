package semana04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

public class Livro {
	
	private String titulo , autor , editora;
	private BigDecimal preco;
	private boolean novo;
	
	private int qtdDePaginas;
	
	public String gravar() {
		String ret = "";
		try {
			PrintWriter printWriter = new PrintWriter("/home/thiago/Documents/livro.txt");
			printWriter.println(titulo);
			printWriter.println(autor);
			printWriter.println(editora);
			printWriter.println(preco);
			String s = "usado";
			if(novo) {s = "novo";}
			printWriter.println(s);
			printWriter.println(qtdDePaginas);
			ret = "Arquivo gravado!";
			printWriter.close();
			
		} catch (IOException erro) {
			ret = "Falha Gravação";
		}
		return ret;
	}
	
	public void guardarTitulo(String t) {
		this.titulo = t;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = new BigDecimal(Double.toString(preco));
	}

	public boolean isNovo() {
		return novo;
	}

	public void setNovo(boolean novo) {
		this.novo = novo;
	}

	public int getQtdDePaginas() {
		return qtdDePaginas;
	}

	public void setQtdDePaginas(int qtdDePaginas) {
		this.qtdDePaginas = qtdDePaginas;
	}

}
