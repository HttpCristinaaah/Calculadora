public class Calculadora {
    public double calcular(String operacion, double a, double b) {
        switch(operacion) {
            case "suma": return new Suma().operar(a,b);
            case "resta": return new Resta().operar(a,b);
            case "multiplicacion": return new Multiplicacion().operar(a,b);
            case "division": return new Division().operar(a,b);
            default: throw new IllegalArgumentException("Operación no soportada: "+operacion);
        }
    }
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println("5 - 2 = " + c.calcular("resta",5,2));
    }
}