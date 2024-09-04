package org.renzocode.SOLID.OpenClose.Calculadora;

public class Operaciones {
    private IOperaciones iOperaciones;

    public void establecerOperacion(IOperaciones iOperaciones){
        this.iOperaciones = iOperaciones;
    }

    public double calcular (double a, double b){
        if (iOperaciones == null){
            throw new IllegalStateException("Operación inválida");
        }
        return iOperaciones.calcular(a,b);

    }

}
