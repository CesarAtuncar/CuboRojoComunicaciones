/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author user
 */
public class colaborador extends user_Type{
    private int codColaborador;
    private String dni;
    private String nombre;
    private String apellido;
    private String cargo;

    public colaborador() {
    }

    public colaborador(int codColaborador, String dni, String nombre, String apellido, String cargo) {
        this.codColaborador = codColaborador;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
    }

    public int getCodColaborador() {
        return codColaborador;
    }

    public void setCodColaborador(int codColaborador) {
        this.codColaborador = codColaborador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
}
