package org.example;

public interface Delegacia {
    String receberReclamacaoAgente(String mensagem);

    String receberDenuncia(String mensagem);

    String registrarOcorrencia(String mensagem);
}
