/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobanco;

/**
 *
 * @author Hernan Quiroga
 */
public class Cuenta {
    private int numCuenta;
    private double saldoActual;
    private Fecha fechaCreacion;
    private String nombreCliente;
    private Movimiento[] movimientos;

    public Cuenta(int numCuenta, double saldoActual, Fecha fechaCreacion, String nombreCliente) {
        this.numCuenta = numCuenta;
        this.saldoActual = saldoActual;
        this.fechaCreacion = fechaCreacion;
        this.nombreCliente = nombreCliente;
        this.movimientos = new Movimiento[2];
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    
}
