package br.com.aula.junit;

import org.junit.Assert;
import org.junit.Test;

public class AgilTest {

    @Test
    public void testarOCalculoCorretoDePert(){
        Agil agil = new Agil();

        double resultado = agil.calcularPert(3,3, 3);

        Assert.assertEquals(1.5, resultado, 0.004);
    }
}
