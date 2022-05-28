package classes;
import java.util.Objects;

import javax.swing.JOptionPane;

public class Usuario {

	public String nome;
	public String login;
	public String senha;
	public String email;
	
	public void cadastroUsuario() {
		nome = JOptionPane.showInputDialog("Cadastro - Nome: ");
		do {
			email = JOptionPane.showInputDialog("Cadastro - E-mail: ");
			validarEmail(email);
			if(validarEmail(email) == false) {
				JOptionPane.showMessageDialog(null, "E-mail inválido! Digite novamente!");
			}
		} while (validarEmail(email) == false);
		login = JOptionPane.showInputDialog("Cadastro - Login: ");
		senha = JOptionPane.showInputDialog("Cadastro - Senha: ");
	}

	public static boolean validarEmail(String email) {
		boolean achouArroba = false;
		boolean achouPonto = false;
		boolean verificacao = false;
		if(email != null && email.length() > 0) {
			for(int i = 0; i < email.length(); i++) {
				if(email.charAt(i) == '@') {
					achouArroba = true;
				}
				if(email.charAt(i) == '.') {
					achouPonto = true;
				}
				if(achouArroba == true && achouPonto == true) {
					verificacao = true;
				}
			}
		}
		return verificacao;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(login, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(login, other.login) && Objects.equals(senha, other.senha);
	}
	
}
