package org.example;

public class SegMaxima implements Detento {

    String atividadesDisponiveis = "Detentos em seurança máxima não possuem atividades liberadas";

    public String getAtividadesDisponiveis(){
        return atividadesDisponiveis;
    }

    @Override
    public String rotinaTempoLivre() {
        return atividadesDisponiveis;
    }
}
