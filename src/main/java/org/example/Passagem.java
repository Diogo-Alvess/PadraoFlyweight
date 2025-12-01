package org.example;

public class Passagem {

    private String passageiro;
    private String assento;
    private double preco;
    private Voo voo; // Flyweight

    public Passagem(String passageiro, String assento, double preco, Voo voo) {
        this.passageiro = passageiro;
        this.assento = assento;
        this.preco = preco;
        this.voo = voo;
    }

    public String emitir() {
        return "Passagem{" +
                "passageiro='" + passageiro + '\'' +
                ", assento='" + assento + '\'' +
                ", preco=" + preco +
                ", voo='" + voo.getNumero() + " - " +
                voo.getOrigem() + " → " + voo.getDestino() + "'" +
                '}';
    }
}
