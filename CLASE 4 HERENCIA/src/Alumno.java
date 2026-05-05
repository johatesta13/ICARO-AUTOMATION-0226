import java.util.ArrayList;

public class Alumno extends Persona {

    private String matricula;
    private Integer nota;
    private ArrayList<String> materias;

    //constructor vacio super es la clase padre
    public Alumno(){
        super();
        this.materias= new ArrayList<>();
    }


    //constructor con atributos de la clase padre + los atributos propios
    public Alumno(String nombre,String apellido,String matricula, Integer nota){
        super(nombre,apellido);
        this.matricula= matricula;
        this.nota= nota;
        this.materias= new ArrayList<>();

    }


    public ArrayList<String> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }

    public void agregarMaterias(String materia){
        this.materias.add(materia);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public void saludar (){
        System.out.println("Que onda");
    }
}
