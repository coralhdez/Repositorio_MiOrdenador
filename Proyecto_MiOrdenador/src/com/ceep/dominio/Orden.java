package com.ceep.dominio;

public class Orden {

    private final int id_Orden;
    Computadora Arraycomputadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int max_computadoras = 4;

    //CONSTRUCTORES
    public Orden() {
        Arraycomputadoras = new Computadora[max_computadoras];
        this.id_Orden = ++Orden.contadorOrdenes;
        Orden.contadorComputadoras = 0;
    }

    public void agregarComputadoras(Computadora computadora) {
        if (contadorComputadoras < max_computadoras) {
            Arraycomputadoras[Orden.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Ha llegado al máximo de ordenadores permitidos por pedido");
        }

    }
    
    public void mostrarOrden(){
        System.out.println("Orden: " + this.id_Orden);
        for (int i = 0; i < Orden.contadorComputadoras; i++) {
            System.out.println("Ordenador: " + Arraycomputadoras[i]);
            System.out.println("");
        }
    
    }
}
