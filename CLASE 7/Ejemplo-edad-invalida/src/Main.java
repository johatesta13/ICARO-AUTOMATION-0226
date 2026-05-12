public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE REGISTRO DE PERSONAS ===\n");
        
        // Caso 1: Éxito - Edad válida
        System.out.println("--- Caso 1: Edad válida ---");
        try {
            Persona juan = new Persona("Juan Pérez", 25);
            System.out.println("✅ Persona creada: " + juan);
        } catch (EdadInvalidaException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
        
        // Caso 2: Edad negativa
        System.out.println("\n--- Caso 2: Edad negativa ---");
        try {
            Persona maria = new Persona("María González", -5);
            System.out.println("✅ Persona creada: " + maria);
        } catch (EdadInvalidaException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
        
        // Caso 3: Edad muy alta
        System.out.println("\n--- Caso 3: Edad muy alta ---");
        try {
            Persona pedro = new Persona("Pedro Martínez", 150);
            System.out.println("✅ Persona creada: " + pedro);
        } catch (EdadInvalidaException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
        
        // Caso 4: Modificar edad de persona existente
        System.out.println("\n--- Caso 4: Modificar edad ---");
        try {
            Persona juan = new Persona("Juan Pérez", 25);
            System.out.println("Persona original: " + juan);
            
            juan.setEdad(-10); // Intentar edad inválida
            System.out.println("Persona modificada: " + juan);
        } catch (EdadInvalidaException e) {
            System.out.println("❌ Error al modificar edad: " + e.getMessage());
            try {
                Persona juan = new Persona("Juan Pérez", 25);
                System.out.println("Edad de Juan se mantiene en: " + juan.getEdad());
            } catch (EdadInvalidaException ex) {
                // No debería pasar
            }
        }
    }
}
