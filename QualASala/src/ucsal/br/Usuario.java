package ucsal.br;

public class Usuario {
    private String username;
    private String password;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean verificaSenha(String password) {
        return this.password.equals(password);
    }
}
