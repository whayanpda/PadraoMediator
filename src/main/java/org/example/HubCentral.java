package org.example;

public class HubCentral {
    private static HubCentral instancia = new HubCentral();

    private HubCentral() {}

    public static HubCentral getInstancia() {
        return instancia;
    }

    public String ativarModoCinema(String brilho) {
        return "Hub: Ativando modo cinema...\n" +
                "Lâmpada respondeu: " + LampadaSmart.getInstancia().ligar(brilho);
    }

    public String desativarCasa() {
        return "Hub: Desligando tudo para você sair...\n" +
                "Lâmpada respondeu: " + LampadaSmart.getInstancia().desligar();
    }
}