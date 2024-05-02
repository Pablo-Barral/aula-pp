import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DetentoTest {

    GuardaChefe chefe;
    GuardaDiretor diretor;
    GuardaComum guarda;

    @BeforeEach
    void setUp() {
        diretor = new GuardaDiretor(null);
        chefe = new GuardaChefe(diretor);
        guarda = new GuardaComum(chefe);
    }

    @Test
    void liberarSegMinimaGuardaComum() {
        assertEquals("Guarda Comum", guarda.liberarDetento(new Detento(TipoDetentoSegurancaMinima.getTipoDetentoSegurancaMinima())));
    }

    @Test
    void liberarSegMediaChefeSeguranca() {
        assertEquals("Chefe de Segurança", guarda.liberarDetento(new Detento(TipoDetentoSegurancaMedia.getTipoDetentoSegurancaMedia())));
    }

    @Test
    void liberarSegMaximaDiretor() {
        assertEquals("Diretor da Prisão", guarda.liberarDetento(new Detento(TipoDetentoSegurancaMaxima.getTipoDetentoSegurancaMaxima())));
    }

    @Test
    void semPermissaoParaLioberar() {
        assertEquals("Sem permissão para liberar", guarda.liberarDetento(new Detento(TipoDetentoPenaMorte.getTipoDetentoPenaMorte())));
    }

}