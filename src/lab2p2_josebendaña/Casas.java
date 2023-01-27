package lab2p2_josebendaña;

import java.awt.Color;

public class Casas {
    private String owner;
    private int numcasa;
    private int numbloque;
    private Color color;
    private int ancho;
    private int largo;
    private int numba;
    private int numcu;
    private String estado;

    public Casas(String owner, int numcasa, int numbloque, Color color, int ancho, int largo, int numba, int numcu, String estado) {
        this.owner = owner;
        this.numcasa = numcasa;
        this.numbloque = numbloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.numba = numba;
        this.numcu = numcu;
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


    public int getNumcasa() {
        return numcasa;
    }

    public void setNumcasa(int numcasa) {
        this.numcasa = numcasa;
    }

    public int getNumbloque() {
        return numbloque;
    }

    public void setNumbloque(int numbloque) {
        this.numbloque = numbloque;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

    public int getNumba() {
        return numba;
    }

    public void setNumba(int numba) {
        this.numba = numba;
    }

    public int getNumcu() {
        return numcu;
    }

    public void setNumcu(int numcu) {
        this.numcu = numcu;
    }

    @Override
    public String toString() {
        return "Casas{" + "owner=" + owner + ", numcasa=" + numcasa + ", numbloque=" + numbloque + ", color=" + color + ", ancho=" + ancho + ", largo=" + largo + ", numba=" + numba + ", numcu=" + numcu + ", estado=" + estado + '}';
    }
    
    
}
