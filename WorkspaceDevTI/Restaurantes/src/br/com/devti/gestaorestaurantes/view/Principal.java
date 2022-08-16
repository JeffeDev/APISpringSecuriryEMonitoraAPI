package br.com.devti.gestaorestaurantes.view;

import java.awt.EventQueue;
import java.util.List;

import br.com.devti.gestaorestaurantes.core.entity.UsuarioEntity;
import br.com.devti.gestaorestaurantes.core.service.UsuarioService;
import br.com.devti.gestaorestaurantes.view.telas.TelaAcesso;

public class Principal {

	public static void main(String[] args) {
//		UsuarioEntity usuario = new UsuarioEntity();
//		
//		usuario.setNome("Jeffe");
//		usuario.setLogin("j");
//		usuario.setSenha("j");
//		usuario.setEmail("jeffe.info@gmail.com");
//		
//		UsuarioService usuarioService = new UsuarioService();
//		
//		try {
//			System.out.println(usuarioService.salvarUsuario(usuario));
//		}catch(NegocioException e) {
//			JOptionPane.showMessageDialog(null, e.getMensagemDeErro());
//		}
		
		
		
//		GrupoUsuarioEntity grupoUsuario = new GrupoUsuarioEntity();
//		grupoUsuario.setNomeGrupo("Financeiro");
//		
//		GrupoUsuarioService grupousService = new GrupoUsuarioService();
//		try {
//			System.out.println(grupousService.salvarGrupoUsuario(grupoUsuario));
//		}catch(NegocioException e) {
//			JOptionPane.showMessageDialog(null, e.getMensagemDeErro());
//		}	
		
		try {
		    List<UsuarioEntity> usuarios = new UsuarioService().listar();
		    
		    for (UsuarioEntity usuarioEntity : usuarios) {
				System.out.println(usuarioEntity);
			}
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAcesso frame = new TelaAcesso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		
		
	}

}
