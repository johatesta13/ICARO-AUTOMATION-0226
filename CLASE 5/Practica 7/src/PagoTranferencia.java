public class PagoTranferencia extends Pago {
    private String cuentaBancaria;


    public PagoTranferencia(double monto, String fecha,String cuentaBancaria) {
        super(monto, fecha);
        this.cuentaBancaria= cuentaBancaria;

    }


    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    @Override
    public boolean procesarPago() {
        System.out.println("Procesando pago con transferencia bancaria...");
        System.out.println("Monto:  $" + getMonto());
        return true;
    }

}
