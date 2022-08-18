package br.com.devti.gestaorestaurantes.view.telas.Clientes;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import br.com.devti.gestaorestaurantes.core.entity.UsuarioEntity;
import br.com.devti.gestaorestaurantes.core.service.UsuarioService;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class CadastrarSenhaUsuarioApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fieldCodigo;
	private JTextField fieldNome;
	private JTextField fieldLogin;
	private JTextField fieldEmail;
	private JPasswordField fieldSenha;
	private JLabel labelNomeValidacao;

	public CadastrarSenhaUsuarioApp() {
		setTitle("Cadastro de Usuário");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 294);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Senha do Usuário");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1 = new JLabel("Código");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldCodigo = new JTextField();
		fieldCodigo.setEnabled(false);
		fieldCodigo.setEditable(false);
		fieldCodigo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldNome = new JTextField();
		fieldNome.setEditable(false);
		fieldNome.setEnabled(false);
		fieldNome.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Login");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldLogin = new JTextField();
		fieldLogin.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Senha");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldEmail = new JTextField();
		fieldEmail.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setIcon(new ImageIcon(CadastrarSenhaUsuarioApp.class.getResource("/resource/caixa-de-selecao.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(fieldNome.getText().equals("")) {
					labelNomeValidacao.setText("Nome não preenchido");
				}else {
				
					UsuarioEntity usuario = new UsuarioEntity();
					usuario.setNome(fieldNome.getText());
					usuario.setLogin(fieldLogin.getText());
					usuario.setSenha(new String(fieldSenha.getPassword()));
					usuario.setEmail(fieldEmail.getText());
					
					try {
						String msg = new UsuarioService().salvar(usuario);
						limparCampos();
						JOptionPane.showMessageDialog(null, msg);					
					}catch(NegocioException e1) {
						JOptionPane.showMessageDialog(null, e1.getMensagemDeErro(), "Erro", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		
		fieldSenha = new JPasswordField();
		
		labelNomeValidacao = new JLabel("");
		labelNomeValidacao.setForeground(Color.RED);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JLabel lblNewLabel_4_1 = new JLabel("Confirmar:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 475, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_2)
										.addComponent(lblNewLabel_3)
										.addComponent(lblNewLabel_4)
										.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
									.addGap(10)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(fieldNome, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
													.addComponent(fieldSenha, 404, 404, Short.MAX_VALUE)
													.addComponent(fieldLogin, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
													.addComponent(fieldEmail, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(labelNomeValidacao))
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblNewLabel_1)
								.addComponent(fieldCodigo, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
								.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(35))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(5)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(fieldCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(fieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelNomeValidacao))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(fieldLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(fieldSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(fieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(173))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	private void limparCampos() {
		fieldCodigo.setText("");
		fieldNome.setText("");
		fieldLogin.setText("");
		fieldSenha.setText("");
		fieldEmail.setText("");
	}
}
