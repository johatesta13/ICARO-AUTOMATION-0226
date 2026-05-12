public class Persona {
    private String nombre;
    private int edad;
    
    // Constructor que valida la edad
    public Persona(String nombre, int edad) throws EdadInvalidaException {
        this.nombre = nombre;
        setEdad(edad); // Usa el setter para validar
    }
    
    // Método que valida y asigna la edad
    public void setEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException(
                "La edad no puede ser negativa. Valor recibido: " + edad
            );
        }
        if (edad > 120) {
            throw new EdadInvalidaException(
                "La edad no puede ser mayor a 120 años. Valor recibido: " + edad
            );
        }
        this.edad = edad;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }
}
