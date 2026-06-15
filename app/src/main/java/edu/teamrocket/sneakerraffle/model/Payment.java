package edu.teamrocket.sneakerraffle.model;

public interface Payment {

    boolean autentication(Object payment);

    boolean pay(Object payment, double total);

    String credit(Object payment);

}
