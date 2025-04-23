package dr.dev.gustavodepaula.temperatura.gui;

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
		JFrame tela = new JFrame() ;
		tela.setTitle("Conversor de Temperatura");
		tela.setSize(300, 680);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);

	}
}
