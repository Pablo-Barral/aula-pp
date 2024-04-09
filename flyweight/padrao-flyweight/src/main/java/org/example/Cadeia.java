package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cadeia {

    private List<Detento> detentos = new ArrayList<>();

    public void prender(String nomeDetento, String crimeDetento, String pena) {
        Crime crime = CrimeFactory.getCrime(crimeDetento, pena);
        Detento detento = new Detento(nomeDetento, crime);
        detentos.add(detento);
    }

    public List<String> getDetentos() {
        List<String> saida = new ArrayList<String>();
        for (Detento detento : this.detentos) {
            saida.add(detento.getDetento());
        }
        return saida;
    }


}
