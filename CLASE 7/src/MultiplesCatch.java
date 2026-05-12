public class MultiplesCatch {
    public static void main(String[] args) {
        System.out.println("=== MÚLTIPLES BLOQUES CATCH ===\n");
        
        // Ejemplo 1: NullPointerException
        System.out.println("--- Ejemplo 1: NullPointerException ---");
        try {
            String texto = null;
            System.out.println("Longitud del texto: " + texto.length());
        } catch (NullPointerException e) {
            System.out.println("Error: La variable es null");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango");
        } catch (Exception e) {
            System.out.println("Error genérico: " + e.getMessage());
        }
        
        System.out.println();
        
        // Ejemplo 2: ArrayIndexOutOfBoundsException
        System.out.println("--- Ejemplo 2: ArrayIndexOutOfBoundsException ---");
        try {
            int[] numeros = {1, 2, 3};
            System.out.println("Accediendo a posición 10: " + numeros[10]);
        } catch (NullPointerException e) {
            System.out.println("Error: La variable es null");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango");
            System.out.println("   El array tiene menos elementos de los que intentas acceder");
        } catch (Exception e) {
            System.out.println("Error genérico: " + e.getMessage());
        }
        
        System.out.println();
        
        // Ejemplo 3: ArithmeticException (capturado por Exception genérico)
        System.out.println("--- Ejemplo 3: ArithmeticException ---");
        try {
            int resultado = 10 / 0;
        } catch (NullPointerException e) {
            System.out.println("Error: La variable es null");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango");
        } catch (Exception e) {
            System.out.println("Error genérico capturado: " + e.getClass().getSimpleName());
            System.out.println("   Mensaje: " + e.getMessage());
        }
        
        System.out.println("\n Programa finalizado");
    }
}
