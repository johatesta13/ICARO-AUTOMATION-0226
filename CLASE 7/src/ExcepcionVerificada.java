import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class ExcepcionVerificada {
    
    // OPCIÓN INCORRECTA - No compila
    // Este método NO compila porque IOException es verificada
    /*
    public static void leerArchivoIncorrecto() {
        FileReader file = new FileReader("archivo.txt"); // Error de compilación
    }
    */
    
    // OPCIÓN 1: Manejar con try-catch
    public static void leerArchivoOpcion1(String nombreArchivo) {
        System.out.println("--- Opción 1: Usar try-catch ---");
        try {
            FileReader file = new FileReader(nombreArchivo);
            BufferedReader reader = new BufferedReader(file);
            
            String linea = reader.readLine();
            System.out.println("Primera línea del archivo: " + linea);
            
            reader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    // OPCIÓN 2: Declarar que lanza la excepción
    public static void leerArchivoOpcion2(String nombreArchivo) throws IOException {
        System.out.println("--- Opción 2: Declarar throws ---");
        FileReader file = new FileReader(nombreArchivo);
        BufferedReader reader = new BufferedReader(file);
        
        String linea = reader.readLine();
        System.out.println("✅ Primera línea del archivo: " + linea);
        
        reader.close();
    }
    
    public static void main(String[] args) {
        System.out.println("=== EXCEPCIONES VERIFICADAS (Checked) ===\n");
        
        System.out.println("Las excepciones verificadas son aquellas que el compilador");
        System.out.println("nos OBLIGA a manejar con try-catch o declarar con throws.\n");
        
        // Probando opción 1
        leerArchivoOpcion1("archivo_inexistente.txt");
        
        System.out.println();
        
        // Probando opción 2 (necesita try-catch en main)
        try {
            leerArchivoOpcion2("archivo_inexistente.txt");
        } catch (IOException e) {
            System.out.println("Error propagado al main: " + e.getMessage());
        }
        
        System.out.println();
        
        // Demostración con archivo que SÍ existe
        System.out.println("--- Creando un archivo de prueba ---");
        try {
            java.io.FileWriter writer = new java.io.FileWriter("prueba.txt");
            writer.write("Esta es la primera línea del archivo\n");
            writer.write("Esta es la segunda línea\n");
            writer.close();
            System.out.println("Archivo 'prueba.txt' creado");
            
            System.out.println();
            leerArchivoOpcion1("prueba.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\n✅ Programa finalizado");
    }
}
