/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete9;

/**
 *
 * @author reroes
 */
public class PagoTarjeta {
    
    private double monto;
    
    public void establecerMonto(double ak){
        monto = ak;
    }
    
    public double obtenerMonto(){
        return monto;
    }
    
}
