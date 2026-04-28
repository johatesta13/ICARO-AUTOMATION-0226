import java.util.Scanner;

public class EjemplosReales {

    public static void main(String[] args) {

        // =====================
        // FOR — Recorrer lista de alumnos y mostrar sus notas
        // "Sé exactamente cuántos alumnos tengo"
        // =====================
        System.out.println("=== NOTAS DEL CURSO ===");

        String[] alumnos = {"Maria", "Juan", "Carlos", "Ana", "Pedro"};
        int[] notas = {9, 6, 4, 8, 7};

        for (int i = 0; i < alumnos.length; i++) {
            if (notas[i] >= 6) {
                System.out.println(alumnos[i] + " -> Nota: " + notas[i] + " ✓ APROBADO");
            } else {
                System.out.println(alumnos[i] + " -> Nota: " + notas[i] + " ✗ DESAPROBADO");
            }
        }


        // =====================
        // WHILE — Cajero automático
        // "No sé cuántas veces el usuario va a sacar plata"
        // =====================
        System.out.println("\n=== CAJERO AUTOMATICO ===");

        double saldo = 1000.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saldo inicial: $" + saldo);

        while (saldo > 0) {
            System.out.print("Cuanto queres retirar? $");
            double retiro = scanner.nextDouble();

            if (retiro > saldo) {
                System.out.println("Saldo insuficiente. Saldo actual: $" + saldo);
            } else {
                saldo = saldo - retiro;
                System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
            }

            if (saldo == 0) {
                System.out.println("Tu saldo es 0. Hasta luego!");
            }
        }


        // =====================
        // DO-WHILE — Login de usuario
        // "El usuario SIEMPRE tiene que ingresar la contraseña al menos una vez"
        // =====================
        System.out.println("\n=== SISTEMA DE LOGIN ===");

        String passwordCorrecta = "java2024";
        String passwordIngresada;
        int intentos = 0;
        int maxIntentos = 3;

        do {
            System.out.print("Ingresa tu contraseña: ");
            passwordIngresada = scanner.next();
            intentos++;

            if (!passwordIngresada.equals(passwordCorrecta)) {
                System.out.println("Contraseña incorrecta. Intentos restantes: " + (maxIntentos - intentos));
            }

        } while (!passwordIngresada.equals(passwordCorrecta) && intentos < maxIntentos);

        if (passwordIngresada.equals(passwordCorrecta)) {
            System.out.println("Bienvenido al sistema!");
        } else {
            System.out.println("Demasiados intentos fallidos. Cuenta bloqueada.");
        }

        scanner.close();
    }
}