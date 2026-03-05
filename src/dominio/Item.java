package dominio;

public class Item {
    private int  id = 632424;
    private String tipo;
    private String titulo;
    private String autor;
    private String anoPublicacao;
    private Status status;

    private enum Status {
        DISPONIVEL,
        EMPRESTADO
    }

    public Item(String tipo, String titulo, String autor) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.autor = autor;
        this.status = status.DISPONIVEL;
    }


    public void mostrarItem() {
        System.out.println("ID: "+id);
        System.out.println("TIPO: "+tipo);
        System.out.println("Titulo: "+titulo);
        System.out.println("Nome do autor: "+autor);
        System.out.println("Status: "+status);
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo;}

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(String anoPublicacao) { this.anoPublicacao = anoPublicacao; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getId() {
        return id;
    }
}
