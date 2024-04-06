import org.example.Agrupamento;
import org.example.Detento;
import org.example.Informacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class DetentoTest {

    @Test
    void deveRetornarEmentaDisciplina() {

        Informacao nomeDetento  = new Informacao("Nome do detento", "José Teste Jr");

        Agrupamento familia = new Agrupamento("Família");

        Informacao pai = new Informacao("Nome do pai", "José Teste");
        familia.addDados(pai);
        Informacao mae = new Informacao("Nome da mãe", "Maria Teste");
        familia.addDados(mae);

        Agrupamento dados = new Agrupamento("Dados do detento");
        dados.addDados(nomeDetento);
        dados.addDados(familia);

        Detento detento = new Detento();
        detento.setDados(dados);

        assertEquals("Dados do detento: \n" +
                "Nome do detento: José Teste Jr\n" +
                "Família: \n" +
                "Nome do pai: José Teste\n" +
                "Nome da mãe: Maria Teste\n", detento.getDados());
    }

    @Test
    void detentoSemDados() {
        try {
            Detento detento = new Detento();
            detento.getDados();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Detento sem dados", e.getMessage());
        }
    }
}