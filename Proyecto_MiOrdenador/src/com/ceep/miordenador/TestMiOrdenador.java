
package com.ceep.miordenador;

import com.ceep.dominio.Computadora;
import com.ceep.dominio.Monitor;
import com.ceep.dominio.Orden;
import com.ceep.dominio.Raton;
import com.ceep.dominio.Teclado;


public class TestMiOrdenador {

    
   
    public static void main(String[] args) {
       
        Raton raton1 = new Raton("USB","HP");
        Raton raton2 = new Raton("USB","Logitech");
        
        Teclado teclado1 = new Teclado("Cable", "HP");
        Teclado teclado2 = new Teclado("Cable", "Logitech");
        
        Monitor monitor1 = new Monitor("HP", 27);
        Monitor monitor2 = new Monitor("LG", 29);
        
        Computadora pc1 = new Computadora("Primer PC", monitor1, teclado1, raton1);
        Computadora pc2 = new Computadora("Segundo PC", monitor2, teclado2, raton2);
        
        Orden pedido1 = new Orden();
        pedido1.agregarComputadoras(pc1);
        pedido1.mostrarOrden();
       
        
        
        
        
        
    }
    
}
