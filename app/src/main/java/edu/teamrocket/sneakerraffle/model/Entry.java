package edu.teamrocket.sneakerraffle.model;


public class Entry {
    private String email;
    private String nombre;
    private Sizes talla;
    private String direccion;
    private String metodoPago;
    private double total;


    public Entry(String email) {
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setSize(Sizes talla) {
        this.talla = talla;
    }

    public Sizes getSize() {
        return this.talla;
    }

    public void setUserName(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void payment(String metodo) {
        this.metodoPago = metodo;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setTotal(double price) {
        this.total = price;
    }

    public double getTotal() {
        return this.total;
    }

    @Override
    public String toString() {
        return "\n\t\temail: " + this.getEmail()
                + "\n\t\tSize: " + this.getSize()
                + "\n\t\tAddress: " + this.getDireccion()
                + "\n\t\tPayment: " + this.getMetodoPago()
                + "\n\t\tTotal: " + this.getTotal() + "$";
    }
    

    


}
