package org.example;

public class Detento implements Cloneable {
    private int codigo;
    private String nome;
    private Cela cela;

    public Detento(int codigo, String nome, Cela cela) {
        this.codigo = codigo;
        this.nome = nome;
        this.cela = cela;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cela getCela() {
        return cela;
    }

    public void setCela(Cela cela) {
        this.cela = cela;
    }

    @Override
    public Detento clone() throws CloneNotSupportedException {
        Detento detentoClone = (Detento) super.clone();
        detentoClone.cela = (Cela) detentoClone.cela.clone();
        return detentoClone;
    }

    @Override
    public String toString() {
        return "Detento{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", cela=" + cela +
                '}';
    }
}
