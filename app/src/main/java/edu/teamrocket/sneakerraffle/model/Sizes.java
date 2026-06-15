package edu.teamrocket.sneakerraffle.model;

public enum Sizes {
    TREINTAYNUEVE(6.5),
    CUARENTA(7.0),
    CUANRENTAYMEDIO(7.5),
    CUARENTAYUNO(8.0),
    CUARENTAYDOS(8.5),
    CUARENTAYDOSYMEDIO(9.0),
    CUARENTAYTRES(9.5);

    private final double talla;

    Sizes(double talla) {
        this.talla = talla;
    }

    public double getTalla() {
        return this.talla;
    }

    
}
