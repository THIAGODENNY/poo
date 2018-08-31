package semana05;

import javax.swing.JOptionPane;

public class Aluno {
	
	private String ra;
	private String nome;
	private String curso;
	
	public void digitarDados() {
		
		ra = JOptionPane.showInputDialog("RA?");
		nome = JOptionPane.showInputDialog("Nome?");
		curso = JOptionPane.showInputDialog("Curso?");
		
		
	}

}
