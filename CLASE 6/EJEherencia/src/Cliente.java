public class Cliente {
    // Atributos
    private String nombre;
    private String apellido;
    private int numeroCuenta;
    private double saldo;
    
    // Constructor
    public Cliente(String nombre, String apellido, int numeroCuenta, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // Métodos
    public void depositar(double monto) {
        this.saldo += monto;
        System.out.println("Depósito exitoso. Nuevo saldo: $" + this.saldo);
    }
    
    public void retirar(double monto) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + " " + apellido);
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
    }
}
