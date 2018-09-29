package semana08;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ComboRegiaoTela extends JFrame {

	private BD bd;
	private JComboBox<String> cbRegiao, cbEstado, cbCidade;
	private JLabel lbRegiao, lbEstado, lbCidade;
	private JTextField tf;
	
	public ComboRegiaoTela() {
		setTitle("Combo com banco de dados");
		setBounds(300,200,750,200);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		tf = new JTextField();
		cbRegiao = new JComboBox<String>();
		cbEstado = new JComboBox<String>();
		cbCidade = new JComboBox<String>();
		lbRegiao = new JLabel("Regiao:  ");
		lbRegiao.setHorizontalAlignment(JLabel.RIGHT);
		lbEstado = new JLabel("Estado:  ");
		lbEstado.setHorizontalAlignment(JLabel.RIGHT);
		lbCidade = new JLabel("Cidade:  ");
		lbCidade.setHorizontalAlignment(JLabel.RIGHT);
		
		definirEventos();
		add(lbRegiao);
		add(cbRegiao);
		add(lbEstado);
	    add(cbEstado);
	    add(lbCidade);
	    add(cbCidade);

	}

	public void definirEventos(){
	}
	

	public static void main(String args[]){
		ComboRegiaoTela janela = new ComboRegiaoTela();
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
