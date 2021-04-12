package br.com.aula.junit;

import org.junit.Assert;
import org.junit.Test;

public class AgilTest {

    @Test
    public void testarOCalculoCorretoDePert(){
        double horasDificeis = 3, horasNormais = 3, horasFaceis =3;
        double esperado = (horasDificeis +  horasNormais + horasFaceis)/6;

        Agil agil = new Agil();

        double resultado = agil.calcularPert(3,3, 3);

        Assert.assertEquals(esperado, resultado, 0.004);
    }

    @Test
    public void testarValidacaoDeNumerosNegativosParaHorasNoCalculoDePert(){
        Agil agil = new Agil();

        Exception erro = Assert.assertThrows(RuntimeException.class, () -> {
            agil.calcularPert(4,-3,1);
        } );

        Assert.assertEquals("Horas negativas não são aceitas", erro.getMessage());
    }

    @Test
    public void testarValidacaoDeNumeroPositivoCasoPositivo(){
        Agil agil = new Agil();

        Assert.assertFalse(agil.validarNumerosPositivos(-1));
    }
}
