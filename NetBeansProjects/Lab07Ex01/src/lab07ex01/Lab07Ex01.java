package lab07ex01;
import controller.Controller;
import java.util.ArrayList;
import model.GerenciadorDeUsuarios;
import model.Usuario;
import view.JanelaCadastro;

public class Lab07Ex01 {
    private static JanelaCadastro jc;
    private static Controller controller;
    public static void main(String[] args) {
        // ArrayList<Usuario> usuarios = new ArrayList<>();
        GerenciadorDeUsuarios usuarios = new GerenciadorDeUsuarios();
        JanelaCadastro jc = new JanelaCadastro(controller); // Create JanelaCadastro first
        Controller controller = new Controller(usuarios, jc); // Pass jc to Controller constructor
        jc.setVisible(true);
}

    
}
