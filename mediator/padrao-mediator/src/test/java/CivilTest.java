import org.example.Civil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CivilTest {

    @Test
    void denunciarCrime() {
        Civil civil = new Civil();
        assertEquals("Contato recebido.\n" +
                        ">>Denúncia de crime recebida, agradecemos a cooperação. Descrição: Homicídio",
                civil.denunciarCrime("Homicídio"));
    }

    @Test
    void reclamarAgente() {
        Civil civil = new Civil();
        assertEquals("Contato recebido.\n" +
                        ">>Reclamação registrada, o agente em questão será investigado. Descrição: José Teste, abuso de autoridade",
                civil.reclamarAgente("José Teste, abuso de autoridade"));
    }

    @Test
    void registrarOcorrencia() {
        Civil civil = new Civil();
        assertEquals("Contato recebido.\n" +
                        ">>Iniciado regitro de boletim de ocorrência. Descrição: Furto",
                civil.registrarOcorrencia("Furto"));
    }

}