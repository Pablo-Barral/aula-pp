package org.example;

public class DetentoEstadoForagido extends DetentoEstado {

    private DetentoEstadoForagido() {
    }

    ;
    private static DetentoEstadoForagido instance = new DetentoEstadoForagido();

    public static DetentoEstadoForagido getInstance() {
        return instance;
    }


    public boolean preso(Detento detento) {
        detento.setEstado(DetentoEstadoPreso.getInstance());
        return true;
    }
}

