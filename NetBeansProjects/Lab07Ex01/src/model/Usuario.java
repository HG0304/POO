package model;

public class Usuario {
    private String nome, sobrenome, idade, CPF, genero;

    public String getCPF() {
        return CPF;
    }
    
    

    public Usuario(String nome, String sobrenome, String idade, String CPF, boolean genero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.CPF = CPF;
        
        if(genero == true){
            this.genero = "feminino";
        }
        else{
            this.genero = "masculino";
        }
    }
    
    
    
    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + 
               ", sobrenome=" + sobrenome + 
               ", idade=" + idade +
                ", CPF=" + CPF +
                ", genero=" + genero +'}';
    }
    
    
}
