package semana01;

import javax.swing.JOptionPane;

public class Exemplo07 {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Valor 1");
		String n2 = JOptionPane.showInputDialog("Valor 2");

		double a = Double.parseDouble(n1);
		double b = Double.parseDouble(n2);

		double soma = a + b;
		double subtracao = a-b;
		double multiplicacao = a*b;
		double divisao = a/b;
		
		JOptionPane.showMessageDialog(null , "Resultados:" + 
		"\nSoma = " + soma +
		"\nSubtra��o = " + subtracao +
		"\nMultiplica��o = " + multiplicacao +
		"\nDivis�o = " + divisao);

	}

}
