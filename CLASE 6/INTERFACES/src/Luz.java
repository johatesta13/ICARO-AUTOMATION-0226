public class Luz implements Encendible{

    private String ubicacion;

    public Luz(String ubicacion) {
        this.ubicacion = ubicacion;
        this.encendida = false;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    private boolean encendida;


    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public void encender(){
        this.encendida = true;

        System.out.println("Luz de: " + ubicacion + "encendida");
    }


    @Override
    public void apagar(){
        this.encendida = false;

        System.out.println("Luz de: " + ubicacion + "apagada");


    }
}
