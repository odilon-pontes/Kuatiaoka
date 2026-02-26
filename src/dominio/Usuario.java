package dominio;

public class Usuario {
    private String nome;
    private int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrarUsuario() {
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);

    }

}
