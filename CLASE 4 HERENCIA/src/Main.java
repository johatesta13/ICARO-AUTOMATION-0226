public class Main {

    void main() {

        // Crear alumno
        Alumno alumno1 = new Alumno("Juan", "Perez", "A-2024-001", 8);
        alumno1.agregarMaterias("Matemática");
        alumno1.agregarMaterias("Programación");



        // Crear profesor
        Docente profesor = new Docente("Ana", "Martínez");
        profesor.agregarAlumno(alumno1);

        // Crear no docente
        NoDocente noDocente = new NoDocente("Carlos", "Lopez", "Administración");

        // Mostrar información
        System.out.println("=== ALUMNO ===");
        System.out.println("Nombre: " + alumno1.getNombre() + " " + alumno1.getApellido());
        System.out.println("Matrícula: " + alumno1.getMatricula());
        System.out.println("Materias: " + alumno1.getMaterias());

        System.out.println("\n=== PROFESOR ===");
        System.out.println("Nombre: " + profesor.getNombre() + " " + profesor.getApellido());
        System.out.println("Cantidad de alumnos: " + profesor.getAlumnos().size());

        System.out.println("\n=== NO DOCENTE ===");
        System.out.println("Nombre: " + noDocente.getNombre() + " " + noDocente.getApellido());
        System.out.println("Área: " + noDocente.getArea());
    }

}
