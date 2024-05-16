package org.example;

import java.util.Iterator;

public class Chamada {

    private static Integer totalDetentos;
    private static Integer detentosEmCela;

    public static void iterador(BlocoCela blocoCela) {
        int quantidadeCela = 0;
        int quantidadeTotal = 0;
        for (Detento detento : blocoCela) {
            if (detento.isNaCela()) {
                quantidadeCela++;
            }
            quantidadeTotal ++;
        }
        totalDetentos = quantidadeTotal;
        detentosEmCela = quantidadeCela;
    }

    public static Integer getTotalDetentos(BlocoCela blocoCela) {
        iterador(blocoCela);
        return totalDetentos;
    }

    public static Integer getDetentosEmCela(BlocoCela blocoCela) {
        iterador(blocoCela);
        return detentosEmCela;
    }

}
