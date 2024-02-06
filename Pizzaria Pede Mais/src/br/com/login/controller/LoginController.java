package br.com.login.controller;

import br.com.login.dao.Conexao;
import br.com.login.dao.LoginDAO;
import apresentação.LoginView;
import apresentação.RegistroView;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Devan
 */
public class LoginController {
    
   public void cadastroUsuario(RegistroView view) throws SQLException{
   
     Connection conexao = new Conexao().getConnection();
     LoginDAO cadastro = new LoginDAO();
     cadastro.cadastrarUsuario(view.getjTextFieldNome().getText(), view.getjTextFieldEmail().getText(), view.getjPasswordFieldSenha().getText());
     
   }
    
   public void loginUsuario(LoginView view) throws SQLException{
   
     Connection conexao = new Conexao().getConnection();
     LoginDAO login = new LoginDAO();
     login.login(view.getjTEmail().getText(),view.getjPSenha().getText());
             
   }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
