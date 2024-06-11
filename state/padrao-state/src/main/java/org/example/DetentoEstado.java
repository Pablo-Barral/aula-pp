package org.example;

public abstract class DetentoEstado {

    public boolean preso(Detento detento) {
        return false;
    }

    public boolean solto(Detento detento) {
        return false;
    }

    public boolean foragido(Detento detento) {
        return false;
    }

    public boolean transferido(Detento detento) {
        return false;
    }

}
