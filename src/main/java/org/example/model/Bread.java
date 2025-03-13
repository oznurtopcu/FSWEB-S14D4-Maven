package org.example.model;

public class Bread extends ProductForSale{

    public String color = "ekmek";
    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails(){
        System.out.println("Product Info --- Type: " + getType() + " Price: " + getPrice() + " Description: " + getDescription() + " Color: " + color);
    }
}
