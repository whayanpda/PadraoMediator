package org.example;

public class LampadaSmart implements Dispositivo {
    private static LampadaSmart instancia = new LampadaSmart();

    private LampadaSmart() {}

    public static LampadaSmart getInstancia() {
        return instancia;
    }

    @Override
    public String ligar(String intensidade) {
        return "Luz configurada em " + intensidade + " para o filme.";
    }

    @Override
    public String desligar() {
        return "Luz apagada com sucesso.";
    }

    @Override
    public String reiniciar() {
        return "Lâmpada reiniciando sistema.";
    }
}