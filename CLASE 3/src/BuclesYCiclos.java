public class BuclesYCiclos {

        public static void main() {

            // =====================
            // EJEMPLO FOR
            // Usalo cuando SABES cuántas veces va a repetir
            // =====================
            System.out.println("=== CICLO FOR ===");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Vuelta numero: " + i);
            }

            // =====================
            // EJEMPLO WHILE
            // Usalo cuando NO SABES cuántas veces va a repetir
            // Primero PREGUNTA, luego EJECUTA
            // =====================
            System.out.println("\n=== CICLO WHILE ===");
            int cont = 9;
            while (cont <= 5) {
                System.out.println("Vuelta numero: " + cont);
                cont = cont + 1;
            }

            // =====================
            // EJEMPLO DO-WHILE
            // Primero EJECUTA, luego PREGUNTA
            // Se garantiza que corre AL MENOS UNA VEZ
            // =====================
            System.out.println("\n=== CICLO DO-WHILE ===");
            int num = 6;
            do {
                System.out.println("Vuelta numero: " + num);
                num = num + 1;
            } while (num <= 5);

        }
    }

