package lab2p2_josebendaña;

public class Usuarios {
    private String nombre;
    private int edad;
    private String user;
    private String clave;

    public Usuarios(String nombre, int edad, String user, String clave) {
        this.nombre = nombre;
        this.edad = edad;
        this.user = user;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
