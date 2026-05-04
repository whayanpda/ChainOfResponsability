package org.example;

public class Gerente extends Suporte {

    public Gerente(Suporte superior) {
        niveis.add(NivelCritico.getNivelCritico());
        setSuperior(superior);
    }

    public String getCargo() {
        return "Gerente";
    }
}