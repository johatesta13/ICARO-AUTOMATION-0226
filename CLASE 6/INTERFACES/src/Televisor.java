public class Televisor implements Encendible{

    private String marca;
    private boolean encendido;


    public Televisor(String marca) {
        this.marca = marca;
        this.encendido = false;

    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }


    @Override
    public void encender(){
        this.encendido = true;

        System.out.println("Televisor de: " + marca + "encendida");
    }


    @Override
    public void apagar(){
        this.encendido = false;

        System.out.println("Televisor de: " + marca + "apagada");


    }
}
