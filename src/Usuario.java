import java.util.List;

public class Usuario {
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;

    public Usuario() { }

    private List<Incidente> incidentes;

    protected boolean logIn(){
        return true;
    };

    protected boolean logOut(){
        return true;
    };

    public String getApellido() {
        return apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
