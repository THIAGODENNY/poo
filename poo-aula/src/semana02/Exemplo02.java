package semana02;

import javax.swing.JOptionPane;

public class Exemplo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String v1 = JOptionPane.showInputDialog("Digite um número");
		String v2 = JOptionPane.showInputDialog("Digite um numero");
		
		try {
			int x = Integer.parseInt(v1);
			int y = Integer.parseInt(v2);
			
			int z = x/y;
			
			System.out.println(z);
			
		} 
		catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Forneça um número inteiro");
		}
		catch (ArithmeticException erro) {
			JOptionPane.showMessageDialog(null, "Divisão por Zero");
		}
		finally{
			JOptionPane.showMessageDialog(null, "Fim");
		}
		
		
	}

}
