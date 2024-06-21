package org.example;

public class DetentoEstadoTransferido extends DetentoEstado {

    private DetentoEstadoTransferido() {
    }

    ;
    private static DetentoEstadoTransferido instance = new DetentoEstadoTransferido();

    public static DetentoEstadoTransferido getInstance() {
        return instance;
    }

    public boolean preso(Detento detento) {
        detento.setEstado(DetentoEstadoPreso.getInstance());
        return true;
    }

}
