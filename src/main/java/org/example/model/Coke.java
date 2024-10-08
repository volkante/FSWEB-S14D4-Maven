package org.example.model;

public class Coke extends ProductForSale{

    private double sugarContent;

    public Coke(String type, double price, String description){
        super(type,price,description);

    }

    @Override
    public String toString() {
        return "Coke{" +
                "sugarContent=" + sugarContent + " type:" + getType() + " price:" + getPrice() + " description:" + getDescription() + "}";
    }

    public void showDetails(){
        String text = toString();
        System.out.println(text);
    }
}
