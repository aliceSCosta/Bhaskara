package com.example.bhaskara;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MatematicaTeste {
    @Test
    public void CalculaPotenciaInteiroPositivo(){
        double valorEsperado = 2;
        double base = 2;
        int expoente = 1;
        double valorReal;
        Matematica m = new Matematica();

        valorReal = m.Exponenciacao(base, expoente);

        assertEquals(valorEsperado, valorReal, 0.01);
    }

    @Test
    public void CalculaDeltaPositivo(){
        double entradaA, entradaB, entradaC;
        entradaA = 1;
        entradaB = -2.0;
        entradaC = 1.0;
        double valorEsperado = 0;
        double valorReal;

        Matematica m = new Matematica();
        valorReal = m.CalculaDelta(entradaA, entradaB, entradaC);

        assertEquals(valorEsperado, valorReal, 0.01);
    }

    @Test
    public void CalculaDeltaPositivo2(){
        double entradaA, entradaB, entradaC;
        entradaA = 1;
        entradaB = -1;
        entradaC = -2;
        double valorEsperado = 9;
        double valorReal;

        Matematica m = new Matematica();
        valorReal = m.CalculaDelta(entradaA, entradaB, entradaC);

        assertEquals(valorEsperado, valorReal, 0.01);
    }

    @Test
    public void CalcularDeltaNegativo(){
        double entradaA, entradaB, entradaC;
        entradaA = 2.0;
        entradaB = 3.0;
        entradaC = 4.0;
        double valorEsperado = -2.0;
        double valorReal;
    }
    @Test
    public void CalculaRaizesDeltaZero(){
        double entradaA, entradaB, entradaC;
        entradaA = 1.0;
        entradaB = -2.0;
        entradaC = 1.0;
        double[] valorEsperado = new double[]{1.0, 1.0};
        double valorReal;

        Matematica m = new Matematica();
        valorReal = m.CalculaRaizesEq2Grau(entradaA, entradaB, entradaC);

        assertArrayEquals(valorEsperado, valorReal, 0.01);
    }

}
