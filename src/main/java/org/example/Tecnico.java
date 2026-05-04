package org.example;

public class Tecnico extends Suporte {

    public Tecnico(Suporte superior) {
        niveis.add(NivelMedio.getNivelMedio());
        setSuperior(superior);
    }

    public String getCargo() {
        return "Técnico";
    }
}
