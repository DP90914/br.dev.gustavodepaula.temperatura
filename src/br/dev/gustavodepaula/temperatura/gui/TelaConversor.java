package br.dev.gustavodepaula.temperatura.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.dev.gustavodepaula.temperatura.model.Temperatura;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConversor {
	private JTextField textCelcius;
	private JLabel labelCelcius;
	private JButton buttonKelvin;
	private JButton buttonFahreiheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;

	public void criarTelaConversor() {
		JFrame tela = new JFrame();
		tela.setTitle("Conversor de Temperatura");
		tela.setSize(500, 350);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);

		labelCelcius = new JLabel();
		labelCelcius.setText("Temperatura em graus celsius");
		labelCelcius.setBounds(160, 40, 200, 30);

		textCelcius = new JTextField();
		textCelcius.setText("");
		textCelcius.setBounds(40, 70, 413, 50);

		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(40, 120, 200, 50);

		buttonFahreiheit = new JButton();
		buttonFahreiheit.setText("FAREIHEIT");
		buttonFahreiheit.setBounds(250, 120, 200, 50);
		
		labelResultado = new JLabel();
		labelResultado.setText("");
		labelResultado.setBounds(160, 190, 400, 50);
		labelResultado.setVisible(false);
		Font fonteTamanho = new Font("Bold", 20, 30);
		labelResultado.setFont(fonteTamanho);
		
		labelMensagemErro = new JLabel();
		labelMensagemErro.setText("Esta incorreto, deve ser usado um numero");
		labelMensagemErro.setBounds(120, 200, 350, 30);
		Color corlabelErro = new Color(255,0,0);
		labelMensagemErro.setForeground(corlabelErro);
		labelMensagemErro.setVisible(false);

		buttonKelvin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String textCelsius = textCelcius.getText();		
				try {
					Temperatura temperatura = new Temperatura();
	
				
					double celsius = Double.parseDouble(textCelsius);			
					temperatura.setCelsius(celsius);
					double kelvin = temperatura.converterKelvin();
			
					labelResultado.setText(kelvin + " kelvin");
					labelResultado.setVisible(true);
					textCelcius.requestFocus();
					labelMensagemErro.setVisible(false);
			}
				catch(Exception ex){
					labelResultado.setVisible(false);
					labelMensagemErro.setVisible(true);
					textCelcius.requestFocus();
			}
			}});
		
		buttonFahreiheit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String textCelsius = textCelcius.getText();		
				try {
					Temperatura temperatura = new Temperatura();
	
				
					double celsius = Double.parseDouble(textCelsius);			
					temperatura.setCelsius(celsius);
					double fahreiheit = temperatura.converterFahreiheit();
			
					labelResultado.setText(fahreiheit + " fahreiheit");
					labelResultado.setVisible(true);
					textCelcius.requestFocus();
					labelMensagemErro.setVisible(false);
			}
				catch(Exception ex){
					labelResultado.setVisible(false);
					labelMensagemErro.setVisible(true);
					textCelcius.requestFocus();
			}
			}});
		

		tela.getContentPane().add(labelCelcius);
		tela.getContentPane().add(textCelcius);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahreiheit);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);
		tela.setVisible(true);
	}
}
