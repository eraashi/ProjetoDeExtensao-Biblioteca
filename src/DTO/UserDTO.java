package DTO;


public class UserDTO {
    private String id;
    private String login;
    private String senha;
    private String confirmar_senha;
    private String nome_completo;
    private String cpf;
    private String celular;
    private String cidade;
    private String uf;
    private String num;
    private String endereço;
    private String email;
    
    
    
    public UserDTO( String login, String senha, String confirmar_senha, String nome_completo, String celular, String cidade, String uf, String num, String endereço, String email) {
        
        this.login = login;
        this.senha = senha;
        this.confirmar_senha = confirmar_senha;
        this.nome_completo = nome_completo;
        this.celular = celular;
        this.cidade = cidade;
        this.uf = uf;
        this.num = num;
        this.endereço = endereço;
        this.email = email;
    }
    public UserDTO(){
    
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmar_senha() {
        return confirmar_senha;
    }

    public void setConfirmar_senha(String confirmar_senha) {
        this.confirmar_senha = confirmar_senha;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
   
}
