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
    
public boolean validar(User u) {
    Connection conn = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    boolean loginExitoso = false;
    
    try {
        conn = MySQLConexion.getConexion();
        String sql = "SELECT * FROM user WHERE userName = ? AND password = ?";
        st = conn.prepareStatement(sql);
        st.setString(1, u.getUserName());
        st.setString(2, u.getPassword());
        
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

}

