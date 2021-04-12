package br.com.aula.junit;

public class Agil {

    public double calcularPert(double horasDificeis, double horasNormais, double horasFaceis){
        if(horasDificeis < 0 || horasNormais < 0 || horasFaceis < 0){
            throw new RuntimeException("Horas negativas não são aceitas");
        }

        double resultado = (horasDificeis + horasNormais + horasFaceis) / 6;
        return resultado;
    }
}
