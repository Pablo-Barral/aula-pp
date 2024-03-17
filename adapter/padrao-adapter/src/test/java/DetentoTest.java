import org.example.Detento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DetentoTest {

    @Test
    void retornaSeveridadeCrime() {
        Detento detento = new Detento();
        detento.setPena("Violência");

        assertEquals("Violência", detento.getPena());
    }

    @Test
    void retornaAnosReclusao() {
        Detento detento = new Detento();
        detento.setPena("Furto");

        assertEquals(6, detento.getAnos());
    }

}