package org.example;

public class Detento {

    IPena pena;
    PenaAdapter adapter;

    public Detento() {
        pena = new PenaSeveridade();
        adapter = new PenaAdapter(pena);
    }

    public void setPena(String severidade) {
        pena.setPena(severidade);
        adapter.salvarPena();
    }

    public String getPena() {
        return adapter.recuperarPena();
    }

    public int getAnos(){
        return adapter.getAnos();
    }
}
