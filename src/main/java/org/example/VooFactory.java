package org.example;

import java.util.HashMap;
import java.util.Map;

public class VooFactory {

    private static Map<String, Voo> voos = new HashMap<>();

    public static Voo getVoo(String numero, String origem, String destino) {

        Voo voo = voos.get(numero);

        if (voo == null) {
            voo = new Voo(numero, origem, destino);
            voos.put(numero, voo);
        }

        return voo;
    }

    public static int getTotalVoos() {
        return voos.size();
    }
}
