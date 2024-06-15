import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.*;

public class DetentoTest {

    @Test
    void atividadesDetentoSegMin() {
        SegMinima segMin = new SegMinima();
        segMin.tempoLivreDetento();

        assertEquals("|Pátio liberado||Visitas liberadas|", segMin.getAtividadesDisponiveis());
    }

    @Test
    void atividadesDetentoSegMed() {
        SegMedia segMed = new SegMedia();
        segMed.tempoLivreDetento();

        assertEquals("|Pátio liberado|", segMed.getAtividadesDisponiveis());
    }

    @Test
    void atividadesDetentoSegMax() {
        SegMaxima segMax = new SegMaxima();
        segMax.tempoLivreDetento();

        assertEquals("Detentos em seurança máxima não possuem atividades liberadas", segMax.getAtividadesDisponiveis());
    }
}
