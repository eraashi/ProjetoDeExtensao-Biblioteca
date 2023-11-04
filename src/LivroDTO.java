//classe criada para armazenar os dados dos livros antes deles serem
//jogados no mysql
public class LivroDTO {
    
    private String titulo, autor, editora, local, nome_cliente;
    private int isbn, data, cpf_cliente, data_cliente, hora_cliente, celular_cliente, id;
    private boolean reservado;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(int cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public int getData_cliente() {
        return data_cliente;
    }

    public void setData_cliente(int data_cliente) {
        this.data_cliente = data_cliente;
    }

    public int getHora_cliente() {
        return hora_cliente;
    }

    public void setHora_cliente(int hora_cliente) {
        this.hora_cliente = hora_cliente;
    }

    public int getCelular_cliente() {
        return celular_cliente;
    }

    public void setCelular_clinte(int celular_cliente) {
        this.celular_cliente = celular_cliente;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
