import org.example.Detento;
import org.example.BlocoCela;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DetentoTest {

    @Test
    void notificarObservadores() {
        BlocoCela blocoCela = new BlocoCela();
        Detento detento = new Detento();
        detento.setNome("José Teste");
        blocoCela.addObserver(detento);
        blocoCela.setStatus("Fechada");
        assertEquals("Status da cela do detento José Teste: Fechada", detento.toString());

    }

    @Test
    void contarObservadores() {
        BlocoCela blocoCela = new BlocoCela();
        Detento detento = new Detento();
        Detento detento2 = new Detento();
        blocoCela.addObserver(detento);
        blocoCela.addObserver(detento2);
        assertEquals(2, blocoCela.totalObservadores());
        blocoCela.removeObserver(detento2);
        assertEquals(1,blocoCela.totalObservadores());

    }
}
