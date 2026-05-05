public class NoDocente extends Persona {
    private String sector;

    public NoDocente() {
    }

    public NoDocente(String nombre, String apellido, int edad, String sector) {
        super(nombre, apellido, edad);
        this.sector = sector;
    }

    // Sobrescritura del método saludar
    @Override
    public void saludar() {
        System.out.println("Buen día");
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}