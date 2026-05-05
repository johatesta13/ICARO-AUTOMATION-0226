import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    private String materia;
    private List<Alumno> alumnos;

    public Profesor() {
        this.alumnos = new ArrayList<>();
    }

    public Profesor(String nombre, String apellido, int edad, String materia) {
        super(nombre, apellido, edad);
        this.materia = materia;
        this.alumnos = new ArrayList<>();
    }

    // Sobrescritura del método saludar
    @Override
    public void saludar() {
        System.out.println("Hola a todos, bienvenidos");
    }

    // SOBRECARGA 1: calificar a un alumno específico
    public void calificar(Alumno alumno, Integer nota) {
        alumno.setNota(nota);
        System.out.println("El alumno " + alumno.getNombre() + " " +
                alumno.getApellido() + " fue calificado con: " + nota);
    }

    // SOBRECARGA 2: calificar a todos los alumnos con la misma nota
    public void calificar(Integer nota) {
        for (Alumno alumno : alumnos) {
            alumno.setNota(nota);
        }
        System.out.println("Todos los alumnos fueron calificados con: " + nota);
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
