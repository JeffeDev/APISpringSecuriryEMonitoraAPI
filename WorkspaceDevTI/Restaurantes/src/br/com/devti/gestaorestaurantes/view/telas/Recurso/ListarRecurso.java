package br.com.devti.gestaorestaurantes.view.telas.Recurso;

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

public class ListarRecurso {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarRecurso window = new ListarRecurso();
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
	public ListarRecurso() {
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
		
		JButton btnExcluir = new JButton("Excluir");
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		
		JButton btnNewButton = new JButton("Alterar");
		GroupLayout gl_painelLateral = new GroupLayout(painelLateral);
		gl_painelLateral.setHorizontalGroup(
			gl_painelLateral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelLateral.createSequentialGroup()
					.addGroup(gl_painelLateral.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, gl_painelLateral.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnExcluir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_painelLateral.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_painelLateral.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(133, Short.MAX_VALUE))
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
					.addContainerGap(425, Short.MAX_VALUE))
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
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		GroupLayout gl_painelListagens = new GroupLayout(painelListagens);
		gl_painelListagens.setHorizontalGroup(
			gl_painelListagens.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelListagens.createSequentialGroup()
					.addContainerGap()
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 471, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_painelListagens.setVerticalGroup(
			gl_painelListagens.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelListagens.createSequentialGroup()
					.addGap(11)
					.addComponent(table, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
					.addContainerGap())
		);
		painelListagens.setLayout(gl_painelListagens);
	}
}
