public class PagoTarjeta  extends  Pago{

    private String numeroTarjeta;
    private String cvv;

    public PagoTarjeta(double monto, String fecha, String numeroTarjeta, String cvv) {
        super(monto, fecha);
        this.numeroTarjeta= numeroTarjeta;
        this.cvv=cvv;
    }

    @Override
    public boolean procesarPago(){

        System.out.println("Procesando pago con tarjeta...");
        System.out.println("Monto:  $" + getMonto());
        return true;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getCvv() {
        return cvv;
    }
}
