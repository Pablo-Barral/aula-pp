package org.example;

public class Guarda extends Historico {

    public Guarda(int penaBase) {
        super(penaBase);
    }

    public float calcularReclusao() {
        return this.penaBase * (this.crime.coeficientePena());
    }
}
