package com.ceep.dominio;

public class Orden {

    private final int id_Orden;
    Computadora Arraycomputadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private int max_computadoras = 5;

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
        System.out.println("Orden: " +id_Orden);
        for (int i = 0; i < Orden.contadorComputadoras; i++) {
            System.out.println("Número de ordenadores: " + Arraycomputadoras[i]);
            System.out.println("");
        }
    
    }
}
