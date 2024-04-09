package org.example;

import java.util.HashMap;
import java.util.Map;

public class CrimeFactory {
    private static Map<String, Crime> crimes = new HashMap<>();

    public static Crime getCrime(String nome, String pena) {
        Crime crime = crimes.get(nome);
        if (crime == null) {
            crime = new Crime(nome, pena);
            crimes.put(nome, crime);
        }
        return crime;
    }
}




