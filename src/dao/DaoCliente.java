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
public class DaoCliente {

    public void registrar() {
        Connection conn = null;
        try {
            conn = MySQLConexion.getConexion();
            String sql = "INSERT INTO ruc, razonSocial, direccion values(?)";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                cliente a = new cliente();
                a.setRuc(rs.getString(1));
                a.setRazonSocial(rs.getString(2));
                a.setDirecccion(rs.getString(3));
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

    }

    public void eliminar() {
        Connection conn = null;
        try {
            conn = MySQLConexion.getConexion();
            String sql = "delete from ruc where id=?";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                cliente a = new cliente();
                a.setRuc(rs.getString(1));
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

    public List<cliente> Listcli() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
