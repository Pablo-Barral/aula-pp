package org.example;

public class Civil {
    public String denunciarCrime(String mensagem) {
        return Ouvidoria.getInstancia().receberDenuncia(mensagem);
    }

    public String reclamarAgente(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoAgente(mensagem);
    }

    public String registrarOcorrencia(String mensagem) {
        return Ouvidoria.getInstancia().registrarOcorrencia(mensagem);
    }
}
