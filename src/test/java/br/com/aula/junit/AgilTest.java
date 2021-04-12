package br.com.aula.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AgilTest {

    private Agil agil;

    @Before
    public void setup(){
        this.agil = new Agil();
    }

    @Test
    public void testarOCalculoCorretoDePert(){
        double horasDificeis = 3, horasNormais = 3, horasFaceis =3;
        double esperado = (horasDificeis +  horasNormais + horasFaceis)/6;

        double resultado = agil.calcularPert(3,3, 3);

        Assert.assertEquals(esperado, resultado, 0.004);
    }

    @Test
    public void testarValidacaoDeNumerosNegativosParaHorasNoCalculoDePert(){
        Exception erro = Assert.assertThrows(RuntimeException.class, () -> {
            agil.calcularPert(4,-3,1);
        } );

        Assert.assertEquals("Horas negativas não são aceitas", erro.getMessage());
    }

    @Test
    public void testarValidacaoDeNumeroPositivoCasoPositivo(){
        Assert.assertFalse(agil.validarNumerosPositivos(-1));
    }
}
