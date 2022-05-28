import javax.swing.JOptionPane;

import classes.Usuario;

public class Principal {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "CADASTRO DE USUÁRIO");

		String nome = JOptionPane.showInputDialog("Cadastro - Nome: ").toUpperCase();
		String email;
		do {
			email = JOptionPane.showInputDialog(nome + "\nCadastro - E-mail: ").toUpperCase();
			Usuario.validarEmail(email);
			if(Usuario.validarEmail(email) == false) {
				JOptionPane.showMessageDialog(null, "E-mail inválido! Digite novamente!");
			}
		} while (Usuario.validarEmail(email) == false);
		String login = JOptionPane.showInputDialog(nome + "\n" + email + "\nCadastro - Login: ");
		String senha = JOptionPane.showInputDialog(nome + "\n" + email + "\nCadastro - Senha: ");
		Usuario usuario = new Usuario();
		usuario.cadastroUsuario(nome, email, login, senha);
		
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso! \nInforme seu login e senha para logar: ");
		
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
