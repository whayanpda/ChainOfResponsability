package org.example;

public class NivelSimples implements NivelChamado {

    private static NivelSimples nivelSimples =
            new NivelSimples();

    private NivelSimples(){}

    public static NivelSimples getNivelSimples() {
        return nivelSimples;
    }
}
