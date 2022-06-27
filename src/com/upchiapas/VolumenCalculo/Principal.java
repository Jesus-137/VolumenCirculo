package com.upchiapas.VolumenCalculo;

import com.upchiapas.VolumenCalculo.models.Lectura;

import java.util.Scanner;

public class Principal {
    private static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
        String opcion;
        do {
            System.out.println("Creando circulo");
            Lectura leerDato = new Lectura();
            leerDato.lecturaDatos();
            System.out.println("Quiere ingresar otro circulo?");
            opcion=entrada.next();
        }while (opcion.equals("si")||opcion.equals("Si"));
    }
}
