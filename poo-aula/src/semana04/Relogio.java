package semana04;

import javax.swing.JOptionPane;

public class Relogio {
	
	public String fabricante;
	private int horas, minutos, segundos;
	
	public void definirHoras() {
		this.horas = Integer.parseInt(JOptionPane.showInputDialog("Horas"));
	}
	public void definirMinutos() {
		this.minutos = Integer.parseInt(JOptionPane.showInputDialog("Minutos"));
		
	}
	public void definirSegundos() {
		this.segundos = Integer.parseInt(JOptionPane.showInputDialog("Segundos"));		
	}
	public void mostrar() {
		JOptionPane.showMessageDialog(null, "Horas: " + this.horas + "\n" +
											"Minutos: " + this.minutos  + "\n" +
											"Segundos: " + this.segundos);			
	}
	
	public void resetRelogio() {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
	}

}
