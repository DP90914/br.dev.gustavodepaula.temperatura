package br.dev.gustavodepaula.temperatura.gui;

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
		tela.setSize(500, 1000);
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

		buttonKelvin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Temperatura temperatura = new Temperatura();

				String celsius = textCelcius.getText();
				double celsiusDouble = Double.valueOf(celsius);
				temperatura.converterKelvin(celsiusDouble);
				System.out.println(celsiusDouble);
			}
		});

		tela.getContentPane().add(labelCelcius);
		tela.getContentPane().add(textCelcius);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(buttonFahreiheit);
		tela.setVisible(true);
	}
}
