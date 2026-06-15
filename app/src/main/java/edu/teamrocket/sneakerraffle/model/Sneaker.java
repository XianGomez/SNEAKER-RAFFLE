package edu.teamrocket.sneakerraffle.model;

import java.util.EnumSet;

public class Sneaker implements Raffle {
    private String nombre;
    private String estilo;
    private double precio;
    private EnumSet<Sizes> listaSizes;


    public Sneaker(String nombre, String estilo, double precio) {
        this.nombre = nombre;
        this.estilo = estilo;
        this.precio = precio;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public double price() {
        return precio;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public void sizesRun(Sizes minSize, Sizes maxSize) {
        EnumSet<Sizes> listaSizes = EnumSet.range(minSize, maxSize);
        this.listaSizes = listaSizes;
    }

    public EnumSet<Sizes> getListaSizes() {
        return listaSizes;
    }

    @Override
    public String toString() {
        return "\n\t\t"+ this.getNombre() + "\n\t\t" + this.getEstilo()
               + "\n\t\t" + this.price()+"$\n\t\t" + this.getListaSizes();
    }
}
