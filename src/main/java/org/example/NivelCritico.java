package org.example;

public class NivelCritico implements NivelChamado {

    private static NivelCritico nivelCritico =
            new NivelCritico();

    private NivelCritico(){}

    public static NivelCritico getNivelCritico() {
        return nivelCritico;
    }
}
