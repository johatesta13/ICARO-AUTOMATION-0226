public class Estudiante extends Persona{

    private  Integer id;
    private String nombreCompleto;
    private Float promedio;


    public Estudiante (){

    }

    public Estudiante (Integer id, String nombreCompleto, Float promedio){

        this.id=id;
        this.nombreCompleto= nombreCompleto;
        this.promedio= promedio;

    }


    private Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getPromedio() {
        return promedio;
    }

    public void setPromedio(Float promedio) {
       if (promedio >= 0 && promedio <=10){
           this.promedio= promedio;
       }else{
           System.out.println("El promedio debe estar entre 0 y 10");
       }
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}
