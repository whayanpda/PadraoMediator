package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HubCentralTest {

    @Test
    void deveRetornarSempreAMesmaInstanciaDoHubCentral() {
        HubCentral primeiraInstancia = HubCentral.getInstancia();
        HubCentral segundaInstancia = HubCentral.getInstancia();

        assertSame(primeiraInstancia, segundaInstancia);
    }

    @Test
    void deveRetornarSempreAMesmaInstanciaDaLampada() {
        LampadaSmart inst1 = LampadaSmart.getInstancia();
        LampadaSmart inst2 = LampadaSmart.getInstancia();
        assertSame(inst1, inst2);
    }

    @Test
    void deveAtivarModoCinemaComBrilhoInformado() {
        String resposta = HubCentral.getInstancia().ativarModoCinema("30%");

        assertTrue(resposta.startsWith("Hub: Ativando modo cinema...\n"));
        assertTrue(resposta.contains("Luz configurada em 30% para o filme."));
    }

    @Test
    void deveDesativarCasaDesligandoALampada() {
        String resposta = HubCentral.getInstancia().desativarCasa();

        assertTrue(resposta.startsWith("Hub: Desligando tudo para você sair..."));
        assertTrue(resposta.contains("Luz apagada com sucesso."));
    }

    @Test
    void moradorDeveUsarHubCentralParaLigarLuzPorComandoDeVoz() {
        Morador morador = new Morador();

        String resposta = morador.comandoVozLigarLuz("baixa");

        assertEquals(HubCentral.getInstancia().ativarModoCinema("baixa"), resposta);
    }

    @Test
    void moradorDeveUsarHubCentralParaSairDeCasaPorComandoDeVoz() {
        Morador morador = new Morador();

        String resposta = morador.comandoVozSairDeCasa();

        assertEquals(HubCentral.getInstancia().desativarCasa(), resposta);
    }
}
