package org.renzocode.SOLID.OpenClose.Calculadora;

public interface ICalculadora {
    double calcular (double a, double b);
}

     class Suma implements ICalculadora {

        @Override
        public double calcular(double a, double b) {
            return a + b;
        }
    }
    class Resta implements ICalculadora {

        @Override
        public double calcular(double a, double b) {
            return a - b;
        }
    }
    class Multiplicar implements ICalculadora {

        @Override
        public double calcular(double a, double b) {
            return a * b;
        }
    }
    class Dividir implements ICalculadora {

        public double calcular(double a, double b) {
            if (b!=0){
                return a / b;
            }else {
                throw new ArithmeticException("Error no se puede dividir entre 0");
            }
        }
    }


