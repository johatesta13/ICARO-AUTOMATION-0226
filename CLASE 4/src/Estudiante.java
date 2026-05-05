public class Estudiante {

    private int id;
    private String nombreCompleto;
    private double promedio;

    public Estudiante() {
    }

    public Estudiante(int id, String nombreCompleto, double promedio) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.promedio = promedio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}