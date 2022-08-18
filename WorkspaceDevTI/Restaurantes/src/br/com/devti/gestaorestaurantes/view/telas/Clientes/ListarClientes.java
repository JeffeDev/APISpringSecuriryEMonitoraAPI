package br.com.devti.gestaorestaurantes.view.telas.Clientes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Label;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import br.com.devti.gestaorestaurantes.core.entity.UsuarioEntity;
import br.com.devti.gestaorestaurantes.core.service.UsuarioService;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarClientes {

	private JFrame frame;
	private JTable table;
	private List<UsuarioEntity> usuarios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarClientes window = new ListarClientes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListarClientes() {
		initialize();
		popularTebela();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 772, 398);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel painelLateral = new JPanel();
		painelLateral.setBackground(new Color(240, 240, 240));
		frame.getContentPane().add(painelLateral, BorderLayout.WEST);
		
		JButton btnExcluir = new JButton("Excluir Cliente");
		
		JButton btnNewButton_1 = new JButton("Cadastrar Novo Cliente");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnNewButton = new JButton("Alterar Cliente");
		
		JButton btnGrupoDeClientes = new JButton("Grupo de Usuários");
		
		JButton btnCadastrarSenhaApp = new JButton("Cadastrar Senha Usuário App");
		btnCadastrarSenhaApp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarSenhaUsuarioApp cadastrarSenha = new CadastrarSenhaUsuarioApp();
				cadastrarSenha.setVisible(true);
			}
		});
		GroupLayout gl_painelLateral = new GroupLayout(painelLateral);
		
		gl_painelLateral.setHorizontalGroup(
			gl_painelLateral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelLateral.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_painelLateral.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
						.addComponent(btnExcluir, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
						.addComponent(btnCadastrarSenhaApp, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnGrupoDeClientes, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_painelLateral.setVerticalGroup(
			gl_painelLateral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelLateral.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExcluir)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCadastrarSenhaApp)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnGrupoDeClientes)
					.addContainerGap(345, Short.MAX_VALUE))
		);
		painelLateral.setLayout(gl_painelLateral);
		
		JPanel painelTop = new JPanel();
		frame.getContentPane().add(painelTop, BorderLayout.NORTH);
		
		Label label = new Label("Sistema Controle de Restaurantes");
		painelTop.add(label);
		
		Label label_1 = new Label("Tela:");
		painelTop.add(label_1);
		
		JPanel painelListagens = new JPanel();
		frame.getContentPane().add(painelListagens, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_painelListagens = new GroupLayout(painelListagens);
		gl_painelListagens.setHorizontalGroup(
			gl_painelListagens.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_painelListagens.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 495, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_painelListagens.setVerticalGroup(
			gl_painelListagens.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_painelListagens.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(174, Short.MAX_VALUE))
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UsuarioEntity usuarioEntity = usuarios.get(table.getSelectedRow());
				JOptionPane.showMessageDialog(null, "Nome Clicado é " + usuarioEntity.getNome());
			}
		});
		table.setColumnSelectionAllowed(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Nome", "Email", "Telefone", "Login"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(44);
		table.getColumnModel().getColumn(1).setPreferredWidth(162);
		table.getColumnModel().getColumn(2).setPreferredWidth(172);
		table.getColumnModel().getColumn(3).setPreferredWidth(116);
		table.getColumnModel().getColumn(4).setPreferredWidth(101);
		
		painelListagens.setLayout(gl_painelListagens);
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
										usuarioEntity.getTelefone(),
										usuarioEntity.getLogin()
									   });
			}

		} catch (NegocioException e ) {
			JOptionPane.showMessageDialog(null, "Erro ao buscar Cliente no Banco: " + e.getMensagemDeErro()	);
		}
		
	}
}
