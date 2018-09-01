package semana05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuPI extends JFrame {
	private JMenuBar menuBar;
	private JMenu mnArquivo, mnCadastro;
	private JMenuItem miSair, miCliente, miProduto;

	public MenuPI() {
		setTitle("Projeto Interdisciplinar");
		setBounds(0, 0, 800, 600);
		setLayout(null);
		menuBar = new JMenuBar();

		mnArquivo = new JMenu("Arquivo");
		mnCadastro = new JMenu("Cadastro");
		miSair = new JMenuItem("Sair");

		miCliente = new JMenuItem("Cliente");
		miProduto = new JMenuItem("Produto");

		mnArquivo.add(miSair);
		mnCadastro.add(miCliente);
		mnCadastro.add(miProduto);

		menuBar.add(mnArquivo);
		menuBar.add(mnCadastro);

		setJMenuBar(menuBar);
		setLocationRelativeTo(null);
		setResizable(false);
		
		definirEventos();
	}
	
	public void definirEventos() {
		miCliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MeuPI meuPI = new MeuPI();
				meuPI.setVisible(true);
				
			}
		});
		
		miSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}
	
	
	
	public static void main(String[] args) {
		MenuPI m = new MenuPI();
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
