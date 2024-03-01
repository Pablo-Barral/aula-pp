import org.example.CadeiaFactory;
import org.example.ICadeia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadeiaFactoryTest {

    @Test
    void excecaoCrimeInvalido() {
        try {
            ICadeia detento = CadeiaFactory.realizarPrisao("DetentoLatrocinio");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Crime não cadastrado", e.getMessage());
        }
    }

    @Test
    void prisaoDetentoFurto() {
        ICadeia detento = CadeiaFactory.realizarPrisao("DetentoFurto");
        assertEquals("Detento preso por furto", detento.efetuarPrisao());
    }

    @Test
    void prisaoDetentoHomicidio() {
        ICadeia detento = CadeiaFactory.realizarPrisao("DetentoHomicidio");
        assertEquals("Detento preso por homicidio", detento.efetuarPrisao());
    }

    @Test
    void prisaoDetentoAssalto() {
        ICadeia detento = CadeiaFactory.realizarPrisao("DetentoAssalto");
        assertEquals("Detento preso por assalto", detento.efetuarPrisao());
    }
}