public abstract class Pago {

    protected double monto;
    protected String fecha;

    public Pago (double monto, String fecha){
        this.monto = monto;
        this.fecha = fecha;
    }

    //Metodo abstracto

    public abstract boolean procesarPago();


    public double getMonto() {
        return monto;
    }

    public String getFecha() {
        return fecha;
    }
}
