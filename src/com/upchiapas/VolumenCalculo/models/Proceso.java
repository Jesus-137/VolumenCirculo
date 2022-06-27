package com.upchiapas.VolumenCalculo.models;

public class Proceso {
    public void calcularVolumen(double radio){
        double volumen;
        volumen=(4.0/3)*Math.PI*Math.pow(radio,3);
        Imprecion imprime =new Imprecion();
        imprime.mostrarVolumen(volumen);
    }
}
