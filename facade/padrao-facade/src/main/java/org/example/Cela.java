package org.example;

public class Cela {

    private static Cela cela = new Cela();

    private Cela() {
    }

    ;

    public static String colocarDetento() {
        return "Detento colocado na cela\n";
    }
}
