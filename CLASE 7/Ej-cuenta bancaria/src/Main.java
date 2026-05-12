public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BANCARIO CON EXCEPCIONES PERSONALIZADAS ===\n");
        
        // Crear cuentas
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("María González", 500);
        
        System.out.println("--- Estado inicial ---");
        cuenta1.mostrarInfo();
        cuenta2.mostrarInfo();
        
        System.out.println("\n=== CASO 1: Retiro exitoso ===");
        try {
            cuenta1.retirar(300);
        } catch (SaldoInsuficienteException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
        
        System.out.println("\n=== CASO 2: Retiro con saldo insuficiente ===");
        try {
            cuenta1.retirar(1500); // Intenta retirar más de lo que tiene
        } catch (SaldoInsuficienteException e) {
            System.out.println("❌ Error: " + e.getMessage());
            System.out.println("   Saldo actual de " + cuenta1.getTitular() + 
                             ": $" + cuenta1.getSaldo());
        }
        
        System.out.println("\n=== CASO 3: Depósito ===");
        cuenta1.depositar(500);
        
        System.out.println("\n=== CASO 4: Transferencia exitosa ===");
        try {
            cuenta1.transferir(200, cuenta2);
        } catch (SaldoInsuficienteException e) {
            System.out.println("❌ Error en transferencia: " + e.getMessage());
        }
        
        System.out.println("\n=== CASO 5: Transferencia con saldo insuficiente ===");
        try {
            cuenta2.transferir(1000, cuenta1); // María solo tiene $700
        } catch (SaldoInsuficienteException e) {
            System.out.println("❌ Error en transferencia: " + e.getMessage());
        }
        
        System.out.println("\n--- Estado final ---");
        cuenta1.mostrarInfo();
        cuenta2.mostrarInfo();
        
        System.out.println("\n✅ Sistema bancario finalizado");
        System.out.println("\n💡 Observa cómo:");
        System.out.println("   • La excepción personalizada da mensajes muy claros");
        System.out.println("   • El sistema nunca se detuvo por errores");
        System.out.println("   • Cada operación fallida fue manejada apropiadamente");
    }
}
