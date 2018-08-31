package semana05;

import javax.swing.JOptionPane;

public class Aluno {
	
	private String ra;
	private String nome;
	private String curso;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public Aluno() {
	}
	
	public Aluno(String ra, String nome, String curso) {
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
	}
	

	public void digitarDados() {
		this.ra = JOptionPane.showInputDialog("RA?");
		this.nome = JOptionPane.showInputDialog("Nome?");
		this.curso = JOptionPane.showInputDialog("Curso?");
	}
	
	public void mostrar() {
		JOptionPane.showMessageDialog(null,
				"RA:" + this.ra + "\n" +
				"Nome:" + this.nome + "\n" +
				"Curso:" + this.curso);
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
