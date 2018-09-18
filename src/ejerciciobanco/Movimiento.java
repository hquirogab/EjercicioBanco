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
public class Movimiento {
    private Fecha fecha;
    private double saldoPrevio;
    private double monto;
    private Tipo tipo;

    public Movimiento(Fecha fecha, double saldoPrevio, double monto, Tipo tipo) {
        this.fecha = fecha;
        this.saldoPrevio = saldoPrevio;
        this.monto = monto;
        this.tipo = tipo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public double getSaldoPrevio() {
        return saldoPrevio;
    }

    public void setSaldoPrevio(double saldoPrevio) {
        this.saldoPrevio = saldoPrevio;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
}
