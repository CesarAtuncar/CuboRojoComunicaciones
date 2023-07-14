/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.*;
import modelo.User;
import util.MySQLConexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author user
 */
public class UserDao {
    
public boolean validar(String userName, String password) {
    Connection conn = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    boolean loginExitoso = false;
    
    try {
        conn = MySQLConexion.getConexion();
        String sql = "SELECT * FROM user WHERE userName = ? AND password = ?";
        st = conn.prepareStatement(sql);
        st.setString(1, userName);
        st.setString(2, password);
        
        rs = st.executeQuery();
        
        if (rs.next()) {
            // El usuario y contraseña son válidos
            loginExitoso = true;
        } else {
            // El usuario y/o contraseña no son válidos
            loginExitoso = false;
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if (st != null) {
            try {
                st.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    return loginExitoso;
}
     public void insertar(User user) {
        // Lógica para insertar un nuevo usuario en la base de datos
        // Utiliza la información de user para realizar la inserción
    }

    public void actualizar(User user) {
        // Lógica para actualizar un usuario existente en la base de datos
        // Utiliza la información de user para realizar la actualización
    }

    public void eliminar(User user) {
        // Lógica para eliminar un usuario de la base de datos
        // Utiliza la información de user para realizar la eliminación
    }

    public User obtener(int id) {
        // Lógica para obtener un usuario de la base de datos por su ID
        // Realiza la consulta en la base de datos y devuelve un objeto User con los datos obtenidos
        return null;
    }

    public List<User> obtenerTodos() {
        // Lógica para obtener todos los usuarios de la base de datos
        // Realiza la consulta en la base de datos y devuelve una lista de objetos User con los datos obtenidos
        return null;
    } 

}

