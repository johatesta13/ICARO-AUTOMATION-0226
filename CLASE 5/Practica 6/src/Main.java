

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
                // Crear objetos
                Alumno alumno1 = new Alumno("Juan", "Pérez", 20);
                Alumno alumno2 = new Alumno("María", "González", 22);
                Profesor profesor = new Profesor("Carlos", "Rodríguez", 35, "Programación");
                NoDocente noDocente = new NoDocente("Ana", "Martínez", 28, "Administración");

                // PARTE 1: Demostración de Sobrescritura con Polimorfismo
                System.out.println("=== SOBRESCRITURA (OVERRIDE) ===");
                System.out.println("\nCreando lista polimórfica de Personas:");

                List<Persona> personas = new ArrayList<>();
                personas.add(alumno1);
                personas.add(alumno2);
                personas.add(profesor);
                personas.add(noDocente);

                System.out.println("\nCada persona saluda a su manera:");
                for (Persona persona : personas) {
                        System.out.print(persona.getNombre() + " dice: ");
                        persona.saludar(); // Polimorfismo en acción
                }

                // PARTE 2: Demostración de Sobrecarga
                System.out.println("\n=== SOBRECARGA (OVERLOAD) ===");

                // Agregar alumnos al profesor
                profesor.agregarAlumno(alumno1);
                profesor.agregarAlumno(alumno2);

                System.out.println("\nCalificando a un alumno específico:");
                profesor.calificar(alumno1, 9); // Sobrecarga 1

                System.out.println("\nCalificando a todos los alumnos con la misma nota:");
                profesor.calificar(8); // Sobrecarga 2

                System.out.println("\nVerificando notas:");
                System.out.println(alumno1.getNombre() + ": " + alumno1.getNota());
                System.out.println(alumno2.getNombre() + ": " + alumno2.getNota());
        }
}