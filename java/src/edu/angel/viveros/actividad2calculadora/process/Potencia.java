package edu.angel.viveros.actividad2calculadora.process;


public class Potencia extends Multiplicacion {
    @Override
    public long calcular(long base, long exp) {
        if (exp < 0) throw new IllegalArgumentException("Exponentes negativos no soportados");
        if (exp == 0) return 1;
        if (base == 0) return 0;

        long resultado = 1;
        long actualBase = base > 0 ? base : -base;
        long actualExp = exp;

        while (actualExp > 0) {
            if ((actualExp & 1) == 1) {
                resultado = super.calcular(resultado, actualBase);
            }
            actualBase = super.calcular(actualBase, actualBase);
            actualExp >>= 1;
        }

        if (base < 0 && (exp & 1) == 1) {
            resultado = -resultado;
        }
        return resultado;
    }
}