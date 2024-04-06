package org.example;

public class Feminicidio extends AgravantesDecorator {

    public Feminicidio(Crime crime) {
        super(crime);
    }

    public float getPercentualPena() {
        return 30.0f;
    }

    public String getNomeEstrutura() {
        return "Feminicídio";
    }
}
