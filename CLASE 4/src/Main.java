public class Main {


    void main (){


        Estudiante estudianteMaria= new Estudiante (1001,"Maria Gonzales",9.0f);


        System.out.println("ID: "  + estudianteMaria.getId());
        // no se puede acceder sin getter System.out.println("ID: "  + estudianteMaria.id());
        System.out.println("Nombre: "  + estudianteMaria.getNombreCompleto());
        System.out.println("Promedio: "  + estudianteMaria.getPromedio());



        estudianteMaria.setPromedio(9.5f);
        System.out.println("Promedio Modificado: "  + estudianteMaria.getPromedio());



    }

}