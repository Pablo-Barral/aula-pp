package org.example;

public abstract class AgravantesDecorator implements Crime {

    private Crime crime;
    public String estrutura;

    public AgravantesDecorator(Crime crime) {
        this.crime = crime;
    }

    public abstract float getPercentualPena();

    public float getPena() {
        return this.crime.getPena() * (1 + (this.getPercentualPena() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.crime.getEstrutura() + "/" + this.getNomeEstrutura();
    }

}


