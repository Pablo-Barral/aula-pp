package org.example;

public class Racismo extends AgravantesDecorator {

    public Racismo(Crime crime) {
        super(crime);
    }

    public float getPercentualPena() {
        return 30.0f;
    }

    public String getNomeEstrutura() {
        return "Racismo";
    }
}
