import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PessoaVisitorTest {

    @Test
    void exibirDetento() {
        Detento detento = new Detento("José Teste Jr", 1, "Assalto");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Detento: José Teste Jr Cela: 1 Crime: Assalto", visitor.exibir(detento));
    }

    @Test
    void exibirGuarda() {
        Guarda guarda = new Guarda("João Teste");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Guarda responsável pelas visitas: João Teste", visitor.exibir(guarda));
    }

    @Test
    void exibirVisitante() {
        Detento detento = new Detento("José Teste Jr", 1, "Assalto");
        Visitante visitante = new Visitante("José Teste", detento, "Pai");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Visitante: José Teste | Pai de José Teste Jr", visitor.exibir(visitante));
    }

}