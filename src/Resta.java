public class Resta {
    public double operar(double a, double b) {
        double resultado = a - b;
        return Math.round(resultado * 100.0) / 100.0; // redondea a 2 decimales
    }
}