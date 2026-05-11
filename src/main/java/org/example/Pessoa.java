package org.example;

public class Pessoa {
    public String comandoVozLigarLuz(String brilho) {
        return HubCentral.getInstancia().ativarModoCinema(brilho);
    }

    public String comandoVozSairDeCasa() {
        return HubCentral.getInstancia().desativarCasa();
    }
}

