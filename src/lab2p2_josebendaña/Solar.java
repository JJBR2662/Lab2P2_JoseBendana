package lab2p2_josebendaña;

public class Solar {
    private String owner;
    private int ancho;
    private int largo;
    private String estado;

    public Solar(String owner, int ancho, int largo, String estado) {
        this.owner = owner;
        this.ancho = ancho;
        this.largo = largo;
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

    

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Solar{" + "owner=" + owner + ", ancho=" + ancho + ", largo=" + largo + ", estado=" + estado + '}';
    }
    
    
}
