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

    public cliente consulta(String rucVal) {
        cliente c = null;
        try {
            Connection cn = MySQLConexion.getConexion();
            String sql = "SELECT id_cliente, ruc, razonSocial, direccion FROM cliente WHERE ruc=?";
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, rucVal);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {//leer filaxfila y pasarlo al arraylist
                c = new cliente();
                c.setCodCliente(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazonSocial(rs.getString(3));
                c.setDirecccion(rs.getString(4));
            }
//            rs.close();
//            st.close();
//            cn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return c;
    }
}

//    public List<cliente> listar() {
//        List<cliente> lista = new ArrayList();
//
//        try {
//            Connection con = MySQLConexion.getConexion();
//            String sql = "select razonSocial, direccion from cliente";
//            PreparedStatement st = con.prepareStatement(sql);
//            ResultSet rs = st.executeQuery();
//            //relaciono cada cadena con el valor
//            st.executeQuery();
//
//            while (rs.next()) {//leer filaxfila y pasarlo al arraylist
//                cliente c = new cliente();
//                c.setRazonSocial(rs.getString(1));
//                c.setDirecccion(rs.getString(2));
//                lista.add(c);
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return lista;
//    }

