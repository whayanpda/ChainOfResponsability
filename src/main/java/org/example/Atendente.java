package org.example;

public class Atendente extends Suporte {

    public Atendente(Suporte superior) {
        niveis.add(NivelSimples.getNivelSimples());
        setSuperior(superior);
    }

    public String getCargo() {
        return "Atendente";
    }
}
