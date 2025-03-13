package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale chocolate = new Chocolate("bitter", 50, "dubai chocolate");
        ProductForSale coke = new Coke("light", 45, "coca cola zero");
        ProductForSale bread = new Bread("tahıllı", 37, "chia tohumlu ekmek");
        listProducts(new ProductForSale[]{chocolate, coke, bread});
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}