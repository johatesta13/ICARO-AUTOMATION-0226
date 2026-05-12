public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("=== EJEMPLO TRY-CATCH-FINALLY ===\n");
        
        // Caso 1: Con excepción
        System.out.println("--- Caso 1: CON excepción ---");
        try {
            System.out.println("1. Ejecutando bloque TRY");
            int resultado = 10 / 0; // Lanza excepción
            System.out.println("2. Esta línea NO se ejecuta");
        } catch (ArithmeticException e) {
            System.out.println("2. Ejecutando bloque CATCH");
            System.out.println("   Error: " + e.getMessage());
        } finally {
            System.out.println("3. Ejecutando bloque FINALLY");
            System.out.println("   (Siempre se ejecuta)");
        }
        
        System.out.println();
        
        // Caso 2: Sin excepción
        System.out.println("--- Caso 2: SIN excepción ---");
        try {
            System.out.println("1. Ejecutando bloque TRY");
            int resultado = 10 / 2;
            System.out.println("2. Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("2. Este CATCH NO se ejecuta");
        } finally {
            System.out.println("3. Ejecutando bloque FINALLY");
            System.out.println("   (Siempre se ejecuta, incluso sin error)");
        }
        
        System.out.println("\nprograma finalizado");
    }
}
