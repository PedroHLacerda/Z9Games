package br.com.z9games.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JLabel lblImgPrincipal;
	private JPanel painelImagemPrincipal;
	private Icon imagemPrincipal;
	private Icon imagemAddCliente;
	private JButton btnCadCliente;
	private JButton btnConsultarCliente;
	private JPanel panel_3;
	private JPanel panel_2;
	private JButton btnSair;
	private JButton btnCadastroGame;
	private JButton btnConsultarUmJogo;
	private JButton btnComprar;

	/**
	 * Create the frame.
	 */
	// Configurando a Janela
	public TelaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipal.class.getResource("/br/com/z9games/gui/imagens/IconGames.png")));

		// Handler handler = new Handler();
		// Container container = getContentPane();
		//
		// container.setLayout(new BorderLayout());
		//
		// //Barra de Menus
		// JMenuBar menubar = new JMenuBar();
		//
		// //Menu AJUDA
		// JMenu ajuda = new JMenu("Ajuda");
		// menubar.add(ajuda);
		// setJMenuBar(menubar);
		//
		// JMenuItem jmiSobre = new JMenuItem("Sobre Z9Games");
		// jmiSobre.addActionListener(handler);
		// ajuda.add(jmiSobre);

		setTitle("..:: Z9Games ::..  A sua loja de compras de jogos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(612, 480);
		setLocationRelativeTo(null);
		// setSize(800, 600);
		// setResizable(false);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Operacoes",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_1.setBounds(10, 11, 581, 108);
		panel.add(panel_1);
		panel_1.setLayout(null);

		btnComprar = new JButton("comprar");
		btnComprar.setIcon(new ImageIcon(
				TelaPrincipal.class
						.getResource("/br/com/z9games/gui/imagens/cart-icon (Custom).png")));
		btnComprar.setToolTipText("Comprar Jogo");
		btnComprar.setBounds(466, 55, 89, 42);
		panel_1.add(btnComprar);

		btnSair = new JButton("sair");
		btnSair.setIcon(new ImageIcon(
				TelaPrincipal.class
						.getResource("/br/com/z9games/gui/imagens/Sign-Shutdown-icon (Custom).png")));
		btnSair.setToolTipText("Sair da Tela");
		btnSair.setBounds(466, 11, 89, 42);
		panel_1.add(btnSair);
		btnSair.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
System.exit(0);				
			}
		});

		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Cliente",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 21, 209, 76);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		btnCadCliente = new JButton("");
		btnCadCliente.addActionListener(new TrataEvento());
		btnCadCliente
				.setIcon(new ImageIcon(
						TelaPrincipal.class
								.getResource("/br/com/z9games/gui/imagens/1297713679_list-add-user (Custom).png")));
		btnCadCliente.setBounds(10, 23, 89, 42);
		panel_2.add(btnCadCliente);
		btnCadCliente.setToolTipText("Adicionar um cliente");

		btnConsultarCliente = new JButton("consultar");
		btnConsultarCliente
				.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/br/com/z9games/gui/imagens/procurarCliente.png")));
		btnConsultarCliente.setToolTipText("Consultar Cliente");
		btnConsultarCliente.setBounds(109, 23, 89, 42);
		panel_2.add(btnConsultarCliente);
		btnConsultarCliente.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Games",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(226, 21, 209, 76);
		panel_1.add(panel_3);

		btnCadastroGame = new JButton("");
		btnCadastroGame.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/br/com/z9games/gui/imagens/addGames.png")));
		btnCadastroGame.addActionListener(new TrataEvento());
		btnCadastroGame.setToolTipText("Adicionar um Jogo");
		btnCadastroGame.setBounds(10, 23, 89, 42);
		panel_3.add(btnCadastroGame);

		btnConsultarUmJogo = new JButton("");
		btnConsultarUmJogo.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/br/com/z9games/gui/imagens/Search-icon (Custom).png")));
		btnConsultarUmJogo.setToolTipText("Consultar Jogo");
		btnConsultarUmJogo.setBounds(109, 23, 89, 42);
		panel_3.add(btnConsultarUmJogo);

		painelImagemPrincipal = new JPanel();
		painelImagemPrincipal.setBounds(10, 130, 581, 301);
		panel.add(painelImagemPrincipal);
		painelImagemPrincipal.setLayout(new BorderLayout(0, 0));

		lblImgPrincipal = new JLabel("labelImagemPrincipal");
		lblImgPrincipal.setToolTipText("..:: Z9Games ::..  A sua loja de compras de jogos");
		lblImgPrincipal
				.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/br/com/z9games/gui/imagens/img_TelaPrincipal.png")));
		painelImagemPrincipal.add(lblImgPrincipal, BorderLayout.CENTER);
	}

	private class TrataEvento implements ActionListener {

		private TelaCadastroCliente telaCadastroCliente;
		private TelaCadastroGame telaGame;

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnCadCliente) {

				telaCadastroCliente = new TelaCadastroCliente();
				telaCadastroCliente.setVisible(true);

			} else if (e.getSource() == btnCadastroGame) {

				telaGame = new TelaCadastroGame();
				telaGame.setVisible(true);

			}

		}

	}
}
