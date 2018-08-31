package semana01;

import javax.swing.JOptionPane;

public class UsaExemplo05Usuario {
	
	public static void main(String[] args) {
//		String s = JOptionPane.showInputDialog("Digite seu nome:");
		String operacao = JOptionPane.showInputDialog(" digite a opera��o desejada:");
		String operador;
		String operador2;
		
		if(operacao.contains("+")) {
			operador="\\+";
			operador2 = "+";
			
		}
		else if(operacao.contains("-")) {
			operador="\\-";
			operador2 = "-";
		}
		else if(operacao.contains("/")) {
			operador="\\/";
			operador2 = "/";
		}
		else if(operacao.contains("*")) {
			operador="\\*";
			operador2 = "*";
		}
		else {
			operador= " ";
			operador2 = " ";
		}
		
		String[] op = operacao.split(operador);
			
		String[] op2 = {op[0] , operador2 , op[1]};	
	
		Exemplo05.main(op2);
		
	}

}
