package org.example.teamproject;

public class Product {

    private String name;
    private double price;
    private String imagePath;
    private int stock;

    public Product(String name, double price, String imagePath, int stock) {
        this.name = name;
        this.price = price;
        this.imagePath = imagePath;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
