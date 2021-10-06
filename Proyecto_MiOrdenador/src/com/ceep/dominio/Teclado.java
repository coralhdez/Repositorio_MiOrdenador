package com.ceep.dominio;

public class Teclado extends DispositivoEntrada {

    private final int id_teclado;
    private static int contadorTeclado;

    //CONSTRUCTOR
     public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.id_teclado = ++Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{" + "id_teclado=" + id_teclado + '}';
    }

}
