public class Ventilador implements Encendible{

    private String ubicacion;

    public Ventilador(String ubicacion) {
        this.ubicacion = ubicacion;
        this.encendido = false;
    }

    public boolean isEncendida() {
        return encendido;
    }

    public void setEncendida(boolean encendida) {
        this.encendido = encendida;
    }

    private boolean encendido;


    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public void encender(){
        this.encendido = true;

        System.out.println("Ventilaador de: " + ubicacion + "encendida");
    }


    @Override
    public void apagar(){
        this.encendido = false;

        System.out.println("Ventilador de: " + ubicacion + "apagada");


    }




}
