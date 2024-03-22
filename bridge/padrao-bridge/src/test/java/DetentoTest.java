
import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DetentoTest {

    @Test
    void penaDetentoMenor() {
        Crime crime = new CrimeMenor();
        Detento detento = new Detento(1);
        detento.setCrime(crime);
        assertEquals(2, detento.calcularReclusao());
    }

    @Test
    void penaDetentoAgravado() {
        Crime crime = new CrimeAgravado();
        Detento detento = new Detento(2);
        detento.setCrime(crime);
        assertEquals(8, detento.calcularReclusao());
    }

    @Test
    void penaDetentoViolento() {
        Crime crime = new CrimeViolento();
        Detento detento = new Detento(3);
        detento.setCrime(crime);
        assertEquals(24, detento.calcularReclusao());
    }
}