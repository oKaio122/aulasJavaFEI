package Aula08Lab;

public class Login {
    private String usuario,senha;

    public void logar(String user, String senha) throws InvalidCredentialsException{
        if (user.equals(this.usuario) && senha.equals(this.senha)){
            System.out.println("Usuário logado com sucesso!");
            return;
        }
        throw new InvalidCredentialsException("Senha ou usuário inválidos!");
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
