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
}
