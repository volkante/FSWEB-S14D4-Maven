package org.example.model;

public class Chocolate extends ProductForSale{

    private double discountRate;

    public Chocolate(String type, double price, String description){
        super(type,price,description);

    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "discountRate=" + discountRate + " type:" + getType() + " price:" + getPrice() + " description:" + getDescription() + "}";
    }

    public void showDetails(){
        String text = toString();
        System.out.println(text);
    }
}
