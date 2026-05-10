import java.util.ArrayList;
import java.util.List;

public class Main {

    public void main(){


        Luz luzsala = new Luz("Sala");
        Luz luzcocina = new Luz("cocina");

        Ventilador ventiladorDormitorio = new Ventilador("Dormitorio");

        Televisor tvSamsung = new Televisor("Samsung");

        Televisor tvLG = new Televisor("LG");

        //LISTA DE ENCENDIBLES PARA TRABAJAR

        List<Encendible> dispositivos = new ArrayList<>();

        dispositivos.add(luzcocina);
        dispositivos.add(luzsala);
        dispositivos.add(ventiladorDormitorio);
        dispositivos.add(tvSamsung);
        dispositivos.add(tvLG);


        System.out.println("=== ENCENDIENDO TODOS LOS DISPOSITIVOS DE LA LISTA ===");

        for(Encendible dispositivo : dispositivos){
            dispositivo.encender();
        }


        System.out.println();

        System.out.println("=== APAGANDO TODOS LOS DISPOSITIVOS DE LA LISTA ===");

        for(Encendible dispositivo : dispositivos){
            dispositivo.apagar();
        }

        System.out.println("POLIMORFISMO");

        Encendible disposivox = new Luz("Banio");

        disposivox.encender();
        disposivox.apagar();
    }
}
