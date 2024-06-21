package org.example;

public class Detento {

    private String nome;
    private DetentoEstado estado;

    public Detento() {
        this.estado = DetentoEstadoPreso.getInstance();
    }

    public void setEstado(DetentoEstado estado) {
        this.estado = estado;
    }

    public boolean preso() {
        return estado.preso(this);
    }

    public boolean solto() {
        return estado.solto(this);
    }

    public boolean foragido() {
        return estado.foragido(this);
    }

    public boolean transferido() {
        return estado.transferido(this);
    }

    public DetentoEstado getEstado() {
        return estado;
    }
}
