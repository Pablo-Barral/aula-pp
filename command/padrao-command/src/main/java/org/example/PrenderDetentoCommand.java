package org.example;

public class PrenderDetentoCommand implements Command {

    private Detento detento;

    public PrenderDetentoCommand(Detento detento) {
        this.detento = detento;
    }

    public void executar() {
        this.detento.prenderDetento();
    }

}
