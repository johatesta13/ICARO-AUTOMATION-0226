package ar.org.icaro;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PruebaUsuarioTest {

    private Usuario usuario;


    @BeforeMethod
    public void setUp(){
        usuario = new Usuario("juan","password123");
    }


    /*Validar que el usuario se pueda loguear correctamente*/

    @Test
    public void LoginExitoso(){
        boolean resultado = usuario.login("password123");
        Assert.assertTrue(resultado,"El login deberia devolver true");
        Assert.assertTrue(usuario.estaLogueado(),"El usuario deberia estar logueado");
    }


    /*Validar que el usuario no se pueda loguear correctamente si ingresa mal la pass*/


    @Test
    public void LoginFallidoContraseniaIncorrecta(){
        boolean resultado = usuario.login("password1234555");
        Assert.assertFalse(resultado,"El login deberia devolver false");
        Assert.assertFalse(usuario.estaLogueado(),"El usuario NO deberia estar logueado");
    }

    /*Validar que usuario recien creado no debe estar logueado*/

    @Test
    public void UsuarioNologueadoInicialmente(){
        Assert.assertFalse(usuario.estaLogueado(),"Usuario recien creado no debe estar logueado");
    }

    /*Verificar que el usuario se pueda desloguear correctamente*/

    @Test
    public void UsuarioHaceLogut(){

        boolean resultado = usuario.login("password123");
        Assert.assertTrue(usuario.estaLogueado(),"El usuario deberia estar logueado");

        usuario.logout();
        Assert.assertFalse(usuario.estaLogueado(),"El usuario debe estar deslogueado");

    }

    /*Verificar que el usuario pueda registrarse correctamente
    * resultado esperado = contraseña de mas de 4 caracteres y campos no nulos*/

    @Test
    public void usuarioconCredencialesValidas(){
       Usuario usuarionuevo = new Usuario("Maria","pass12345");
       Assert.assertTrue(usuarionuevo.esValido(),"Usuario correcto, cumple con las condiciones");
    }


    /*Casos Alternos al registro, contraseña incorrecta, vacia o username vacio*/

    @Test
    public void usuarioconCredencialesInvalidas(){
        Usuario usuarionuevo = new Usuario("Maria","p45");
        Assert.assertFalse(usuarionuevo.esValido(),"Usuario incorrecto, NO cumple con las condiciones");
    }

    @Test
    public void usuarioconUsernameVacio(){
        Usuario usuarionuevo = new Usuario("","p45");
        Assert.assertFalse(usuarionuevo.esValido(),"Usuario incorrecto, NO cumple con las condiciones");
    }

    @Test
    public void usuarioconPassVacia(){
        Usuario usuarionuevo = new Usuario("Maria","");
        Assert.assertFalse(usuarionuevo.esValido(),"Usuario incorrecto, NO cumple con las condiciones");
    }
    /*Validar que devuelva el usuario correcto*/

    @Test
    public void VerificarGetUsername(){
        String username = usuario.getUsername();
        Assert.assertEquals(username,"juan", "El usuario es el que devuelve getUsername()");
    }


}
