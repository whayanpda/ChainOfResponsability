package org.example;

public class NivelDificil implements NivelChamado {

    private static NivelDificil nivelDificil =
            new NivelDificil();

    private NivelDificil(){}

    public static NivelDificil getNivelDificil() {
        return nivelDificil;
    }
}