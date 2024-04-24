package controller;

import java.util.ArrayList;
import model.GerenciadorDeUsuarios;
import model.Usuario;
import view.JanelaCadastro;
import view.JanelaProcuraUsuario;

public class Controller {
    private JanelaCadastro jc;
    private JanelaProcuraUsuario jpu;
    private ArrayList <Usuario> usuarios;

    // private static Controller instancia; // instancia unica
    // private ArrayList<Usuario> usuarios = new ArrayList<>();

    public Controller(GerenciadorDeUsuarios usuarios, JanelaCadastro jc) {
    this.jc = jc;
    }

//    public static Controller getInstance() {
//      if (instancia == null) {
//        instancia = new Controller();
//      }
//      return instancia;
//    }
    
    // GerenciadorDeUsuarios usuarios = new GerenciadorDeUsuarios();
    
    public void controlCadastro(){
        String nome = jc.getTxtNome().getText();
        String sobrenome = jc.getTxtSobrenome().getText();
        String idade = jc.getTxtIdade().getText();
        String CPF = jc.getTxtCPF().getText();
        Boolean genero = jc.getRbtFeminino().isSelected();
        
        Usuario usuario = new Usuario(nome, sobrenome, idade, CPF, genero);
        // usuarios.addUsuario(usuario);
        usuarios.add(usuario);
        // System.out.println("usuarios.size(): " + usuarios.sizeUsuario());
        System.out.println("usuarios.size(): " + usuarios.size());
    }
    
    public String controlProcuraUsuario(){
        String CPF = jpu.getTxtUserSearch().getText();
        // System.out.println("usuarios.size(): " + usuarios.sizeUsuario());
        System.out.println("usuarios.size(): " + usuarios.size());
        System.out.println(usuarios.get(0).getCPF());
        for(int i = 0; i < usuarios.size(); i++){
            if(CPF.equalsIgnoreCase(usuarios.get(i).getCPF())){
                
                return usuarios.get(i).toString();
            }
        }
        return "0";
    }
    
    public void controlPrintUsuario(){
        String usuario = controlProcuraUsuario();
        if(usuario.equals("0")){
            jpu.getTxtExibirPesquisa().setText("Usuario não encontrado");
            System.out.println("nao tem nada");
        } else{
            jpu.getTxtExibirPesquisa().setText(usuario);
        }    
    }
}
