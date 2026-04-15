package org.example.teamproject;

import org.example.teamproject.Product;

public class Shirts extends Product {

    private String size;
    private String color;

    public Shirts(
        String name,
        double price,
        String imagePath,
        int stock,
        String size,
        String color
    ) {
        super(name, price, imagePath, stock);

        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
