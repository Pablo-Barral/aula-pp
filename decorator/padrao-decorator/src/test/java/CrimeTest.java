import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CrimeTest {

    @Test
    void detentoHomicidio() {
        Crime curso = new CrimeDetento(10.0f);

        assertEquals(10.0f, curso.getPena());
    }

    @Test
    void detentoHomicidioBrutalidade() {
        Crime curso = new Brutalidade(new CrimeDetento(10.0f));

        assertEquals(15.0f, curso.getPena());
    }

    @Test
    void detentoHomicidioFeminicidio() {
        Crime curso = new Feminicidio(new CrimeDetento(10.0f));

        assertEquals(13.0f, curso.getPena());
    }

    @Test
    void detentoHomicidioRacismo() {
        Crime curso = new Racismo(new CrimeDetento(10.0f));

        assertEquals(13.0f, curso.getPena());
    }

    @Test
    void detentoHomicidioTriplamenteQualificado() {
        Crime curso = new Brutalidade (new Racismo(new Feminicidio(new CrimeDetento(10.0f))));

        assertEquals(25.35f, curso.getPena(), 0.01f);
    }


    @Test
    void estruturaCrime() {
        Crime curso = new CrimeDetento(10.0f);

        assertEquals("Homicídio", curso.getEstrutura());
    }

    @Test
    void estruturaHomicidoTriplamenteQualificado() {
        Crime curso = new Brutalidade (new Racismo(new Feminicidio(new CrimeDetento(10.0f))));
        assertEquals("Homicídio/Feminicídio/Racismo/Brutalidade", curso.getEstrutura());
    }

}