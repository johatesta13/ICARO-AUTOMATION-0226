public class Main {

    void main(){
        Perro max = new Perro("Max", 3);
        Gato michi = new Gato("Michi", 2);

        //Imprimir comunicacion de cada animal

        System.out.println(max.getNombre() + " dice: " + max.comunicarse());
        System.out.println(michi.getNombre() + " dice: " + michi.comunicarse());

        //Polimorfismo

        System.out.println("USANDO POLIMORFISMO");

        Animal animal1 = new Perro("Firulais", 5);
        Animal animal2 = new Gato("Garfield", 5);

        System.out.println(animal1.comunicarse());
        System.out.println(animal2.comunicarse());

    }
}
