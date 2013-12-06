package br.com.z9games.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import br.com.z9games.util.Resource;
import br.com.z9games.controle.*;
import br.com.z9games.dados.*;
import br.com.z9games.negorcio.*;
import br.com.z9games.gui.*;
public class TelaVenda<TratadorEventos, Transacao> extends JPanel{

	//Campos de texto
	private JTextField CodigoCliente;
	private JTextField NomeCliente;
	private JTextField Endereco;
	private JTextField Cidade;
	private JTextField Titulo;
	private JTextField Ano;
	
	//Botões
	private JButton btnAdicionarGame;
	private JButton btnBuscarCliente;
	private JButton btnBuscarGame;
	private JButton btnFinalizar;
	
	//outros
	private Vendas controller = null;
	private Icon icone;
	private TratadorEventos tratadorEventos = null;

	private JList<String> listaGames;
	private DefaultListModel<String> listModel ;
	private JButton btnRemover;
	
	private Transacao Vendas ;
	
	public Icon getIcone() {
		return icone;
	}
		
	public TelaVenda() {
		
		
		setLayout(null);
		
		
	}
}
