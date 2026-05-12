public class OrdenCatch {
    public static void main(String[] args) {
        System.out.println("=== ORDEN DE LOS BLOQUES CATCH ===\n");
        
        System.out.println("⚠ IMPORTANTE: Los catch se evalúan en ORDEN");
        System.out.println("   El primero que coincida es el que se ejecuta\n");
        
        // Orden correcto: Específico → Genérico
        System.out.println("--- Orden CORRECTO (Específico primero) ---");
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capturado por ArrayIndexOutOfBoundsException (específico)");
        } catch (RuntimeException e) {
            System.out.println("   Este NO se ejecuta (más genérico)");
        } catch (Exception e) {
            System.out.println("   Este tampoco (el más genérico)");
        }
        
        System.out.println();
        
        /* 
         * ORDEN INCORRECTO - Esto NO compila:
         * 
         * try {
         *     // código
         * } catch (Exception e) {          // Muy genérico primero
         *     // ...
         * } catch (ArithmeticException e) { // Error: ya fue capturado arriba
         *     // Este catch nunca se ejecutaría
         * }
         * 
         * Error de compilación: "exception has already been caught"
         */
        
        System.out.println("--- Regla de oro ---");
        System.out.println("Poner excepciones ESPECÍFICAS primero");
        System.out.println("Poner excepciones GENÉRICAS al final");
        System.out.println("Exception (la más genérica) siempre al final");
    }
}
