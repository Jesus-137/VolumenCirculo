package com.upchiapas.VolumenCalculo.models;

import java.util.Scanner;

public class Lectura {
    private Scanner entrada = new Scanner(System.in);
    private double radio;
    public void lecturaDatos(){
        System.out.println("Ingrese el radio del circulo: ");
        radio=entrada.nextDouble();
        Proceso proceso =new Proceso();
        proceso.calcularVolumen(radio);
    }
}
