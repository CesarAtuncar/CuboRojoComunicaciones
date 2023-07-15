/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.cliente;
import java.sql.*;
import java.util.*;
import util.MySQLConexion;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class DaoCliente {

    public void registrar(cliente c) {
        try {
            Connection con = MySQLConexion.getConexion();
            String sql = "INSERT INTO cliente(ruc, razonSocial, direccion) values (?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            //relaciono cada cadena con el valor

            st.setString(1, c.getRuc());
            st.setString(2, c.getRazonSocial());
            st.setString(3, c.getDirecccion());
            st.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public cliente consulta(JTextField jtxtRuc) {
        cliente c = null;
        try {
            Connection cn = MySQLConexion.getConexion();
            String sql = "SELECT  id_cliente, ruc, razonSocial, direccion FROM cliente WHERE id_cliente = ?";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setInt(1, Integer.parseInt(jtxtRuc.getText()) );
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {//leer filaxfila y pasarlo al arraylist

                c = new cliente();
                c.setCodCliente(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazonSocial(rs.getString(3));
                c.setDirecccion(rs.getString(4));
            }
            rs.close();
            st.close();
            cn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return c;
    }
}


