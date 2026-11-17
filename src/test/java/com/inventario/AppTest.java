package com.inventario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void comprobarResta() {
        int resultado = App.calcularResta(210, 125);

        assertEquals(85, resultado);
    }
}