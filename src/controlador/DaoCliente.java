/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

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

    public boolean validar(String ruc) {

        boolean existeCliente = false;

        try {
            Connection cn = MySQLConexion.getConexion();
            String sql = "SELECT * FROM cliente WHERE ruc = ?";
            PreparedStatement st = cn.prepareStatement(sql);

            st.setString(1, ruc);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                // El usuario y contraseña son válidos
                existeCliente = true;
                System.out.println("El cliente existe");

            } else {
                // El usuario y/o contraseña no son válidos
                existeCliente = false;
                System.out.println("El cliente NO existe");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return existeCliente;
    }

    public String consulta(String ruc) {
        cliente c = null;
        String Resultado = "";
        
        try {
            Connection cn = MySQLConexion.getConexion();           // String sql = "SELECT id_cliente, ruc, razonSocial, direccion FROM cliente WHERE ruc = ?;";
            String sql = "SELECT id_cliente, ruc, razonSocial, direccion FROM cliente WHERE ruc = ?;";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, ruc);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                c = new cliente();
                c.setCodCliente(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazonSocial(rs.getString(3));
                c.setDirecccion(rs.getString(4));
                System.out.println("El Codigo es: " + c.getCodCliente() + "\n"
                        + "El ruc es: " + c.getRuc() + "\n"
                        + "La razon Social es: " + c.getRazonSocial() + "\n"
                        + "La Direccion es: " + c.getDirecccion());      
           }
            rs.close();
            st.close();
            cn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Resultado;
    }
}
