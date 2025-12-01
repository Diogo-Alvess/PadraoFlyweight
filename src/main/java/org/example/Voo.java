package org.example;

public class Voo {

    private String numero;
    private String origem;
    private String destino;

    public Voo(String numero, String origem, String destino) {
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
    }

    public String getNumero() {
        return numero;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }
}

