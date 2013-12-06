package br.com.z9games.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JTabbedPane;

import br.com.z9games.controle.ControleDeCliente;
import br.com.z9games.controle.ControleDeGame;
import br.com.z9games.negorcio.Game;

public class TelaCadastroGame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNome = new JLabel("Nome:");
	private JTextField textNome;
	private JTextField textPlataforma;
	private JTextField textDataLancamento;
	private JTextField textPreco;
	private JButton btnCadastrar;

	public TelaCadastroGame() {
		setTitle("Cadastro de Games");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		lblNome.setBounds(10, 11, 98, 31);
		panel.add(lblNome);

		textNome = new JTextField();
		textNome.setBounds(47, 16, 367, 20);
		panel.add(textNome);
		textNome.setColumns(10);

		JLabel lblPlataforma = new JLabel("Plataforma:");
		lblPlataforma.setBounds(10, 53, 88, 14);
		panel.add(lblPlataforma);

		textPlataforma = new JTextField();
		textPlataforma.setBounds(77, 50, 140, 20);
		panel.add(textPlataforma);
		textPlataforma.setColumns(10);

		JLabel lblData = new JLabel("Data de Lan\u00E7amento:");
		lblData.setBounds(10, 78, 132, 14);
		panel.add(lblData);

		textDataLancamento = new JTextField();
		textDataLancamento.setBounds(137, 76, 121, 17);
		panel.add(textDataLancamento);
		textDataLancamento.setColumns(10);

		JLabel lblNewLabel = new JLabel("Pre\u00E7o:");
		lblNewLabel.setBounds(227, 53, 49, 14);
		panel.add(lblNewLabel);

		textPreco = new JTextField();
		textPreco.setColumns(10);
		textPreco.setBounds(266, 53, 98, 17);
		panel.add(textPreco);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Opera\u00E7\u00F5es",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 120, 404, 72);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new TrataEventos());
		panel_1.add(btnCadastrar);

		JButton btnCancelar = new JButton("Cancelar");
		panel_1.add(btnCancelar);
	}

	private class TrataEventos implements ActionListener {

		private ControleDeGame controle;
		private Game game;

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnCadastrar) {

				game = new Game();
				controle = new ControleDeGame();
				double preco = Double.parseDouble(textPreco.getText());

				game.setNome(textNome.getText());
				game.setPlataforma(textPlataforma.getText());
				game.setDataLancamento(textDataLancamento.getText());
				game.setPreco(preco);

				try {
					controle.salvarGame(game);
				} catch (Exception e1) {

					JOptionPane.showMessageDialog(null, e1.getMessage());

				}
			}
		}

	}
}
