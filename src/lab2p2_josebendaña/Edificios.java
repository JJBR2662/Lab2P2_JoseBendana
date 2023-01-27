package lab2p2_josebendaña;

public class Edificios {
    private String owner;
    private int numpisos;
    private int numloc;
    private String direccion;
    private String estado;

    public Edificios(String owner, int numpisos, int numloc, String direccion, String estado) {
        this.owner = owner;
        this.numpisos = numpisos;
        this.numloc = numloc;
        this.direccion = direccion;
        this.estado = estado;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

    public int getNumpisos() {
        return numpisos;
    }

    public void setNumpisos(int numpisos) {
        this.numpisos = numpisos;
    }

    public int getNumloc() {
        return numloc;
    }

    public void setNumloc(int numloc) {
        this.numloc = numloc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Edificios{" + "owner=" + owner + ", numpisos=" + numpisos + ", numloc=" + numloc + ", direccion=" + direccion + ", estado=" + estado + '}';
    }
    
    
}
