// ✅ ESTE CÓDIGO COMPILA BIEN
// ❌ Pero da error en EJECUCIÓN (Runtime)

public class ErrorEjecucion {
    public static void main(String[] args) {
        System.out.println("=== ERRORES DE EJECUCIÓN ===\n");
        
        // Error 1: División por cero
        System.out.println("1. Intentando dividir por cero:");
        int numero = 10;
        int divisor = 0;
        int resultado = numero / divisor; // ArithmeticException
        System.out.println("Resultado: " + resultado);



    }
}
