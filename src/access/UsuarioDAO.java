/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.ConnectionDB;

/**
 *
 * @author nabet
 */
public class UsuarioDAO {
    
     private Connection conn;
    private PreparedStatement statement;
    private ResultSet result;
    
    //Comprobar si existe un usuario
    public void comprobarExistencia(String usuario, int acomulado) {
        
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();

                String sql = " SELECT nombre FROM historico"
                        + " WHERE nombre = '"+usuario+"';";
                statement = conn.prepareStatement(sql);
                result = statement.executeQuery();
                conn = null;
                if (result.next()) {
                    //Si existe actualiza los datos de este para no tener usuarios duplicados
                    actualizarDatos(usuario, acomulado);
                }else{
                    //Si no existe lo agrega
                    agregarDatos(usuario, acomulado);
                }

                statement.close();
                conn = null;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void actualizarDatos(String usuario, int acomulado){
        try {
            if (conn == null && acomulado <= 190) {
                conn = ConnectionDB.getConnection();
                
                String sql = "UPDATE `historico` SET"
                        + "`acomulado` = '"+acomulado+"'"
                        + " WHERE nombre = '"+usuario+"'";
                statement = conn.prepareStatement(sql);
                statement.executeUpdate();
                
                statement.close();
                conn = null;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void agregarDatos(String usuario, int acomulado){
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();

                String sql = "INSERT INTO `historico`(`nombre`, `acomulado`) "
                        + "VALUES (?,?)";
                statement = conn.prepareStatement(sql);
                statement.setString(1, usuario);
                statement.setInt(2, acomulado);
                statement.executeUpdate();            
                statement.close();
                conn = null;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void listarHistorico(){
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();

                String sql = "SELECT nombre, acomulado FROM historico;";
                statement = conn.prepareStatement(sql);
                result = statement.executeQuery();
                int i=0;
                while(result.next()){
                    System.out.println("\n" + (i + 1)+". " + result.getString(1) + ": " + result.getInt(2));
                    i++;
                }
                statement.close();
                conn = null;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
