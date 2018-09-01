package semana05;

import java.awt.Color;

import javax.swing.JButton;

public class Botao extends JButton{
	
	
	public Botao(String titulo) {
		setText(titulo);
		setBackground(Color.GREEN);
		setForeground(Color.WHITE);
		setSize(100,25);
	}
	
}
