/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Obra_de_arte;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Labing
 */
public class Galeria {
    public boolean insert(Obra_de_arte obra) {
        boolean result = false;
        Connection connection = null;
        try {
            connection = Conexion.getConnection();
        } catch (URISyntaxException ex) {
            Logger.getLogger(Obra_de_arte.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query = " insert into Obra_de_arte (nombre, descripcion, estilo, valor, usuario)" + " values (?,?,?,?,?)";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, obra.getNombre());
            preparedStmt.setString(2, obra.getDescripcion());
            preparedStmt.setString(3, obra.getEstilo());
            preparedStmt.setDouble(4, obra.getValor());
            preparedStmt.setString(5, obra.getUsuario());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    
}
