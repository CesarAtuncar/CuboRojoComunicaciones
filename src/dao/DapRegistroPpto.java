/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.*;
import java.sql.*;
import java.util.*;
import util.MySQLConexion;

/**
 *
 * @author user
 */
public class DapRegistroPpto {

    public void registrar() {
        Connection conn = null;
        try {
            conn = MySQLConexion.getConexion();
            String sql = "INSERT INTO titulo, status, actividad values(?)";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                registroppto a = new registroppto();
                a.setTitulo(rs.getString(1));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e2) {
            }
        }
    }

    public void actualizar() {
        Connection conn = null;
        try {
            conn = MySQLConexion.getConexion();
            String sql = "UPDATE titulo, status, actividad where id=?";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                registroppto a = new registroppto();
                a.setTitulo(rs.getString(1));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e2) {
            }
        }
    }

    public void eliminar() {

    }

    public List<cliente> Listcli() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
