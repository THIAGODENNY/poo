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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GradeAbasTela extends JFrame{
	private static final long serialVersionUID = 1L;

	private JTabbedPane tp;
	private JPanel p1, p2, p3;
	private JTable table1, table2, table3;
	private DefaultTableModel model;
	private BD bd = new BD();

	public static void main(String args[]){
		JFrame janela = new GradeAbasTela();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	public GradeAbasTela(){   
		setTitle("Tabela de Cidades");
		setBounds(200,200,500,500);
		setResizable(false);    
		getContentPane().setBackground(Color.white);
		tp = new JTabbedPane();
		tp.setBounds(10, 10, 470, 340);
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p3.setLayout(new FlowLayout());

		tp.add("Regioes", p1);
		tp.add("Estados", p2);
		tp.add("Cidades", p3);
		add(tp);
		
		bd.getConnection();
		try {
			
			model = semana08.TableModel.getModel(bd, "select * from regiao");
			table1 = new JTable(model);
			JScrollPane spRegiao = new JScrollPane(table1);
			p1.add(spRegiao);
			
			model = semana08.TableModel.getModel(bd, "select * from estado");
			table2 = new JTable(model);
			JScrollPane spEstado = new JScrollPane(table2);
			p2.add(spEstado);
			
			model = semana08.TableModel.getModel(bd, "select * from cidade");
			table3 = new JTable(model);
			JScrollPane spCidade = new JScrollPane(table3);
			p3.add(spCidade);
			

		}catch (IllegalArgumentException e) {
			// TODO: handle exception
		}
				

	} 
}