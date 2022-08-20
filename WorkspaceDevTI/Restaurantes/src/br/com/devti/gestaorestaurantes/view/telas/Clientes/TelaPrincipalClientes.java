package br.com.devti.gestaorestaurantes.view.telas.Clientes;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;

import br.com.devti.gestaorestaurantes.core.entity.UsuarioEntity;
import br.com.devti.gestaorestaurantes.core.service.UsuarioService;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class TelaPrincipalClientes extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private List<UsuarioEntity> usuarios;
	private JTable table;
	private JButton btnSalvar;
	private JButton btnFechar;
	private JButton btnNovo;
	private JPanel panel;
	private JTextField fieldNome;
	private JTextField fieldEmail;
	private JTextField fieldCep;
	private JTextField fieldRua;
	private JTextField fieldNumero;
	private JTextField fieldBairro;
	private JTextField fieldCidade;
	private JTextField fieldComplemento;
	private JTextField fieldObs;
	private JTextField fieldEstado;
	private JTextField fieldTelefone;
	private JButton btnAlterar;
	private JTextField fieldGps;
	private JLabel lblNewLabel_2_1_6;
	private JTextField fieldLogin;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TelaPrincipalClientes frame = new TelaPrincipalClientes();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipalClientes() {
		setType(Type.UTILITY);
		setTitle("Clientes");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipalClientes.class.getResource("/resource/adicionar-usuario.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300, 20, 841, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnNovo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		panel = new JPanel();
		
		btnAlterar = new JButton("Alterar Senha App");
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAlterar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					AlterarSenhaUsuario frame = new AlterarSenhaUsuario();
					frame.setVisible(true);
				} catch (Exception eCli) {
					eCli.printStackTrace();
				}
			}
			
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 637, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(btnSalvar, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
									.addComponent(btnNovo, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
								.addComponent(btnFechar, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
								.addComponent(btnAlterar)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(8)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(35)
							.addComponent(btnNovo, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addGap(52)
							.addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnFechar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldNome = new JTextField();
		fieldNome.setColumns(10);
		
		JLabel lblNewLabel_2_2 = new JLabel("Email");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldEmail = new JTextField();
		fieldEmail.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("CEP");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldCep = new JTextField();
		fieldCep.setColumns(10);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Rua");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldRua = new JTextField();
		fieldRua.setColumns(10);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Numero");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldNumero = new JTextField();
		fieldNumero.setColumns(10);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Bairro");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldBairro = new JTextField();
		fieldBairro.setColumns(10);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Cidade");
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldCidade = new JTextField();
		fieldCidade.setColumns(10);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Complemento");
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldComplemento = new JTextField();
		fieldComplemento.setColumns(10);
		
		JLabel lblNewLabel_2_1_8 = new JLabel("Coordenadas GPS");
		lblNewLabel_2_1_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldObs = new JTextField();
		fieldObs.setColumns(10);
		
		JLabel lblNewLabel_2_1_8_1 = new JLabel("Obs");
		lblNewLabel_2_1_8_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2_1_5_1 = new JLabel("Estado");
		lblNewLabel_2_1_5_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldEstado = new JTextField();
		fieldEstado.setColumns(10);
		
		JLabel lblNewLabel_2_1_4_1 = new JLabel("Telefone/Celular");
		lblNewLabel_2_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldTelefone = new JTextField();
		fieldTelefone.setColumns(10);
		
		fieldGps = new JTextField();
		fieldGps.setColumns(10);
		
		lblNewLabel_2_1_6 = new JLabel("Login");
		lblNewLabel_2_1_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldLogin = new JTextField();
		fieldLogin.setEnabled(false);
		fieldLogin.setColumns(10);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_1_8_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGap(89)
								.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addGap(399)
								.addComponent(lblNewLabel_2_1_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(fieldCep, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addGap(8)
								.addComponent(fieldRua, GroupLayout.PREFERRED_SIZE, 418, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(fieldNumero, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblNewLabel_2_1_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addGap(124)
								.addComponent(lblNewLabel_2_1_4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addGap(148)
								.addComponent(lblNewLabel_2_1_5_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addGap(5)
								.addComponent(lblNewLabel_2_1_4_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_panel.createSequentialGroup()
										.addGap(2)
										.addComponent(fieldNome, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
									.addComponent(fieldEmail, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED))
							.addComponent(fieldObs)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(fieldComplemento, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2_1_5, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_2_1_8, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
										.addComponent(fieldGps, GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_2_1_6, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
										.addComponent(fieldLogin, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)))
								.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
									.addComponent(fieldBairro, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(fieldCidade, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(fieldEstado, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(fieldTelefone, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)))))
					.addGap(21))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(fieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(fieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_1_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(fieldCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(fieldRua, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(fieldNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_1_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_1_4, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_1_5_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_1_4_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(fieldBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(fieldCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(fieldEstado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(fieldTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_2_1_5, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(fieldComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_2_1_8, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(fieldGps, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_2_1_8_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2_1_6, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(fieldLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(1)
					.addComponent(fieldObs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Id", "Nome", "Email", "Cep", "Endere\u00E7o", "N\u00FAmero", "Bairro", "Cidade", "Complemento", "Estado", "OBS", "GPS", "Login", "Telefone"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(224);
		table.getColumnModel().getColumn(2).setPreferredWidth(180);
		table.getColumnModel().getColumn(4).setPreferredWidth(337);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(5).setPreferredWidth(52);
		table.getColumnModel().getColumn(6).setPreferredWidth(133);
		table.getColumnModel().getColumn(7).setPreferredWidth(174);
		table.getColumnModel().getColumn(8).setPreferredWidth(109);
		table.getColumnModel().getColumn(9).setResizable(false);
		table.getColumnModel().getColumn(9).setPreferredWidth(45);
		table.getColumnModel().getColumn(10).setPreferredWidth(285);
		table.getColumnModel().getColumn(11).setResizable(false);
		table.getColumnModel().getColumn(11).setPreferredWidth(221);
		table.getColumnModel().getColumn(12).setResizable(false);
		table.getColumnModel().getColumn(12).setPreferredWidth(101);
		table.getColumnModel().getColumn(13).setResizable(false);
		table.getColumnModel().getColumn(13).setPreferredWidth(116);
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
		popularTebela();
		habilitarDesabilitarCampos(false);
	}
	
	private void popularTebela() {
		try {
		
		usuarios = new UsuarioService().listar();
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.getDataVector().removeAllElements();
		
		for (UsuarioEntity usuarioEntity : usuarios) {
			model.addRow(new Object[] { usuarioEntity.getId(),
										usuarioEntity.getNome(),
										usuarioEntity.getEmail(),
										usuarioEntity.getCep(),
										usuarioEntity.getEndereco(),
										usuarioEntity.getNumero(),
										usuarioEntity.getBairro(),
										usuarioEntity.getCidade(),
										usuarioEntity.getComplemento(),
										usuarioEntity.getEstado(),
										usuarioEntity.getObs(),
										usuarioEntity.getGps(),
										usuarioEntity.getLogin(),
										usuarioEntity.getTelefone()
									   });
			}

		} catch (NegocioException e ) {
			JOptionPane.showMessageDialog(null, "Erro ao buscar Cliente no Banco: " + e.getMensagemDeErro()	);
		}
		
	}
	private void limparCampos() {
		fieldNome.setText("");
		fieldEmail.setText("");
		fieldCep.setText("");
		fieldRua.setText("");
		fieldNumero.setText("");
		fieldBairro.setText("");
		fieldCidade.setText("");
		fieldComplemento.setText("");
		fieldObs.setText("");
		fieldGps.setText("");
		fieldLogin.setText("");
		fieldEstado.setText("");
		fieldTelefone.setText("");
		
	}
	private void carregarDadosNaTela() {
		UsuarioEntity cli = new UsuarioEntity();
		
		fieldNome.setText(cli.getNome());
		fieldEmail.setText(cli.getEmail());
		fieldCep.setText(cli.getCep());
		fieldRua.setText(cli.getEndereco());
		fieldNumero.setText(cli.getNome());
		fieldBairro.setText(cli.getBairro());
		fieldCidade.setText(cli.getCidade());
		fieldComplemento.setText(cli.getComplemento());
		fieldObs.setText(cli.getObs());
		fieldGps.setText(cli.getGps());
		fieldLogin.setText(cli.getLogin());
		fieldEstado.setText(cli.getEstado());
		fieldTelefone.setText(cli.getTelefone());
		
	}
	
	private void habilitarDesabilitarCampos(final boolean acao) {
		fieldNome.setEnabled(acao);
		fieldEmail.setEnabled(acao);
		fieldCep.setEnabled(acao);
		fieldRua.setEnabled(acao);
		fieldNumero.setEnabled(acao);
		fieldBairro.setEnabled(acao);
		fieldCidade.setEnabled(acao);
		fieldComplemento.setEnabled(acao);
		fieldObs.setEnabled(acao);
		fieldGps.setEnabled(acao);
		fieldLogin.setEnabled(acao);
		fieldEstado.setEnabled(acao);
		fieldTelefone.setEnabled(acao);
	}
}
