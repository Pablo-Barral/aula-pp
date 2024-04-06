package org.example;

public class DetentoFacade {

    private static String statusDetento = "";

    public static String rotinaToqueRecolher() {
        statusDetento += Cela.colocarDetento();
        statusDetento += Porta.fecharPorta();
        statusDetento += Porta.trancarPorta();
        statusDetento += Luzes.apagarLuzes();
        return statusDetento;
    }
}
