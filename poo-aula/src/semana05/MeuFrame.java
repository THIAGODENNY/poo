package semana05;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MeuFrame extends JFrame {

	private JTextField tf;
	private Botao bt;

	public MeuFrame() {
		setBounds(0, 0, 400, 400);
		bt = new Botao("Search");
		tf = new JTextField();
		setLayout(null);
		tf.setBounds(10,10,250,20);
		bt.setBounds(300, 10, 100, 20);
		
		add(tf);
		add(bt);
	}

}
