package org.example;

public class SegMinima implements Detento {

    private String atividadesDisponiveis;

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
        liberarVisita();
    }

    public void liberarPatio(){
        atividadesDisponiveis += "|Pátio liberado|";
    }

    public void liberarVisita(){
        atividadesDisponiveis += "|Visitas liberadas|";
    }
}
