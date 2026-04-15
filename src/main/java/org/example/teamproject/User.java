package org.example.teamproject;

import org.example.teamproject.Product;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private double balance;
    private List<Product> ownedProducts = new ArrayList<>();

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Product> getOwnedProducts() {
        return ownedProducts;
    }
}
