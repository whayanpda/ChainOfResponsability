package org.example;

public class NivelMedio implements NivelChamado {

    private static NivelMedio nivelMedio =
            new NivelMedio();

    private NivelMedio(){}

    public static NivelMedio getNivelMedio() {
        return nivelMedio;
    }
}