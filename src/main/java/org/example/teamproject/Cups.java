package org.example.teamproject;

public class Cups extends Product{
    private int cupRad;
    private String color;

    public Cups(String name, double price, String imagePath, int stock, int cupRad, String color) {
        super(name, price, imagePath, stock);
        this.cupRad = cupRad;
        this.color = color;
    }

    public int getCupRad() {
        return cupRad;
    }

    public String getColor() {
        return color;
    }
}
