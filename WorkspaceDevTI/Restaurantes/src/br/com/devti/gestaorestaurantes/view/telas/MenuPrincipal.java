package br.com.devti.gestaorestaurantes.view.telas;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import br.com.devti.gestaorestaurantes.view.telas.Clientes.TelaPrincipalClientes;
import br.com.devti.gestaorestaurantes.view.telas.Fornecedores.TelaPrincipalFornecedores;

public class MenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setForeground(new Color(0, 51, 255));
		setTitle("Controle de Restaurantes - Desktop");
		setType(Type.UTILITY);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/resource/restaurante.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(220, 20, 1024, 740);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cadastros");
		mnNewMenu.setSelectedIcon(new ImageIcon(MenuPrincipal.class.getResource("/resource/espessura-da-linha.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cadastrar Clientes");
		mntmNewMenuItem.setSelectedIcon(new ImageIcon(MenuPrincipal.class.getResource("/resource/adicionar-usuario.png")));
		mntmNewMenuItem.setSelected(true);
		mntmNewMenuItem.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/resource/adicionar-usuario.png")));
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TelaPrincipalClientes frame = new TelaPrincipalClientes();
					frame.setVisible(true);
				} catch (Exception eCli) {
					eCli.printStackTrace();
				}
			}
		});
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Cadastrar Fornecedores");
		mntmNewMenuItem_1.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/resource/lado-do-caminhao.png")));
		mntmNewMenuItem_1.setSelectedIcon(new ImageIcon(MenuPrincipal.class.getResource("/resource/lado-do-caminhao.png")));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TelaPrincipalFornecedores frame = new TelaPrincipalFornecedores();
					frame.setVisible(true);
				} catch (Exception eFor) {
					eFor.printStackTrace();
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
