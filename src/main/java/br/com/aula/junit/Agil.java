package br.com.aula.junit;

public class Agil {

    public double calcularPert(double horasDificeis, double horasNormais, double horasFaceis){
        double resultado = (horasDificeis + horasNormais + horasFaceis) / 6;
        return resultado;
    }
}
