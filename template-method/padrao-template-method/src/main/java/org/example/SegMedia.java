package org.example;

public class SegMedia implements Detento {

    String atividadesDisponiveis;

    public String getAtividadesDisponiveis(){
        return atividadesDisponiveis;
    }

    @Override
    public String rotinaTempoLivre() {
        atividadesDisponiveis = "";
        liberarAtividades();
        return atividadesDisponiveis;
    }

    public void liberarAtividades(){
        liberarPatio();
    }

    public void liberarPatio(){
        atividadesDisponiveis += "|Pátio liberado|";
    }
}
