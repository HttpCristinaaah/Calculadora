public class Calculadora {
    // Método principal que llamará a las operaciones
    public double calcular(String op, double a, double b) {
        switch(op) {
            case "suma": return new Suma().operar(a,b);
            case "resta": return new Resta().operar(a,b);
            case "multiplicacion": return new Multiplicacion().operar(a,b);
            case "division": return new Division().operar(a,b);
            default: throw new IllegalArgumentException("Operación no soportada: "+op);
        }
    }
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println("2 + 3 = " + c.calcular("suma",2,3));
    }
}