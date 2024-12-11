package com.edteam;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Persona per1;
        per1 = new Persona();
        System.out.println("Nombre: "+per1.nombre);

        per1 = new Persona("ALEX");
        System.out.println("Nombre: "+per1.nombre);

        Factura fact = new Factura("Alm1");
        System.out.println("Factura: "+fact.numeroDocumento);

    }
}