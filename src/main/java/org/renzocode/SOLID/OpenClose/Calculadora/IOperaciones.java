package org.renzocode.SOLID.OpenClose.Calculadora;

public interface IOperaciones {
    double calcular (double a, double b);
}

     class Suma implements IOperaciones {

        @Override
        public double calcular(double a, double b) {
            return a + b;
        }
    }
    class Resta implements IOperaciones {

        @Override
        public double calcular(double a, double b) {
            return a - b;
        }
    }
    class Multiplicar implements IOperaciones {

        @Override
        public double calcular(double a, double b) {
            return a * b;
        }
    }
    class Dividir implements IOperaciones {

        public double calcular(double a, double b) {
            if (b!=0){
                return a / b;
            }else {
                throw new ArithmeticException("Error no se puede dividir entre 0");
            }
        }
    }


