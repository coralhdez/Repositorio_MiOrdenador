
package com.ceep.dominio;


public class Monitor {
    private final int id_Monitor;
    private String marca;
    private double tamano;
    private static int contadorMonitor;
    
    public Monitor(){
        this.id_Monitor = ++Monitor.contadorMonitor;
    }

    public Monitor(String marca, double tamano) {
        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public static int getContadorMonitor() {
        return contadorMonitor;
    }

    public static void setContadorMonitor(int contadorMonitor) {
        Monitor.contadorMonitor = contadorMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" + "id_Monitor=" + id_Monitor + ", marca=" + marca + ", tamano=" + tamano + '}';
    }
    
    
    
    
}
