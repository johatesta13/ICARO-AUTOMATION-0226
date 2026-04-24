import java.util.ArrayList;


public class ListasYArrays {

    public  void main(){

        int[] temperaturas = {25,26,33};

        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(5);
        notas.add(9);
        notas.add(10);

        System.out.println("Notas: " + notas);
        System.out.println("Temperatura: " + temperaturas[0]);

        notas.add(9);
        System.out.println("Notas: " + notas);
        notas.remove(2);
        System.out.println("Notas: " + notas);

        int n1= 5;
        int n2= 5;




    }
}
