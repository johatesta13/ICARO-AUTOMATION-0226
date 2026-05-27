public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BANCARIO - HERENCIA ===\n");

        // Crear un Cliente normal
        System.out.println("--- Cliente Normal ---");
        Cliente cliente1 = new Cliente("Juan", "Pérez", 12345, 1000.0);
        cliente1.mostrarInfo();
        System.out.println();

        cliente1.depositar(500);
        System.out.println();

        cliente1.retirar(300);
        System.out.println();

        System.out.println("Intentando retirar $2000 (más del saldo):");
        cliente1.retirar(2000);
        System.out.println();

        System.out.println("=".repeat(50));
        System.out.println();

        // Crear un Cliente VIP
        System.out.println("--- Cliente VIP ---");
        ClienteVIP clienteVIP = new ClienteVIP("María", "González", 67890, 1000.0, 5000.0);
        clienteVIP.mostrarInfo();
        System.out.println();

        clienteVIP.depositar(500);
        System.out.println();

        clienteVIP.retirar(300);
        System.out.println();

        System.out.println("Intentando retirar $2000 (usa crédito):");
        clienteVIP.retirar(2000);
        System.out.println();

        clienteVIP.mostrarInfo();
        System.out.println();

        System.out.println("Intentando retirar $10000 (excede saldo + crédito):");
        clienteVIP.retirar(10000);

        System.out.println("\n" + "=".repeat(50));
        System.out.println("✅ Programa finalizado");
    }
}