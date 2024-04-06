package org.example;

public class Brutalidade extends AgravantesDecorator {

    public Brutalidade(Crime crime) {
        super(crime);
    }

    public float getPercentualPena() {
        return 50.0f;
    }

    public String getNomeEstrutura() {
        return "Brutalidade";
    }
}
