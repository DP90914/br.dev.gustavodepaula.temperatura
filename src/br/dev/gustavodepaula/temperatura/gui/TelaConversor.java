package br.dev.gustavodepaula.temperatura.gui;

//importacoes
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

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

	//funçao da classe
	public void criarTelaConversor() {
		//Criaçao da tela de seus principais atributos
		JFrame tela = new JFrame();	
		tela.setTitle("Conversor de Temperatura");	
		tela.setSize(500, 350);	
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		tela.setLayout(null);
		tela.setResizable(false);
		
		//criacao dos componemtes da tela 
		labelCelcius = new JLabel();
		labelCelcius.setText("Temperatura em graus celsius");
		//coloca a localizacao
		labelCelcius.setBounds(160, 40, 200, 30);

		textCelcius = new JTextField();
		textCelcius.setText("");
		//coloca a localizacao
		textCelcius.setBounds(40, 70, 413, 50);

		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		//coloca a localizacao
		buttonKelvin.setBounds(40, 120, 200, 50);

		buttonFahreiheit = new JButton();
		buttonFahreiheit.setText("FAREIHEIT");
		//coloca a localizacao
		buttonFahreiheit.setBounds(250, 120, 200, 50);
		
		labelResultado = new JLabel();
		labelResultado.setText("");
		//coloca a localizacao
		labelResultado.setBounds(160, 190, 400, 50);
		labelResultado.setVisible(false);
		//aplicando uma fonte em negrito
		Font fonteTamanho = new Font("Bold", 20, 30);
		labelResultado.setFont(fonteTamanho);
		
		labelMensagemErro = new JLabel();
		labelMensagemErro.setText("Esta incorreto, deve ser usado um numero");
		//coloca a localizacao
		labelMensagemErro.setBounds(120, 200, 350, 30);
		
		//Aplicando cor da fonte
		Color corlabelErro = new Color(255,0,0);
		labelMensagemErro.setForeground(corlabelErro);
		//tornando a mensagem de erro invisivel
		labelMensagemErro.setVisible(false);

		//acao do botao "kelvin"
		buttonKelvin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// criar variavel que recebe o texto 
				String textCelsius = textCelcius.getText();	

				try {
					Temperatura temperatura = new Temperatura();
					
					//transforma a variavel em double
					double celsius = Double.parseDouble(textCelsius);
					
					//envia a temperatura para classe responsavel pela conversao
					temperatura.setCelsius(celsius);
					
					//realizacao da conversao
					double kelvin = temperatura.converterKelvin();
					
					// adiciona o texto ao campo de resultado
					labelResultado.setText(kelvin + " kelvin");
					
					//torna o campo de resultado visivel
					labelResultado.setVisible(true);
					
					//depois que o botao e apertado a barra de edicao de texto e direcionada ao campo de texto
					textCelcius.requestFocus();
					
					//torna a mensagem de erro visivel
					labelMensagemErro.setVisible(false);
				}
				//caso a tenha um erro
				catch(Exception ex){
					
					//o resultado se torna invisivel
					labelResultado.setVisible(false);
					
					//a mensagem de erro se torna visivel
					labelMensagemErro.setVisible(true);
					
					//a barra de edicao de texto e direcionada ao campo de texto
					textCelcius.requestFocus();
				}
			}
		});
		//acao do botao "fahreiheit"
		buttonFahreiheit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// criar variavel que recebe o texto 
				String textCelsius = textCelcius.getText();		
				try {
					
					Temperatura temperatura = new Temperatura();
	
					//transforma a variavel em double
					double celsius = Double.parseDouble(textCelsius);	
					
					//envia a temperatura para classe responsavel pela conversao
					temperatura.setCelsius(celsius);
					
					//realizacao da conversao
					double fahreiheit = temperatura.converterFahreiheit();
					
					//o ponto decimal e arredondado o resultado
					DecimalFormat decimal = new DecimalFormat("0.0");
					String valorFormatado = decimal.format(fahreiheit);
					
					// adiciona o texto ao campo de resultado
					labelResultado.setText(valorFormatado + " fahreiheit");
					
					//torna o campo de resultado visivel
					labelResultado.setVisible(true);
					
					//depois que o botao e apertado a barra de edicao de texto e direcionada ao campo de texto
					textCelcius.requestFocus();
					//torna a mensagem de erro visivel
					labelMensagemErro.setVisible(false);

			}
				//caso a tenha um erro
				catch(Exception ex){
					
					//o resultado se torna invisivel
					labelResultado.setVisible(false);
					
					//a mensagem de erro se torna visivel
					labelMensagemErro.setVisible(true);
				
					//a barra de edicao de texto e direcionada ao campo de texto
					textCelcius.requestFocus();
				}
			}
		});
		
		//adiciona a tela e torna visivel
		tela.getContentPane().add(labelCelcius);
		tela.getContentPane().add(textCelcius);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahreiheit);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);
		tela.setVisible(true);
	}
}
