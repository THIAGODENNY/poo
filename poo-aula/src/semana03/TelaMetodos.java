package semana03;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaMetodos extends JFrame {

	/**
	 * @param args
	 */

	private JLabel lbNum1, lbNum2, lbRes;
	private JTextField tfNum1, tfNum2, tfRes;
	private JButton btSomar, btSubtrair, btMultiplicar, btDividir;

	public TelaMetodos() {
		setTitle("Calculadora");
		setBounds(400, 400, 200, 200);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new GridLayout(5, 2));

		lbNum1 = new JLabel("Num1:");
		lbNum2 = new JLabel("Num2:");
		lbRes = new JLabel("Total:");

		tfNum1 = new JTextField();
		tfNum2 = new JTextField();
		tfRes = new JTextField();

		tfRes.setEditable(false);

		btSomar = new JButton("+");
		btSomar.setMnemonic('s');
		btSubtrair = new JButton("-");
		btMultiplicar = new JButton("*");
		btDividir = new JButton("/");

		add(lbNum1);
		add(tfNum1);
		add(lbNum2);
		add(tfNum2);
		add(lbRes);
		add(tfRes);

		add(btSomar);
		add(btSubtrair);
		add(btMultiplicar);
		add(btDividir);

		btSomar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				calcular("+");
			}
		});

		btSubtrair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				calcular("-");
			}
		});

		btMultiplicar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				calcular("*");
			}
		});

		btDividir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				calcular("/");
			}
		});

	}
	
	public void calcular(String op){
		try {
			double x = Double.parseDouble(tfNum1.getText());
			double y = Double.parseDouble(tfNum2.getText());
			double r = Metodos.calcular(x, y, op);

			tfRes.setText(r + "");
		} catch (NumberFormatException e) {
			JOptionPane
					.showMessageDialog(null, "Digite apenas números");
		}		
	}

	public static void main(String[] args) {
		TelaMetodos telaMetodos = new TelaMetodos();
		telaMetodos.setVisible(true);

	}

}
