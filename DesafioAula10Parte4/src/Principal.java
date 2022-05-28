import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		usuario.cadastroUsuario();
		
		boolean condicao = false;
		do {
			String loginAut = JOptionPane.showInputDialog("Autenticação - Login: ");
			String senhaAut = JOptionPane.showInputDialog("Autenticação - Senha: ");
			
			Usuario usuarioAut = new Usuario();
			usuarioAut.login = loginAut;
			usuarioAut.senha = senhaAut;
			
			if(usuario.login.equals(usuarioAut.login) && usuario.senha.equals(usuarioAut.senha)) {
				JOptionPane.showMessageDialog(null, "Usuário logado com sucesso!");
				condicao = false;
			}else{
				JOptionPane.showMessageDialog(null, "Login ou Senha inválidos! Tente novamente!");
				condicao = true;
			}
		} while (condicao);
		
	}

}
