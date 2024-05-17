package org.example;

public class Policia implements Delegacia {

    private static Policia instancia = new Policia();

    private Policia() {
    }

    public static Policia getInstancia() {
        return instancia;
    }

    public String receberReclamacaoAgente(String mensagem) {
        return "Reclamação registrada, o agente em questão será investigado. Descrição: " + mensagem;
    }

    public String receberDenuncia(String mensagem) {
        return "Denúncia de crime recebida, agradecemos a cooperação. Descrição: " + mensagem;
    }

    public String registrarOcorrencia(String mensagem) {
        return "Iniciado regitro de boletim de ocorrência. Descrição: " + mensagem;
    }
}
