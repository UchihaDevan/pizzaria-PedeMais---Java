package br.com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Devan
 */
public class Conexao {
    
  public Connection getConnection() throws SQLException{
      Connection conexao = DriverManager.getConnection("jdbc:postgresql://roundhouse.proxy.rlwy.net:51165/railway", "postgres","F53C5CABe*cC1c56E46d*eA-DFfBd2-1");
      return conexao;
  }  
    
}
