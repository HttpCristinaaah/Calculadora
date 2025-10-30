public class Division {
    public double operar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return a / b;
    }
}