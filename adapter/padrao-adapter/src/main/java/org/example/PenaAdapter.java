package org.example;

public class PenaAdapter extends PenaAnos {

    private IPena penaSeveridade;

    public PenaAdapter(IPena penaSeveridade) {
        this.penaSeveridade = penaSeveridade;
    }

    public String recuperarPena() {
        if (this.getAnos() >= 15)
            penaSeveridade.setPena("Violência");
            else if (this.getAnos() >= 6)
            penaSeveridade.setPena("Furto");
        else if (this.getAnos() >= 3)
            penaSeveridade.setPena("Esterionato");
        else
            penaSeveridade.setPena("Outro");
        return penaSeveridade.getPena();
    }

    public void salvarPena() {
        if (penaSeveridade.getPena().equals("Violência"))
            this.setAnos(15);
        else if (penaSeveridade.getPena().equals("Furto"))
            this.setAnos(6);
        else if (penaSeveridade.getPena().equals("Esterionato"))
            this.setAnos(3);
        else
            this.setAnos(1);
    }
}
