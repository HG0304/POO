package model;

import java.util.ArrayList;

public class GerenciadorDeUsuarios {
    private ArrayList <Usuario> usuarios = new ArrayList<>();

    
    public ArrayList<Usuario> getUsuarios() {
    return usuarios;
  }
    
    public Usuario getUsuario(int index){
        return usuarios.get(index);
    }

  public void addUsuario(Usuario usuario) {
    usuarios.add(usuario);
  }
  
  public void removeUsuario(int index){
      usuarios.remove(index);
  }
  
  public void removeUsuario(Usuario usuario){
      usuarios.remove(usuario);
  }
  
  public int sizeUsuario(){
      return usuarios.size();
  }
}
