package semana08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GradeCidadeTela extends JFrame {
	private static final long serialVersionUID = 1L;

	private JButton btLocalizar, btSair;
	private JTextField tfLocalizar;
	private JPanel panel;
	private JTable table = new JTable();
	private DefaultTableModel model;
	private BD bd = new BD();

	public static void main(String args[]) {
		JFrame janela = new GradeCidadeTela();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	public GradeCidadeTela() {
		setTitle("Tabela de Cidades");
		setBounds(200, 200, 600, 300);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		btLocalizar = new JButton("Localizar");
		tfLocalizar = new JTextField(10);
		btSair = new JButton("Sair");
		panel = new JPanel();
		panel.setBackground(new Color(230, 230, 230));
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.add(tfLocalizar);
		panel.add(btLocalizar);
		panel.add(btSair);

		add(panel, BorderLayout.NORTH);
		add(table , BorderLayout.CENTER);
		bd.getConnection();
		
		String sql = "select * from cidade";
		
		atualizaTabela(sql);
		definirEventos();

	}

	private void atualizaTabela(String sql) {
		try {
			model = semana08.TableModel.getModel(bd, sql);
			table.setModel(model);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void definirEventos() {
		btSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bd.close();
				System.exit(0);
			}
		});
		
		btLocalizar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sql = "select * from cidade where nome like '" + tfLocalizar.getText() + "%'";
				atualizaTabela(sql);								
			}
		});
		
		tfLocalizar.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				String sql = "select * from cidade where nome like '" + tfLocalizar.getText() + "%'";
				atualizaTabela(sql);
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});

	}
}