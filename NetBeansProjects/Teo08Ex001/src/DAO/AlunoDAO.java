/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import model.Aluno;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/**
 *
 * @author unifhnomura
 */
public class AlunoDAO {
    private Connection conn;

    public AlunoDAO(Connection conexao) {
        this.conn = conexao;
    }
    
    public ResultSet consultar(Aluno aluno) throws SQLException{
//        String sql = "select * from aluno where login = '" + aluno.getUsuario()
//                      + "' and senha = '"
//                      + aluno.getSenha() + "'";

        String sql = "select * from aluno where usuario = ? and senha = ?";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, aluno.getUsuario());
        statement.setString(2, aluno.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        conn.close();
        return resultado;
    }
}
