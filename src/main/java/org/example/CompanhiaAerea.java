package org.example;

import java.util.ArrayList;
import java.util.List;

public class CompanhiaAerea {

    private List<Passagem> passagens = new ArrayList<>();

    public void venderPassagem(String passageiro, String assento, double preco,
                               String numeroVoo, String origem, String destino) {

        Voo voo = VooFactory.getVoo(numeroVoo, origem, destino);

        Passagem passagem = new Passagem(passageiro, assento, preco, voo);
        passagens.add(passagem);
    }

    public List<String> listarPassagens() {
        List<String> lista = new ArrayList<>();
        for (Passagem p : passagens) {
            lista.add(p.emitir());
        }
        return lista;
    }
}
