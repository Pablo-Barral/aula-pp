package org.example;

public class Cela implements Cloneable {
    private String bloco;
    private Integer numero;

    public Cela(String bloco, Integer numero) {
        super();
        this.bloco = bloco;
        this.numero = numero;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Cela{" +
                "bloco='" + bloco + '\'' +
                ", número=" + numero +
                '}';
    }
}
