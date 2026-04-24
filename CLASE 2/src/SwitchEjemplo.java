import java.util.Scanner;

public class SwitchEjemplo {

    public  void main(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de talle 1 o 2");
        int size = teclado.nextInt();

        switch (size) {

            case 1:
                System.out.println("Talle s");
                break;


            case 2:
                System.out.println("Talle m");
                break;

            default:
                System.out.println("Intente nuevamente");
        }

    }
}
