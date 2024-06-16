package org.example;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.accept(this);
    }

    @Override
    public String showDetento(Detento detento) {
        return "Detento: " + detento.getNome() + " Cela: " + detento.getCela() + " Crime: " + detento.getCrime();
    }

    @Override
    public String showGuarda(Guarda guarda) {
        return "Guarda responsável pelas visitas: " + guarda.getNome();
    }

    @Override
    public String showVisitante(Visitante visitante) {
        return "Visitante: " + visitante.getNome() + " | " + visitante.getParentesco() + " de " + visitante.getDetento().getNome();
    }
}
