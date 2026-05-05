public class Alumno extends Persona {
    private Integer nota;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    // Sobrescritura del método saludar
    @Override
    public void saludar() {
        System.out.println("¡Qué onda!");
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
}
