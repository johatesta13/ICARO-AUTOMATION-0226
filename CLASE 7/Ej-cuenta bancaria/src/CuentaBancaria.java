public class CuentaBancaria {
    private String titular;
    private double saldo;
    
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("❌ El monto a depositar debe ser positivo");
            return;
        }
        saldo += monto;
        System.out.println("✅ Depósito exitoso de $" + monto);
        System.out.println("   Saldo actual: $" + saldo);
    }
    
    // Método que lanza excepción personalizada
    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto <= 0) {
            System.out.println("❌ El monto a retirar debe ser positivo");
            return;
        }
        
        if (monto > saldo) {
            // Lanzar excepción personalizada con información detallada
            throw new SaldoInsuficienteException(saldo, monto);
        }
        
        saldo -= monto;
        System.out.println("✅ Retiro exitoso de $" + monto);
        System.out.println("   Saldo actual: $" + saldo);
    }
    
    public void transferir(double monto, CuentaBancaria cuentaDestino) 
            throws SaldoInsuficienteException {
        System.out.println("Iniciando transferencia de $" + monto);
        System.out.println("De: " + this.titular + " → A: " + cuentaDestino.titular);
        
        // Retirar de esta cuenta (puede lanzar excepción)
        this.retirar(monto);
        
        // Depositar en cuenta destino
        cuentaDestino.depositar(monto);
        
        System.out.println("✅ Transferencia completada");
    }
    
    public void mostrarInfo() {
        System.out.println("┌─────────────────────────────────┐");
        System.out.println("│ Titular: " + titular);
        System.out.println("│ Saldo: $" + saldo);
        System.out.println("└─────────────────────────────────┘");
    }
    
    // Getters
    public String getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
}
