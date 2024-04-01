package org.example;

public class Porta {

    private static Porta porta = new Porta();

    private Porta() {
    }

    ;

    public static String fecharPorta() {
        return "Porta da cela fechada\n";
    }

    public static String trancarPorta() {
        return "Porta da cela trancada\n";
    }

}
