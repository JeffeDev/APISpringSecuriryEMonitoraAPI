package br.com.devti.gestaorestaurantes.view.telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Label;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
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
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 730, 566);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel painelLateral = new JPanel();
		frame.getContentPane().add(painelLateral, BorderLayout.WEST);
		
		JButton btnExcluir = new JButton("Cadastrar Clientes e Acesso ao APP");
		
		JButton btnNewButton_1 = new JButton("Cadastrar Fornecedores");
		
		JButton btnNewButton = new JButton("Cadastrar Produtos");
		
		JButton btnCadastrarFormaPagto = new JButton("Cadastrar Forma Pagto");
		btnCadastrarFormaPagto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnLanarPedidos = new JButton("Lançar Pedidos");
		GroupLayout gl_painelLateral = new GroupLayout(painelLateral);
		gl_painelLateral.setHorizontalGroup(
			gl_painelLateral.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_painelLateral.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_painelLateral.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnLanarPedidos, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
						.addComponent(btnCadastrarFormaPagto, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
						.addComponent(btnExcluir, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
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
					.addComponent(btnCadastrarFormaPagto)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnLanarPedidos)
					.addContainerGap(345, Short.MAX_VALUE))
		);
		painelLateral.setLayout(gl_painelLateral);
		
		JPanel painelTop = new JPanel();
		frame.getContentPane().add(painelTop, BorderLayout.NORTH);
		
		Label label = new Label("Sistema Controle de Restaurantes");
		painelTop.add(label);
		
		Label label_1 = new Label("Tela:");
		painelTop.add(label_1);
		
		JMenu mnNewMenu = new JMenu("Cadastros");
		painelTop.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Fornecedores");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Produtos");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Cadastrar Clientes e Acesso App");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Cadastrar Forma de Pagamento");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Lançar Pedidos");
		mnNewMenu.add(mntmNewMenuItem_4);
	}
}
