package org.example;

public class SoltarDetentoCommand implements Command {

    private Detento detento;

    public SoltarDetentoCommand(Detento detento) {
        this.detento = detento;
    }

    public void executar() {
        this.detento.soltarDetento();
    }
}
