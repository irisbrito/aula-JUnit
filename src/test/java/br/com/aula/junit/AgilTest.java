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
}
