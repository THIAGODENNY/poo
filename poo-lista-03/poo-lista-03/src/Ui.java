
//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Ui extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JTextField deputadoEstadualIn;
	private JLabel jcomp2;
	private static JTextField deputadoFederalIn;
	private JLabel jcomp4;
	private JLabel jcomp5;
	private static JTextField senador01In;
	private static JTextField senador02In;
	private JLabel jcomp8;
	private JLabel jcomp9;
	private static JTextField governadorIn;
	private static JTextField presidenteIn;
	private JLabel jcomp12;
	public static JButton confirmaButton;
	private static JLabel deputadoEstadualOut;
	private static JLabel deputadoFederalOut;
	private static JLabel senador01Out;
	private static JLabel senador02Out;
	private static JLabel governadorOut;
	private static JLabel presidenteOut;
	private static JTextArea resultado;

	public Ui() {
		// construct components
		deputadoEstadualIn = new JTextField(5);
		jcomp2 = new JLabel("Deputado Estadual");
		deputadoFederalIn = new JTextField(5);
		jcomp4 = new JLabel("Deputado Federal");
		jcomp5 = new JLabel("Senador 01");
		senador01In = new JTextField(5);
		senador02In = new JTextField(5);
		jcomp8 = new JLabel("Senador 02");
		jcomp9 = new JLabel("Governador");
		governadorIn = new JTextField(5);
		presidenteIn = new JTextField(5);
		jcomp12 = new JLabel("Presidente");
		confirmaButton = new JButton("Confirma");
		deputadoEstadualOut = new JLabel("Digite Deputado Estadual");
		deputadoFederalOut = new JLabel("Digite Deputado Federal");
		senador01Out = new JLabel("Digite Senador 01");
		senador02Out = new JLabel("Digite Senador 02");
		governadorOut = new JLabel("Digite Governador");
		presidenteOut = new JLabel("Digite Presidente");
		resultado = new JTextArea(5, 5);

		// set components properties
		resultado.setEnabled(false);

		// adjust size and set layout
		setPreferredSize(new Dimension(389, 331));
		setLayout(null);

		// add components
		add(deputadoEstadualIn);
		add(jcomp2);
		add(deputadoFederalIn);
		add(jcomp4);
		add(jcomp5);
		add(senador01In);
		add(senador02In);
		add(jcomp8);
		add(jcomp9);
		add(governadorIn);
		add(presidenteIn);
		add(jcomp12);
		add(confirmaButton);
		add(deputadoEstadualOut);
		add(deputadoFederalOut);
		add(senador01Out);
		add(senador02Out);
		add(governadorOut);
		add(presidenteOut);
		add(resultado);

		// set component bounds (only needed by Absolute Positioning)
		deputadoEstadualIn.setBounds(140, 10, 65, 25);
		jcomp2.setBounds(30, 10, 110, 25);
		deputadoFederalIn.setBounds(140, 35, 65, 25);
		jcomp4.setBounds(35, 35, 105, 25);
		jcomp5.setBounds(70, 60, 70, 25);
		senador01In.setBounds(140, 60, 65, 25);
		senador02In.setBounds(140, 85, 65, 25);
		jcomp8.setBounds(70, 85, 70, 25);
		jcomp9.setBounds(70, 110, 70, 25);
		governadorIn.setBounds(140, 110, 65, 25);
		presidenteIn.setBounds(140, 135, 65, 25);
		jcomp12.setBounds(75, 135, 65, 25);
		confirmaButton.setBounds(145, 165, 100, 25);
		deputadoEstadualOut.setBounds(210, 10, 180, 25);
		deputadoFederalOut.setBounds(210, 35, 180, 25);
		senador01Out.setBounds(210, 60, 180, 25);
		senador02Out.setBounds(210, 85, 180, 25);
		governadorOut.setBounds(210, 110, 180, 25);
		presidenteOut.setBounds(210, 135, 180, 25);
		resultado.setBounds(5, 195, 380, 130);

	}

	public static void atualizaCampoCandidato(Candidato[] candidato, JTextField entrada, JLabel saida) {
		entrada.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				atualizaCandidato(candidato, entrada.getText(), saida);
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				atualizaCandidato(candidato, entrada.getText(), saida);
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				atualizaCandidato(candidato, entrada.getText(), saida);
			}
		});
	}

	private static void atualizaDeputadoEstadual(Candidato[] candidato) {
		atualizaCampoCandidato(candidato, deputadoEstadualIn, deputadoEstadualOut);

	}

	public static void atualizaDeputadoFederal(Candidato[] candidato) {
		atualizaCampoCandidato(candidato, deputadoFederalIn, deputadoFederalOut);
	}

	private static void atualizaSenador01(Candidato[] candidato) {
		atualizaCampoCandidato(candidato, senador01In, senador01Out);
	}

	private static void atualizaSenador02(Candidato[] candidato) {
		atualizaCampoCandidato(candidato, senador02In, senador02Out);
	}

	private static void atualizaGovernador(Candidato[] candidato) {
		atualizaCampoCandidato(candidato, governadorIn, governadorOut);
	}

	private static void atualizaPresidente(Candidato[] candidato) {
		atualizaCampoCandidato(candidato, presidenteIn, presidenteOut);
	}

	public static void atualizaCandidato(Candidato[] candidato, String entrada, JLabel saida) {
		String nome = "";

		try {
			nome = Candidato.procuraCandidato(candidato, Integer.parseInt(entrada)).getNome();
		} catch (Exception e2) {
			saida.setText("Nulo");
		}

		if (nome.length() != 0 && nome != null) {
			saida.setText(nome);
		}
	}

	public static void setResultado(String resultado) {
		Ui.resultado.setText(resultado);
	}

	public static String getDeputadoEstadualIn() {
		return Ui.deputadoEstadualIn.getText();
	}

	public static String getDeputadoFederalIn() {
		return Ui.deputadoFederalIn.getText();
	}

	public static String getSenador01In() {
		return Ui.senador01In.getText();
	}

	public static String getSenador02In() {
		return Ui.senador02In.getText();
	}

	public static String getGovernadorIn() {
		return Ui.governadorIn.getText();
	}

	public static String getPresidenteIn() {
		return Ui.presidenteIn.getText();
	}

	public static void startUI() {
		JFrame frame = new JFrame("Urna");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Ui());
		frame.pack();
		frame.setVisible(true);
	}

	public static void atualizaCandidatos(Candidato[] candidatos) {
		Ui.atualizaDeputadoEstadual(candidatos);
		Ui.atualizaDeputadoFederal(candidatos);
		Ui.atualizaSenador01(candidatos);
		Ui.atualizaSenador02(candidatos);
		Ui.atualizaGovernador(candidatos);
		Ui.atualizaPresidente(candidatos);
	}

}
