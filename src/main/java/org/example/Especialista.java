package org.example;

public class Especialista extends Suporte {

    public Especialista(Suporte superior) {
        niveis.add(NivelDificil.getNivelDificil());
        setSuperior(superior);
    }

    public String getCargo() {
        return "Especialista";
    }
}