package org.example;

public class Luzes {

    private static Luzes luzes = new Luzes();

    private Luzes() {
    }

    ;

    public static String apagarLuzes() { return "Luzes da cela apagadas";}
}
