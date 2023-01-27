package lab2p2_josebendaña;

public class Edificios {
    private int numpisos;
    private int numloc;
    private String direccion;

    public Edificios(int numpisos, int numloc, String direccion) {
        this.numpisos = numpisos;
        this.numloc = numloc;
        this.direccion = direccion;
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
    
    
}
