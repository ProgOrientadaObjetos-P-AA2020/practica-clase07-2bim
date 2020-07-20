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
public class Principal {
    public static void main(String[] args) {
        /*
            Se requiere implementar la
            solución para 
            PagoEfectivo, 
            PagoTrueque
            PagoPlazos
        
            La clase Factura debe aceptar 
            los diversos tipos de Pagos
      
        */
        
        
        PagoTarjeta miPago = new PagoTarjeta();
        miPago.establecerMonto(100.2);
        
        Persona p = new Persona("Luis Andrade", 40);
               
        Factura gp = new Factura();
        gp.establecerPago(miPago);
        gp.establecerPersona(p);
        System.out.printf("Nombre: %s\nEdad: %d\nPago: %.2f\n",
                gp.obtenerPersona().obtenerNombre(),
                gp.obtenerPersona().obtenerEdad(),
                gp.obtenerPago().obtenerMonto());
    }
}
