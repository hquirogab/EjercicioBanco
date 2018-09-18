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

    public Banco(String codigo, Tipo[] tipos, Cuenta[] cuentas) {
        this.codigo = codigo;
        this.tipos = tipos;
        this.cuentas = cuentas;
    }
    
    
}
