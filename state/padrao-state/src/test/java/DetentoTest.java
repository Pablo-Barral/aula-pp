import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DetentoTest {

    Detento detento;

    @BeforeEach
    public void setUp() {
        detento = new Detento();
    }

    @Test
    public void prenderDetento() {
        detento.setEstado(DetentoEstadoPreso.getInstance());
        assertEquals(DetentoEstadoPreso.getInstance(), detento.getEstado());
    }

    @Test
    public void soltarDetento() {
        detento.setEstado(DetentoEstadoPreso.getInstance());
        detento.solto();
        assertEquals(DetentoEstadoSolto.getInstance(), detento.getEstado());
    }

    @Test
    public void fugirDetento() {
        detento.setEstado(DetentoEstadoPreso.getInstance());
        detento.foragido();
        assertEquals(DetentoEstadoForagido.getInstance(), detento.getEstado());
    }

    @Test
    public void transferirDetento() {
        detento.setEstado(DetentoEstadoPreso.getInstance());
        detento.transferido();
        assertEquals(DetentoEstadoTransferido.getInstance(), detento.getEstado());
    }

    @Test
    public void prenderDetentoReincidente() {
        detento.setEstado(DetentoEstadoSolto.getInstance());
        assertEquals(DetentoEstadoSolto.getInstance(), detento.getEstado());
        detento.preso();
        assertEquals(DetentoEstadoPreso.getInstance(), detento.getEstado());

    }

    @Test
    public void naoPrenderPreso(){
        detento.setEstado(DetentoEstadoPreso.getInstance());
        assertFalse(detento.preso());
    }

    @Test
    public void naoTransferirSolto() {
        detento.setEstado(DetentoEstadoSolto.getInstance());
        assertFalse(detento.transferido());
    }

    @Test
    public void naoForagirSolto() {
        detento.setEstado(DetentoEstadoSolto.getInstance());
        assertFalse(detento.foragido());
    }

    @Test
    public void capturarForagido() {
        detento.setEstado(DetentoEstadoForagido.getInstance());
        detento.preso();
        assertEquals(DetentoEstadoPreso.getInstance(), detento.getEstado());
    }

    @Test
    public void naoTransferirForagido() {
        detento.setEstado(DetentoEstadoForagido.getInstance());
        assertFalse(detento.transferido());
    }

    @Test
    public void naoForagirForagido() {
        detento.setEstado(DetentoEstadoForagido.getInstance());
        assertFalse(detento.foragido());
    }

    @Test
    public void prenderTransferido() {
        detento.setEstado(DetentoEstadoTransferido.getInstance());
        detento.preso();
        assertEquals(DetentoEstadoPreso.getInstance(), detento.getEstado());
    }

    @Test
    public void naoSoltarTransferido() {
        detento.setEstado(DetentoEstadoTransferido.getInstance());
        assertFalse(detento.solto());
    }

    @Test
    public void naoForagirTransferido() {
        detento.setEstado(DetentoEstadoTransferido.getInstance());
        assertFalse(detento.foragido());
    }

    @Test
    public void naoRetransferirDetento() {
        detento.setEstado(DetentoEstadoTransferido.getInstance());
        assertFalse(detento.transferido());
    }


}