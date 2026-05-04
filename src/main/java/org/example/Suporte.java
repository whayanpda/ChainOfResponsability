package org.example;

import java.util.ArrayList;

public abstract class Suporte {

    protected ArrayList<NivelChamado> niveis =
            new ArrayList<>();

    private Suporte superior;

    public Suporte getSuperior() {
        return superior;
    }

    public void setSuperior(Suporte superior) {
        this.superior = superior;
    }

    public abstract String getCargo();

    public String resolverChamado(Chamado chamado) {

        if (niveis.contains(chamado.getNivel())) {
            return getCargo();
        }

        else {
            if (superior != null) {
                return superior.resolverChamado(chamado);
            }

            return "Problema não resolvido";
        }
    }
}
