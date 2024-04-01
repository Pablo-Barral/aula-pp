package org.example;

public class CrimeDetento implements Crime {

    public float pena;

    public CrimeDetento() {
    }

    public CrimeDetento(float pena) {
        this.pena = pena;
    }

    public float getPena() {
        return pena;
    }

    public String getEstrutura() {
        return "Homicídio";
    }

}
