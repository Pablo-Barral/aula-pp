
import org.example.Crime;
import org.example.Guarda;
import org.example.SemCrimes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuardaTest {

    @Test
    void guardaSemPena() {
        Crime crime = new SemCrimes();
        Guarda guarda = new Guarda(0);
        guarda.setCrime(crime);
        assertEquals(0, guarda.calcularReclusao(), 0);
    }
}