public class Main {
    void main(){


        PagoTarjeta pagoTarje = new PagoTarjeta(150.50,"2025-01-07","435353563632636","123");

        PagoTranferencia pagoTransfe = new PagoTranferencia(200.00, "2025-01-07", "3930912021030919393");

        System.out.println("Procesando pagos");

        boolean resultado1 = pagoTarje.procesarPago();

        System.out.println("Resultado:   "+ (resultado1 ? "Existoso" : "Falló"));

        boolean resultado2 = pagoTransfe.procesarPago();

        System.out.println("Resultado:   "+ (resultado2 ? "Existoso" : "Falló"));


        Pago pago1 = new PagoTarjeta(153.50,"2025-01-07","435353563632636","123");
        Pago pago2 =  new PagoTranferencia(250.00, "2025-01-07", "3930912021030919393");

        pago1.procesarPago();

        System.out.println();

        pago2.procesarPago();
    }
}
