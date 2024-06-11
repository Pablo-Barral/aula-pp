package org.example;

public class DetentoEstadoSolto extends DetentoEstado {

    private DetentoEstadoSolto() {
    }

    ;
    private static DetentoEstadoSolto instance = new DetentoEstadoSolto();

    public static DetentoEstadoSolto getInstance() {
        return instance;
    }

    public boolean preso(Detento detento) {
        detento.setEstado(DetentoEstadoPreso.getInstance());
        return true;
    }


}
