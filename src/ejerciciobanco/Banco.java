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
public class Banco {
    private String codigo;
    private Tipo[] tipos;
    private Cuenta[] cuentas;
    private Movimiento[] movs;

    public Banco(String codigo, Tipo[] tipos, Cuenta[] cuentas) {
        this.codigo = codigo;
        this.tipos = tipos;
        this.cuentas = cuentas;
    }
    
    /*
    Añadido
    */

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Tipo[] getTipos() {
        return tipos;
    }

    public void setTipos(Tipo[] tipos) {
        this.tipos = tipos;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }
    
    public boolean obtMov(){
        
        return true;
    }
    
    
    public boolean obtInfoCuentas(){
        for(int i=0; i<cuentas.length; i++){
            System.out.println("Cuenta "+(i+1)+":");
            System.out.println("Nombre del cliente: "+cuentas[i].getNombreCliente()); 
            System.out.println("Numero de cuenta: "+cuentas[i].getNumCuenta());
            System.out.println("Fecha de creacion: "+cuentas[i].getFechaCreacion().getDia()+"/"+cuentas[i].getFechaCreacion().getMes()+"/"+cuentas[i].getFechaCreacion().getAnnio());
            System.out.println("Saldo actual: $"+cuentas[i].getSaldoActual());
            System.out.println("Movimientos: "); 
            //Modifiqué el tipo de metodo, lo cambié a void para que no imprimera true
            cuentas[i].obtMovimientos();
        }
        return true;
    }
}
