package org.example.model;

public class Chocolate extends ProductForSale{

    public String color = "brown";
    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails(){
        System.out.println("Chocolate Info --- Type: " + getType() + " Price: " + getPrice() + " Description: " + getDescription() + " Color: " + color);
    }
}
