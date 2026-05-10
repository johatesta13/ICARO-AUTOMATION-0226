public class ClienteVIP extends Cliente {
    // Atributo adicional para clientes VIP
    private double limiteCredito;
    
    // Constructor
    public ClienteVIP(String nombre, String apellido, int numeroCuenta, double saldo, double limiteCredito) {
        // Llama al constructor de la clase padre (Cliente)
        super(nombre, apellido, numeroCuenta, saldo);
        this.limiteCredito = limiteCredito;
    }
    
    // Getter y Setter para límite de crédito
    public double getLimiteCredito() {
        return limiteCredito;
    }
    
    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    // Sobreescritura del método retirar para permitir crédito
    @Override
    public void retirar(double monto) {
        double saldoTotal = getSaldo() + limiteCredito;
        
        if (monto <= saldoTotal) {
            setSaldo(getSaldo() - monto);
            System.out.println("✅ Retiro VIP exitoso. Nuevo saldo: $" + getSaldo());
        } else {
            System.out.println("❌ Monto excede el saldo disponible + límite de crédito");
        }
    }
    
    // Sobreescritura del método mostrarInfo para incluir límite de crédito
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método de la clase padre
        System.out.println("⭐ Cliente VIP");
        System.out.println("Límite de crédito: $" + limiteCredito);
        System.out.println("Saldo disponible total: $" + (getSaldo() + limiteCredito));
    }
}
