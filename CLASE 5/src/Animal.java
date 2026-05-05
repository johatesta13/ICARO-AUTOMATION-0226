public class Animal {

    protected String nombre;
    protected int edad;

    public Animal(){

    }
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodo a sobrescribir

    public String comunicarse (){
        return "El animal hace un sonido...";
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
