package edu.teamrocket.sneakerraffle.model;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Sneaker implements Raffle {
    private String nombre;
    private String estilo;
    private double precio;
    private EnumSet<Sizes> listaSizes;
    private List<Entry> listaEntries = new ArrayList<>();

    

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
    public void register(Entry entry) {
        if (!listaEntries.contains(entry)) {
            listaEntries.add(entry);
        }
    }

    @Override
    public void register(Entry entry, Entry entry2, Entry entry3) {
        register(entry);

    }

    public List<String> listEntries() {
        List<String> listaCorreos = new ArrayList<>();
        for (Entry e : listaEntries) {
            listaCorreos.add(e.getEmail());
        }

        return listaCorreos;
    }

    public int totalEntries() {
        return listaEntries.size();
    }

    @Override
    public List<String> cancel(Entry entry) {
        List<String> listaCancelaciones = new ArrayList<>();
        listaCancelaciones.add(entry.getEmail());
        listaEntries.remove(entry);
        return listaCancelaciones;
    }

    @Override
    public String toString() {
        return "\n\t\t"+ this.getNombre() + "\n\t\t" + this.getEstilo()
               + "\n\t\t" + this.price()+"$\n\t\t" + this.getListaSizes();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((estilo == null) ? 0 : estilo.hashCode());
        long temp;
        temp = Double.doubleToLongBits(precio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((listaSizes == null) ? 0 : listaSizes.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Sneaker other = (Sneaker) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (estilo == null) {
            if (other.estilo != null)
                return false;
        } else if (!estilo.equals(other.estilo))
            return false;
        if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
            return false;
        if (listaSizes == null) {
            if (other.listaSizes != null)
                return false;
        } else if (!listaSizes.equals(other.listaSizes))
            return false;
        return true;
    }
}
