package org.example;

public class Detento extends Historico {

    public Detento(int penaBase) {
        super(penaBase);
    }

    public float calcularReclusao() {
        return this.penaBase * (this.crime.coeficientePena());
    }
}
