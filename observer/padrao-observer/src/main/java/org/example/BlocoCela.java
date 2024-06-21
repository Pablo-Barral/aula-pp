package org.example;

import java.util.ArrayList;
import java.util.List;

public class BlocoCela implements Subject {
    private final List<Observer> observadores;
    private String status;

    public BlocoCela() {
        observadores = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificar() {
        for (Observer observador : observadores) {
            observador.atualizar(status);
        }
    }

    public int totalObservadores(){
        return observadores.size();
    }

    public void setStatus(String status) {
        this.status = status;
        notificar();
    }
}
