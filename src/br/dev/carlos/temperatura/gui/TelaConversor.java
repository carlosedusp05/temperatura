package br.dev.carlos.temperatura.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConversor {
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;

	public void criarTelaConversor() {
		
		JFrame tela = new JFrame();
		tela.setTitle("Conversor de Temperatura:");
		tela.setSize(600, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);
		
		//criar componentes da tela
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius: ");
		labelCelsius.setBounds(20, 40, 560, 15);
		
		textCelsius = new JTextField();
		textCelsius.setBounds(20, 60, 560, 30);
		
		//botões da tela
	    buttonFahreinheit = new JButton();
	    buttonFahreinheit.setText("FAHREINHEIT");
	    buttonFahreinheit.setBounds(0, 0, 0, 0);
	    
	    buttonKelvin = new JButton();
	    buttonKelvin.setText("KELVIN");
	    buttonKelvin.setBounds(0, 0, 0, 0);
	    
	    labelResultado = new JLabel();
	    labelResultado.setBounds(0, 0, 0, 0);
	    
	    
	    labelMensagemErro = new JLabel();
	    labelMensagemErro.setBounds(0, 0, 0, 0);
		
		//Obtemos no painel o que adicionamos no contentPane
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);
		
		//Essa deve ser a última linha
		tela.setVisible(true);
	}
	
	
}
