import org.example.Cadeia;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;



class CadeiaTest {

    @Test
    void prenderDetentos() {
        Cadeia cadeia = new Cadeia();
        cadeia.prender("José Teste", "Homicídio", "20 anos");
        cadeia.prender("João Teste", "Homicídio", "20 anos");
        cadeia.prender("Joaquim Teste", "Furto", "5 anos");

        List<String> saida = Arrays.asList(
                "Detento{Nome='José Teste', Crime='Homicídio', Pena='20 anos'}",
                "Detento{Nome='João Teste', Crime='Homicídio', Pena='20 anos'}",
                "Detento{Nome='Joaquim Teste', Crime='Furto', Pena='5 anos'}");

        assertEquals(saida, cadeia.getDetentos());
    }
}