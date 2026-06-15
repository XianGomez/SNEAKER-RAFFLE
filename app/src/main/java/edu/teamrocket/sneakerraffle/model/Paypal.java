package edu.teamrocket.sneakerraffle.model;

public class Paypal implements Payment{

    @Override
    public boolean autentication(Object payment) {
        for (Entry e : Sneaker.getListaEntries()) {
            if (e.getPayment() != payment) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean pay(Object payment, double total) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pay'");
    }

    @Override
    public String credit(Object payment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'credit'");
    }

}
