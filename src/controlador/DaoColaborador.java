/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.cliente;
import modelo.colaborador;
import util.MySQLConexion;
import java.sql.*;
import java.util.*;

/**
 *
 * @author user
 */
public class DaoColaborador {

    public void registrar(colaborador col) {
        try {
            Connection con = MySQLConexion.getConexion();
            String sql = "INSERT INTO colaborador(dni,nombre, apellido) values (?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            //relaciono cada cadena con el valor

            st.setString(1, col.getDni());
            st.setString(2, col.getNombre());
            st.setString(3, col.getApellido());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<colaborador> listado() {
        List<colaborador> lista = new ArrayList();

        try {
            Connection con = MySQLConexion.getConexion();
            String sql = "SELECT * FROM colaborador";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                colaborador col=new colaborador();
                col.setNombre(rs.getString(1));
                col.setApellido(rs.getString(2));
                lista.add(col);
            }
            System.out.println(lista);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return lista;
    }
}
