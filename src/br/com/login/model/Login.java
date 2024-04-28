
package br.com.login.model;


public class Login {
    private String nome, email, senha;
    private int telefone;

    public Login(String email, String senha, int telefone) {
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }
    
    public void cadastrar(String nome, String email, String senha, int telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
}
