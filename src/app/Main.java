package app;

import ui.Menu;
import dominio.Usuario;
import dominio.Item;

public class Main {
    public static void main(String[] args) {
        // Menu.menuInicial();

        Usuario aluno1 = new Usuario("João", 17);
        // aluno1.mostrarUsuario();

        Item item1 = new Item("Livro", "Algebra Linear", "Possani");
        item1.mostrarItem();


    }
}