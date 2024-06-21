package org.example;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {
    }

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberDenuncia(String mensagem) {
        return "Contato recebido.\n" +
                ">>" + Policia.getInstancia().receberDenuncia(mensagem);
    }

    public String receberReclamacaoAgente(String mensagem) {
        return "Contato recebido.\n" +
                ">>" + Policia.getInstancia().receberReclamacaoAgente(mensagem);
    }

    public String registrarOcorrencia(String mensagem) {
        return "Contato recebido.\n" +
                ">>" + Policia.getInstancia().registrarOcorrencia(mensagem);
    }

}
