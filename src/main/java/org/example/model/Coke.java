package org.example.model;

public class Coke extends ProductForSale{

    public String color = "black";
    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails(){
        System.out.println("Coke Info --- Type: " + getType() + " Price: " + getPrice() + " Description: " + getDescription() + " Color: " + color);
    }
}
