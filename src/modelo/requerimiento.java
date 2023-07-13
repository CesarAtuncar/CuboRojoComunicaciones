/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author user
 */
public class requerimiento {
    private int id_requerimiento;
    private int cantidad;
    private String descripcion;
    private double precioUnitario;
    private double precioTotal;
    private double feeAgencia;
    private double total;

    public requerimiento() {
    }

    public requerimiento(int id_requerimiento, int cantidad, String descripcion, double precioUnitario, double precioTotal, double feeAgencia, double total) {
        this.id_requerimiento = id_requerimiento;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.precioTotal = precioTotal;
        this.feeAgencia = feeAgencia;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId_requerimiento() {
        return id_requerimiento;
    }

    public void setId_requerimiento(int id_requerimiento) {
        this.id_requerimiento = id_requerimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getFeeAgencia() {
        return feeAgencia;
    }

    public void setFeeAgencia(double feeAgencia) {
        this.feeAgencia = feeAgencia;
    }
    
    
}
