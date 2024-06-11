package org.example;

public class DetentoEstadoPreso extends DetentoEstado {

    private DetentoEstadoPreso() {
    }

    ;
    private static DetentoEstadoPreso instance = new DetentoEstadoPreso();

    public static DetentoEstadoPreso getInstance() {
        return instance;
    }

    public boolean solto(Detento detento) {
        detento.setEstado(DetentoEstadoSolto.getInstance());
        return true;
    }

    public boolean foragido(Detento detento) {
        detento.setEstado(DetentoEstadoForagido.getInstance());
        return true;
    }

    public boolean transferido(Detento detento) {
        detento.setEstado(DetentoEstadoTransferido.getInstance());
        return true;
    }

}
