import org.example.Detento;
import org.example.DetentoBuilder;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DetentoBuilderTest {

    @Test
    public void excecaoBlocoInvalido() {
        try {
            DetentoBuilder detentoBuilder = new DetentoBuilder();
            Detento detento = detentoBuilder
                    .setBloco("")
                    .setCrime("Furto")
                    .setPena("2 anos")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Bloco de celas inválido", e.getMessage());
        }
    }

    @Test
    public void excecaoCrimeInvalido() {
        try {
            DetentoBuilder detentoBuilder = new DetentoBuilder();
            Detento detento = detentoBuilder
                    .setBloco("1")
                    .setCrime("")
                    .setPena("2 anos")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Crime inválido", e.getMessage());
        }
    }

    @Test
    public void excecaoPenaInvalida() {
        try {
            DetentoBuilder detentoBuilder = new DetentoBuilder();
            Detento detento = detentoBuilder
                    .setBloco("1")
                    .setCrime("Furto")
                    .setPena("")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pena inválida", e.getMessage());
        }
    }

    @Test
    public void retornaDetentoValido() {
        DetentoBuilder detentoBuilder = new DetentoBuilder();
        Detento detento = detentoBuilder
                .setBloco("1")
                .setCrime("Furto")
                .setPena("2 anos")
                .build();
        assertNotNull(detento);
    }
}