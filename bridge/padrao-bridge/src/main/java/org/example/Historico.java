package org.example;

public abstract class Historico {

    protected Crime crime;

    protected int penaBase;

    public Historico(int penaBase) {
        this.penaBase = penaBase;
    }

    public void setCrime(Crime crime) {
        this.crime = crime;
    }

    public abstract float calcularReclusao();
}
