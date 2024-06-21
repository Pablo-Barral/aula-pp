import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuardaTest {

    Guarda guarda;
    Detento detento;

    @BeforeEach
    void setUp() {
        guarda = new Guarda();
        detento = new Detento("José Teste");
    }

    @Test
    void soltaDetento() {
        Command soltarDetento = new SoltarDetentoCommand(detento);
        guarda.executarComando(soltarDetento);

        assertEquals("Detento solto", detento.getStatus());
    }

    @Test
    void prendeDetento() {
        Command prenderDetento = new PrenderDetentoCommand(detento);
        guarda.executarComando(prenderDetento);

        assertEquals("Detento preso", detento.getStatus());
    }

}