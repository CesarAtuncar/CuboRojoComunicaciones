/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

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
            String sql = "INSERT INTO colaborador(dni,nombre, apellido, cargo) values (?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            //relaciono cada cadena con el valor

            st.setString(1, col.getDni());
            st.setString(2, col.getNombre());
            st.setString(3, col.getApellido());
            st.setString(4, col.getName_cargo());
            st.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
