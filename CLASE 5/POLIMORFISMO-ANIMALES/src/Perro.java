public class Perro extends Animal {

    public Perro (){
        super ();
    }

    public Perro (String nombre, int edad){
        super (nombre,edad);
    }

    @Override

    public String comunicarse (){
        return "Ladrando...";
    }

}
