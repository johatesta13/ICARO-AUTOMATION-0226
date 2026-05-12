// Excepción personalizada para saldo insuficiente
public class SaldoInsuficienteException extends Exception {
    
    // Constructor vacío
    public SaldoInsuficienteException() {
        super("Saldo insuficiente para realizar la operación");
    }
    
    // Constructor con mensaje personalizado
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
    
    // Constructor con saldo actual y monto requerido
    public SaldoInsuficienteException(double saldoActual, double montoRequerido) {
        super("Saldo insuficiente. Saldo actual: $" + saldoActual + 
              ", Monto requerido: $" + montoRequerido);
    }
}
