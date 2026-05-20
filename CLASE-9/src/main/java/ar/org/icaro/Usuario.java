package ar.org.icaro;

public class Usuario {

    private String username;
    private String password;
    private boolean estaLogueado;


    public Usuario() {
    }

    public Usuario(String username, String password) {
        this.username =  username;
        this.password = password;
        this.estaLogueado = false;
    }

    public boolean login(String passwordIngresado){
        if(this.password.equals(passwordIngresado)){
            this.estaLogueado=true;
            return true;
        }

        return false;
    }

    public void logout(){
        estaLogueado = false;
    }

    public boolean esValido(){
        return  username !=null && !username.isEmpty() && password !=null && password.length()>=4;
    }

    public boolean estaLogueado (){
        return this.estaLogueado;
    }


    public String getUsername() {
        return username;
    }
}
