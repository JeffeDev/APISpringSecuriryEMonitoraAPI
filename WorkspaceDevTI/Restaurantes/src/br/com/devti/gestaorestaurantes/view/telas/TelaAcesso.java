package br.com.devti.gestaorestaurantes.view.telas;

import java.awt.Dialog.ModalExclusionType;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import br.com.devti.gestaorestaurantes.core.entity.AcessoEntity;
import br.com.devti.gestaorestaurantes.core.service.AcessoService;
import br.com.devti.gestaorestaurantes.core.util.exception.NegocioException;

public class TelaAcesso extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField fieldLogin;
	private JTextField fieldSenha;

	public TelaAcesso() {
		setResizable(false);
		addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent e) {

			}
		});
		setType(Type.UTILITY);
		setTitle("Controle de Restaurantes");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAcesso.class.getResource("/resource/restaurante.png")));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(500, 100, 334, 300);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Acesso");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));

		JLabel lblNewLabel_1 = new JLabel("Login:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNewLabel_1_1 = new JLabel("Senha:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JButton btnAcessarButton = new JButton("Acessar");
		
		btnAcessarButton.setIcon(new ImageIcon(TelaAcesso.class.getResource("/resource/verificar.png")));
		btnAcessarButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				AcessoEntity acesso = new AcessoEntity();
				acesso.setLogin(fieldLogin.getText());
				acesso.setSenha(fieldSenha.getText());
				
				setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
				
				try {
					
					boolean permissao = new AcessoService().verificarAcessoUsuario(acesso);

					limparCampos();
					
					if (permissao) {
						
						setVisible(false);
						MenuPrincipal mainMenu = new MenuPrincipal();
						mainMenu.setVisible(permissao);
						
					} else {
						JOptionPane.showMessageDialog(null, "Acesso negado");
					}
				} catch (NegocioException e1) {
					JOptionPane.showMessageDialog(null, e1.getMensagemDeErro(), "Erro", JOptionPane.ERROR_MESSAGE);
				}
			}

			private void limparCampos() {
				fieldLogin.setText("");
				fieldSenha.setText("");
			}

		});
		btnAcessarButton.setFont(new Font("Tahoma", Font.PLAIN, 14));

		fieldLogin = new JTextField();
		fieldLogin.setColumns(10);

		fieldSenha = new JTextField();
		fieldSenha.setColumns(10);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING,
						gl_contentPane.createSequentialGroup().addGap(76)
								.addComponent(btnAcessarButton, GroupLayout.PREFERRED_SIZE, 155,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(193, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup().addGap(36)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 62,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(fieldSenha, GroupLayout.PREFERRED_SIZE, 234,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel_1)
								.addComponent(fieldLogin, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(154, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap(522, Short.MAX_VALUE)
						.addComponent(lblNewLabel).addGap(124)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(6).addComponent(lblNewLabel).addGap(18)
						.addComponent(lblNewLabel_1).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(fieldLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(fieldSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
						.addComponent(btnAcessarButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGap(32)));
		contentPane.setLayout(gl_contentPane);
	}
}
