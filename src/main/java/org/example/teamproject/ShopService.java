package org.example.teamproject;

import javafx.scene.control.Alert;
import org.example.teamproject.Product;
import org.example.teamproject.User;

public class ShopService {

    public boolean buyProduct(Cart cart, Product product) {
        if (product.getStock() <= 0) {
            System.out.println("Product is out of stock.");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Purchase Error");
            alert.setHeaderText(null);
            alert.setContentText(
                "Product is out of stock.\n\n" +
                    "Item: " + product.getName() + "\n" +
                    "Please try again later."
            );
            alert.showAndWait();
            return false;
        }

        cart.addProduct(product);
        product.setStock(product.getStock() - 1);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Purchase");
        alert.setHeaderText(null);
        alert.setContentText("You added to cart:\n" +
            product.getName());
        alert.showAndWait();

        System.out.println("Purchase successful.");
        return true;
    }

    public boolean returnProduct(User user, Product product) {
        if (!user.getOwnedProducts().contains(product)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Return Error");
            alert.setHeaderText(null);
            alert.setContentText(
                "You do not own this product.\n\n" +
                    "Item: " + product.getName()
            );
            alert.showAndWait();
            System.out.println("User does not own this product.");
            return false;
        }

        user.getOwnedProducts().remove(product);
        user.setBalance(user.getBalance() + product.getPrice());
        product.setStock(product.getStock() + 1);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Return");
        alert.setHeaderText(null);
        alert.setContentText(
            "Product returned successfully!\n\n" +
                "Item: " + product.getName() + "\n\n" +
                "Refund: $" + product.getPrice() + "\n" +
                "New balance: $" +
                String.format("%.2f", user.getBalance())
        );
        alert.showAndWait();

        System.out.println("Return successful.");
        return true;
    }
}
