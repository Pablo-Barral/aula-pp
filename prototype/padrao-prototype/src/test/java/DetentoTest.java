import org.example.Cela;
import org.example.Detento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DetentoTest {

    @Test
    void testDetentoClone() throws CloneNotSupportedException {
        Detento detento = new Detento(1, "João Teste", new Cela("Bloco A", 101));

        Detento detentoClone = detento.clone();
        detentoClone.setCodigo(2);
        detentoClone.setNome("José Clonado");
        detentoClone.getCela().setNumero(102);

        assertEquals("Detento{codigo=1, nome='João Teste', cela=Cela{bloco='Bloco A', número=101}}", detento.toString());
        assertEquals("Detento{codigo=2, nome='José Clonado', cela=Cela{bloco='Bloco A', número=102}}", detentoClone.toString());
    }
}