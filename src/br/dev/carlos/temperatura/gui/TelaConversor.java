package br.dev.carlos.temperatura.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.dev.carlos.temperatura.model.Temperatura;

public class TelaConversor {
	
	//criando atributos para a classe
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	
	
	//metodos para a classe
	public void criarTelaConversor() {
		
		//Configuracões da tela
		JFrame tela = new JFrame();
		tela.setTitle("Conversor de Temperatura:");
		tela.setSize(600, 500);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);
		
		//criar componentes da tela
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius: ");
		labelCelsius.setBounds(20, 40, 560, 15);
		
		textCelsius = new JTextField();
		textCelsius.setBounds(20, 65, 560, 50);
		
		//botões da tela
	    buttonFahreinheit = new JButton();
	    buttonFahreinheit.setText("FAHREINHEIT");
	    buttonFahreinheit.setBounds(20, 125, 270, 60);
	    
	    buttonKelvin = new JButton();
	    buttonKelvin.setText("KELVIN");
	    buttonKelvin.setBounds(310, 125, 270, 60);
	    
	    //Resultados
	    
	    labelResultado = new JLabel();
	    labelResultado.setBounds(100, 200, 400, 60);
	    labelResultado.setHorizontalAlignment(SwingConstants.CENTER);
	    Font fonte1 = new Font("Bold", 20, 30);
	    labelResultado.setFont(fonte1);
	    
	    labelMensagemErro = new JLabel();
	    labelMensagemErro.setBounds(100, 280, 400, 60);
	    labelMensagemErro.setText("Erro: valor de grau(s) celsius inválido");
	    labelMensagemErro.setVisible(false);
	    labelMensagemErro.setForeground(Color.red);
	    labelMensagemErro.setHorizontalAlignment(SwingConstants.CENTER);

		
		//No painel executa o que adicionamos no contentPane
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);
		
		//funcao dos botoes
		buttonFahreinheit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String celsius = textCelsius.getText();
				
				try{
					Temperatura temperatura = new Temperatura();
					double celsiusDouble = Double.valueOf(celsius);
					temperatura.setCelsius(celsiusDouble);
					double fahreinheit = temperatura.converterParaFahreinheit();
				
					labelResultado.setText(fahreinheit + " FAHREINHEIT");
					labelResultado.setVisible(true);
					labelMensagemErro.setVisible(false);
					
				}catch (Exception ex) {
					labelResultado.setVisible(false);
					labelMensagemErro.setVisible(true);
					
				}
					
			}
		});
		
		buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String celsius = textCelsius.getText();
				
				try {
					Temperatura temperatura2 = new Temperatura();
					double celsiusDouble = Double.valueOf(celsius);
					temperatura2.setCelsius(celsiusDouble);
					double kelvin = temperatura2.converterParaKelvin();
				
					labelResultado.setText(kelvin + " KELVIN");
					labelResultado.setVisible(true);
					labelMensagemErro.setVisible(false);
				
				} catch (Exception ex) {
					labelResultado.setVisible(false);
					labelMensagemErro.setVisible(true);
				}
			}
		});
		
		//Essa deve ser a última linha, para que a tela se torne visível
		tela.setVisible(true);
	}
	
	
}
