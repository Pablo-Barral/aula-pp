import org.example.BlocoCela;
import org.example.Chamada;
import org.example.Detento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChamadaTest {

    @Test
    void detentosNaCela() {
        BlocoCela blocoCela = new BlocoCela(
                new Detento("João", true),
                new Detento("José", true),
                new Detento("Joaquim", false)
                );
        assertEquals(2, Chamada.getDetentosEmCela(blocoCela));
    }

    @Test
    void totalDetentos() {
        BlocoCela blocoCela = new BlocoCela(
                new Detento("João", true),
                new Detento("José", true),
                new Detento("Joaquim", false)
        );
        assertEquals(3, Chamada.getTotalDetentos(blocoCela));
    }

}