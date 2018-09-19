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
public class EjercicioBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tipo t1= new Tipo("A57321D");
        Tipo t2= new Tipo("F42963G");
        Tipo[] tipos=new Tipo[2];
        tipos[0]=t1;
        tipos[1]=t2;
        Fecha f1= new Fecha(17,3,2010);
        Fecha f2= new Fecha(11,4,2015);
        Cuenta c1= new Cuenta(1234, 500000, f1, "Pedro Mortis");
        Cuenta c2= new Cuenta(8642, 1200000, f2, "Marcela Mendoza");
        Cuenta[] cuentas= new Cuenta[2];
        cuentas[0]=c1;
        cuentas[1]=c2;
        
        Fecha f1m1= new Fecha(27,10,2017);
        Fecha f1m2= new Fecha (16,2,2018);
        Movimiento m11= new Movimiento(f1m1, c1.getSaldoActual(), 150000, t1);
        Movimiento m12= new Movimiento(f1m2, c1.getSaldoActual()-m11.getMonto(), 300000, t2);
        
        Fecha f2m1= new Fecha(31,12,2015);
        Fecha f2m2= new Fecha (26,6,2017);
        Movimiento m21= new Movimiento(f2m1, c2.getSaldoActual(), 750000, t1);
        Movimiento m22= new Movimiento(f2m2, c2.getSaldoActual()-m21.getMonto(), 250000, t2);
        
        c1.setSaldoActual(m12.getSaldoPrevio()-m12.getMonto());
        c2.setSaldoActual(m22.getSaldoPrevio()-m22.getMonto());
        
        /*
        Aquí meto los 4 movimientos en el array de cada cuenta
        */
        c1.setMovimientoIndividual(m11);
        c1.setMovimientoIndividual(m12);
        c2.setMovimientoIndividual(m21);
        c2.setMovimientoIndividual(m22);
        
        Banco banco= new Banco("POO", tipos, cuentas);
        
        banco.obtInfoCuentas();
    }
    
}
