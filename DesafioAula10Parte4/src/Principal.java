import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		usuario.cadastroUsuario();
		
		boolean condicao = false;
		do {
			String loginAut = JOptionPane.showInputDialog("Autentica��o - Login: ");
			String senhaAut = JOptionPane.showInputDialog("Autentica��o - Senha: ");
			
			Usuario usuarioAut = new Usuario();
			usuarioAut.login = loginAut;
			usuarioAut.senha = senhaAut;
			
			if(usuario.login.equals(usuarioAut.login) && usuario.senha.equals(usuarioAut.senha)) {
				JOptionPane.showMessageDialog(null, "Usu�rio logado com sucesso!");
				condicao = false;
			}else{
				JOptionPane.showMessageDialog(null, "Login ou Senha inv�lidos! Tente novamente!");
				condicao = true;
			}
		} while (condicao);
		
	}

}
