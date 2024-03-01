package org.example;

public class CadeiaFactory {

    public static ICadeia realizarPrisao(String tipoDetento) {
        Class classe;
        Object objeto;

        try {
            classe = Class.forName("org.example." + tipoDetento);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Crime não cadastrado");
        }
        if (!(objeto instanceof ICadeia)) {
            throw new IllegalArgumentException("Crime inválido");
        }
        return (ICadeia) objeto;
    }
}
