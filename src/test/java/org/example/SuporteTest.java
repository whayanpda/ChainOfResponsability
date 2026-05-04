package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuporteTest {

    private Suporte atendente;

    @BeforeEach
    void setUp() {
        Suporte gerente = new Gerente(null);
        Suporte especialista = new Especialista(gerente);
        Suporte tecnico = new Tecnico(especialista);
        atendente = new Atendente(tecnico);
    }

    @Test
    void deveResolverChamadoSimplesComAtendente() {
        Chamado chamado = new Chamado(NivelSimples.getNivelSimples());

        assertEquals("Atendente", atendente.resolverChamado(chamado));
    }

    @Test
    void deveEncaminharChamadoMedioParaTecnico() {
        Chamado chamado = new Chamado(NivelMedio.getNivelMedio());

        assertEquals("Técnico", atendente.resolverChamado(chamado));
    }

    @Test
    void deveEncaminharChamadoDificilParaEspecialista() {
        Chamado chamado = new Chamado(NivelDificil.getNivelDificil());

        assertEquals("Especialista", atendente.resolverChamado(chamado));
    }

    @Test
    void deveEncaminharChamadoCriticoParaGerente() {
        Chamado chamado = new Chamado(NivelCritico.getNivelCritico());

        assertEquals("Gerente", atendente.resolverChamado(chamado));
    }

    @Test
    void deveRetornarProblemaNaoResolvidoQuandoNaoExistirSuperior() {
        Suporte atendenteSemSuperior = new Atendente(null);
        Chamado chamado = new Chamado(NivelCritico.getNivelCritico());

        assertEquals("Problema não resolvido", atendenteSemSuperior.resolverChamado(chamado));
    }
}
