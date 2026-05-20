package ar.org.icaro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MatematicaTest {

    /*Test 1: Validar suma de numeros positivos*

    / Escenario : 5 + 3

    Resultado esperado : 8
     */


    @Test

    public void validarSumarDosPositivos (){
        int resultado = Matematica.suma(5,3);
        Assert.assertEquals(resultado,8,"5 + 3 DEBERIA SER 8");
    }



    /*Test 1: Validar suma de elemento neutro*

    / Escenario : 5 + 0

    Resultado esperado : 5
     */

    @Test
    public void validarSumaElementoNeutro(){
        int resultado = Matematica.suma(5,0);
        Assert.assertEquals(resultado,5,"Sumar 0 da como resultado el mismo numero");
    }




}
