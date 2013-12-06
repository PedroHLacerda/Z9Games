package br.com.z9games.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.z9games.controle.ControleDeCliente;
import br.com.z9games.negorcio.Cliente;

import javax.swing.DefaultComboBoxModel;

public class TelaCadastroCliente extends JDialog {

	private JTextField tfNome;
	private JTextField tfEndereco;
	private JTextField tfBairro;
	private JTextField tfCidade;
	private JTextField tfCep;
	private JTextField tfTelCel;
	private JButton btnSalvar;
	private JButton btnCancelar;
	private JPanel painel_centro;
	private JTextField tfCPF;
	private ControleDeCliente controleCliente;
	private JComboBox<String> comboBoxeEstado;
	private JComboBox<String> comboBoxSexo;

	public TelaCadastroCliente() {

		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setResizable(false);
		setSize(536, 320);
		setLocationRelativeTo(null);
		setTitle("Cadastro de Clientes");
		getContentPane().setLayout(new BorderLayout(0, 0));

		controleCliente = new ControleDeCliente();

		JLabel lblCadastroDeClientes = new JLabel("Cadastro de Clientes");

		getContentPane().add(lblCadastroDeClientes, BorderLayout.NORTH);

		JPanel painel_inferior = new JPanel();
		getContentPane().add(painel_inferior, BorderLayout.SOUTH);

		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new trataEventos());
		painel_inferior.add(btnSalvar);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		painel_inferior.add(horizontalStrut);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new trataEventos());
		painel_inferior.add(btnCancelar);

		painel_centro = new JPanel();
		getContentPane().add(painel_centro, BorderLayout.CENTER);
		painel_centro.setLayout(null);
		painel_centro.setBorder(BorderFactory
				.createTitledBorder("Dados Pessoais"));

		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setBounds(10, 65, 58, 14);
		painel_centro.add(lblEndereco);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 32, 58, 14);
		painel_centro.add(lblNome);

		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 131, 58, 14);
		painel_centro.add(lblBairro);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(229, 130, 57, 14);
		painel_centro.add(lblCidade);

		tfNome = new JTextField();
		tfNome.setBounds(75, 27, 430, 20);
		painel_centro.add(tfNome);
		tfNome.setColumns(10);

		tfEndereco = new JTextField();
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(75, 61, 430, 20);
		painel_centro.add(tfEndereco);

		tfBairro = new JTextField();
		tfBairro.setColumns(10);
		tfBairro.setBounds(75, 129, 144, 20);
		painel_centro.add(tfBairro);

		tfCidade = new JTextField();
		tfCidade.setColumns(10);
		tfCidade.setBounds(281, 128, 102, 20);
		painel_centro.add(tfCidade);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(396, 131, 58, 14);
		painel_centro.add(lblEstado);

		JLabel lblCep = new JLabel("Cep:");
		lblCep.setBounds(10, 169, 58, 14);
		painel_centro.add(lblCep);

		tfCep = new JTextField();
		tfCep.setColumns(10);
		tfCep.setBounds(75, 163, 144, 20);
		painel_centro.add(tfCep);

		JLabel lblTelefone = new JLabel("Tel/Cel:");
		lblTelefone.setBounds(229, 169, 57, 14);
		painel_centro.add(lblTelefone);

		tfTelCel = new JTextField();
		tfTelCel.setColumns(10);
		tfTelCel.setBounds(281, 166, 102, 20);
		painel_centro.add(tfTelCel);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 98, 58, 14);
		painel_centro.add(lblCpf);

		tfCPF = new JTextField();
		tfCPF.setColumns(10);
		tfCPF.setBounds(75, 95, 144, 20);
		painel_centro.add(tfCPF);

		comboBoxeEstado = new JComboBox<String>();
		comboBoxeEstado.setModel(new DefaultComboBoxModel<String>(new String[] {
				"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA",
				"MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN",
				"RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
		comboBoxeEstado.setBounds(441, 128, 64, 20);
		painel_centro.add(comboBoxeEstado);

		JLabel label = new JLabel("Sexo:");
		label.setBounds(396, 169, 43, 14);
		painel_centro.add(label);

		comboBoxSexo = new JComboBox<>();
		comboBoxSexo.setModel(new DefaultComboBoxModel<>(new String[] { "M",
				"F" }));
		comboBoxSexo.setBounds(441, 166, 64, 20);
		painel_centro.add(comboBoxSexo);

	}
// classe responsavel por executar a ação de um usuario
	private class trataEventos implements ActionListener {

		private Cliente cliente;

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnSalvar) {
				cliente = new Cliente();
				String estado = comboBoxeEstado.getSelectedItem() + " ";
				String sexo = comboBoxSexo.getSelectedItem() + " ";
				try {
					cliente.setBairro(tfBairro.getText());
					cliente.setCep(tfCep.getText());
					cliente.setCidade(tfCidade.getText());
					cliente.setCpf(tfCPF.getText());
					cliente.setEndereco(tfEndereco.getText());
					cliente.setEstado(estado);
					cliente.setNome(tfNome.getText());
					cliente.setSexo(sexo);
					cliente.setTel(tfTelCel.getText());
					controleCliente.salvarCliente(cliente);

				} catch (Exception e1) {

					JOptionPane.showMessageDialog(null, e1.getMessage());
				}

			}// fim do if
			
			if(e.getSource() == btnCancelar){
				if(JOptionPane.showConfirmDialog(null, "Cancelar cadastro?", "CANCELAR"
						+ "", JOptionPane.YES_NO_OPTION) == 0)
			dispose();
			}
		}// fim do método actiomPerformed

	}// fim da class trataEventos

}
