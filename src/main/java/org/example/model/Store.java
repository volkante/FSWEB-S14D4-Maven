package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale chocolate = new Chocolate("milka", 35.5,"bitter");

        //chocolate.showDetails();

        ProductForSale coke = new Coke("pepsi", 20, "tasty");

        //coke.showDetails();

        ProductForSale bread = new Bread("wholeWheat", 12, "fresh");

        //bread.showDetails();



        ProductForSale[] productForSales = {chocolate,coke,bread};

        listProducts(productForSales);
    }

    public static void listProducts(ProductForSale[] products) {
        for(int i=0; i<products.length; i++){
            products[i].showDetails();
        }
    }
}