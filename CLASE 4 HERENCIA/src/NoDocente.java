public class NoDocente extends Persona{

    private String area;

    // Constructor vacío
    public NoDocente() {
        super();
    }

    // Constructor completo
    public NoDocente(String nombre, String apellido, String area) {
        super(nombre, apellido);
        this.area = area;
    }

    // Getters y setters
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    @Override
    public void saludar() {
        System.out.println("Buen día");
    }
}

