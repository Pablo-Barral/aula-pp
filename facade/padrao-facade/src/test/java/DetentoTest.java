import org.example.Detento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DetentoTest {

    @Test
    void baterToqueRecolher() {
        Detento detento = new Detento();

        assertEquals("Detento colocado na cela\nPorta da cela fechada\nPorta da cela trancada\nLuzes da cela apagadas", detento.toqueRecolher());
    }
}