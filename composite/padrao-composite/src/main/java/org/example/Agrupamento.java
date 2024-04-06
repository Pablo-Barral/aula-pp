package org.example;

import java.util.ArrayList;
import java.util.List;

public class Agrupamento extends Dados {

    private List<Dados> listaDados;

    public Agrupamento(String descricao) {
        super(descricao);
        this.listaDados = new ArrayList<Dados>();
    }

    public void addDados(Dados dados) {
        this.listaDados.add(dados);
    }

    public String getDados() {
        String output = "";
        output = this.getDescricao() + ": \n";
        for (Dados dados : listaDados) {
            output += dados.getDados();
        }
        return output;
    }
}
