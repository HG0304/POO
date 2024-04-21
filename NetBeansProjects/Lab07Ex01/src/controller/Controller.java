package controller;

import java.util.ArrayList;
import model.Usuario;
import view.JanelaCadastro;
import view.JanelaProcuraUsuario;

public class Controller {
    private JanelaCadastro jc;
    private JanelaProcuraUsuario jpu;

    public Controller(JanelaCadastro jc) {
        this.jc = jc;
    }

    public Controller(JanelaProcuraUsuario jpu) {
        this.jpu = jpu;
    }
    
    ArrayList <Usuario> usuarios = new ArrayList <> ();
    
    public void controlCadastro(){
        String nome = jc.getTxtNome().getText();
        String sobrenome = jc.getTxtSobrenome().getText();
        String idade = jc.getTxtIdade().getText();
        String CPF = jc.getTxtCPF().getText();
        Boolean genero = jc.getRbtFeminino().isSelected();
        
        Usuario usuario = new Usuario(nome, sobrenome, idade, CPF, genero);
        usuarios.add(usuario);
        System.out.println("usuarios.size(): " + usuarios.size());
    }
    
    public void teste(){
        System.out.println("usuarios.size(): " + usuarios.size());
    }
    
    public String controlProcuraUsuario(){
        String CPF = jpu.getTxtUserSearch().getText();
        System.out.println("usuarios.size(): " + usuarios.size());
        // System.out.println(usuarios.get(0).getCPF());
        for(int i = 0; i < usuarios.size(); i++){
            if(CPF.equalsIgnoreCase(usuarios.get(i).getCPF())){
                
                return usuarios.get(i).toString();
            }
        }
        return "0";
        
    }
}
