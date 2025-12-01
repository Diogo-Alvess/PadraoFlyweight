package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompanhiaAereaTest {

    @Test
    void deveRetornarPassagens() {
        CompanhiaAerea cia = new CompanhiaAerea();
        cia.venderPassagem("João", "12A", 599.90,
                "AZ1234", "São Paulo", "Rio de Janeiro");

        cia.venderPassagem("Maria", "14C", 599.90,
                "AZ1234", "São Paulo", "Rio de Janeiro");

        cia.venderPassagem("Carlos", "03B", 1200.00,
                "LA9080", "Rio de Janeiro", "Lisboa");

        List<String> saida = Arrays.asList(
                "Passagem{passageiro='João', assento='12A', preco=599.9, voo='AZ1234 - São Paulo → Rio de Janeiro'}",
                "Passagem{passageiro='Maria', assento='14C', preco=599.9, voo='AZ1234 - São Paulo → Rio de Janeiro'}",
                "Passagem{passageiro='Carlos', assento='03B', preco=1200.0, voo='LA9080 - Rio de Janeiro → Lisboa'}"
        );

        assertEquals(saida, cia.listarPassagens());
    }

    @Test
    void deveRetornarTotalVoosFlyweight() {
        CompanhiaAerea cia = new CompanhiaAerea();
        cia.venderPassagem("João", "12A", 599.90,
                "AZ1234", "São Paulo", "Rio de Janeiro");

        cia.venderPassagem("Maria", "14C", 599.90,
                "AZ1234", "São Paulo", "Rio de Janeiro");

        cia.venderPassagem("Carlos", "03B", 1200.00,
                "LA9080", "Rio de Janeiro", "Lisboa");

        // Devem existir apenas 2 voos criados
        assertEquals(2, VooFactory.getTotalVoos());
    }
}
