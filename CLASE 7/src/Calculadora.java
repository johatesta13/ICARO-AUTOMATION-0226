public class Calculadora {
    
    // Método que lanza excepción si el denominador es 0
    public static double dividir(double numerador, double denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return numerador / denominador;
    }
    
    public static double sumar(double a, double b) {
        return a + b;
    }
    
    public static double restar(double a, double b) {
        return a - b;
    }
    
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        System.out.println("=== CALCULADORA CON MANEJO DE EXCEPCIONES ===\n");
        
        // Operaciones exitosas
        System.out.println("--- Operaciones normales ---");
        System.out.println("10 + 5 = " + sumar(10, 5));
        System.out.println("10 - 5 = " + restar(10, 5));
        System.out.println("10 * 5 = " + multiplicar(10, 5));
        
        try {
            System.out.println("10 / 5 = " + dividir(10, 5));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println();
        
        // División por cero
        System.out.println("--- Intentando división por cero ---");
        try {
            double resultado = dividir(10, 0);
            System.out.println("10 / 0 = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
        
        System.out.println();
        
        // Múltiples operaciones con manejo individual
        System.out.println("--- Serie de operaciones ---");
        double[] divisores = {2, 0, 4, 0, 5};
        
        for (int i = 0; i < divisores.length; i++) {
            try {
                double resultado = dividir(100, divisores[i]);
                System.out.println("100 / " + divisores[i] + " = " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("100 / " + divisores[i] + " → " + e.getMessage());
            }
        }
        
        System.out.println("\n✅ Calculadora finalizada - Ningún error detuvo el programa");
    }
}
