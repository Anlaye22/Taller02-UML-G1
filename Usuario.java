public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    protected ArrayList<Incidente> incidentes;

    public Usuario() {
    }
    
    protected boolean logIn() {
        // implementación momentánea
        return true;
    }

    protected boolean logOut() {
        // implementación momentánea
        return true;
    }
}
