package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BlocoCela implements Iterable<Detento> {

    private List<Detento> detentos = new ArrayList<Detento>();

    public BlocoCela(Detento... detentos) {
        this.detentos = Arrays.asList(detentos);
    }

    @Override
    public Iterator<Detento> iterator() {
        return detentos.iterator();
    }

}


