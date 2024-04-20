package controller;

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
    
    public void controlCastro(){
        String nome = jc.getTxtNome().getText();
        String sobrenome = jc.getTxtSobrenome().getText();
        String idade = jc.getTxtIdade().getText();
        String CPF = jc.getTxtCPF().getText();
        Boolean genero = jc.getRbtFeminino().isSelected();
        
        Usuario usuario = new Usuario(nome, sobrenome, idade, CPF);
    }
}
