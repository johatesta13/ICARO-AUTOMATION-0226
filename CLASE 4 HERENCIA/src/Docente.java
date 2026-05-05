import java.util.ArrayList;


public class Docente extends Persona {

    private ArrayList<Alumno>alumnos;

    public Docente(String nombre, String apellido){
        super(nombre,apellido);
        this.alumnos = new ArrayList<>();
    }

    // Getters y setters
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    //
    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    @Override
    public void saludar() {
        System.out.println("Hola a todos, bienvenidos");
    }

    //SOBRECARGA 1: calificar a un alumno específico
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
}
