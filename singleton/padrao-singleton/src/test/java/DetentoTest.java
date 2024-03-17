import org.example.Detento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DetentoTest {

    @Test
    public void retornarNomeDetento() {
        Detento.getInstance().setNomeDetento("José Teste");
        assertEquals("José Teste", Detento.getInstance().getNomeDetento());
    }

    @Test
    public void retornaGuardaLogado() {
        Detento.getInstance().setGuardaLogado("João Guarda");
        assertEquals("João Guarda", Detento.getInstance().getGuardaLogado());
    }

}