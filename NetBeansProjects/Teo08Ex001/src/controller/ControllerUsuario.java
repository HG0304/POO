package controller;

import model.Aluno;
import view.UsuarioFrame;


public class ControllerUsuario {
    private UsuarioFrame view;
    private Aluno aluno;

    public ControllerUsuario(UsuarioFrame view, Aluno aluno) {
        this.view = view;
        this.aluno = aluno;
    }
    
    
}
