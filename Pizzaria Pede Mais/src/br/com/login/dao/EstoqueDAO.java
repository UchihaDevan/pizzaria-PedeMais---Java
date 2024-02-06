package br.com.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Devan
 */
public class EstoqueDAO {
    
   public void cadastrarProduto(String sabor, String tamanho, String preço, String quantidade)throws SQLException {
   Connection conexao = new Conexao().getConnection();
   String sql1 = "select sabor,tamanho from pedemais where sabor = '"+sabor+"' and tamanho = '"+tamanho+"'";
   System.out.println(sql1);
   PreparedStatement statment1 = conexao.prepareStatement(sql1);
   ResultSet rs1 = statment1.executeQuery();
   if (rs1.next()){
       JOptionPane.showMessageDialog(null, "Essa pizza já está cadastrada!");
       this.dispose();
   }else{
   String sql = "INSERT INTO pedemais (sabor, tamanho, preço, quantidade) VALUES ('"+sabor+"', '"+tamanho+"', '"+preço+"', '"+quantidade+"')";
   System.out.println(sql);
   PreparedStatement statment = conexao.prepareStatement(sql);
   statment.execute();
   JOptionPane.showMessageDialog(null, "Pizza cadastrada com sucesso!");
   conexao.close();
   }
   }
    
  public void estoque (String sabor, String tamanho, String preço, String quantidade) throws SQLException{
   Connection conexao = new Conexao().getConnection();
   String sql = "select sabor,tamanho from pedemais where sabor = '"+sabor+"'";
   System.out.println(sql);
   PreparedStatement statment1 = conexao.prepareStatement(sql);
   ResultSet rs = statment1.executeQuery();
   if (rs.next()){
       JOptionPane.showMessageDialog(null, "Essa pizza já está cadastrada!");
       this.dispose();
   }else{
   String sql1 = "INSERT INTO pedemais (sabor, tamanho, preço, quantidade) VALUES ('"+sabor+"', '"+tamanho+"', '"+preço+"', '"+quantidade+"')";
   System.out.println(sql1);
   PreparedStatement statment = conexao.prepareStatement(sql1);
   statment.execute();
   JOptionPane.showMessageDialog(null, "Pizza cadastrada com sucesso!");
   conexao.close();
   } 
      
  } 

    public void cadastrarProduto(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
