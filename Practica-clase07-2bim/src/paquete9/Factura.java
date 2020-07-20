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
public class Factura {
    private PagoTarjeta pago;
    private Persona persona;
    
    public void establecerPago(PagoTarjeta p){
        pago = p;
    }
    
    public void establecerPersona(Persona p){
        persona = p;
    }
    
    public PagoTarjeta obtenerPago(){
        return pago ;
    }
    
    public Persona obtenerPersona(){
        return persona;
    }
    
}
