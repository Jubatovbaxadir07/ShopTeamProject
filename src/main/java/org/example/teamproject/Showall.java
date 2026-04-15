package org.example.teamproject;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Showall {
    private void checkout(User user, Cart cart) {

        if (cart.isEmpty()) {

            ShowAlert.show(
                Alert.AlertType.ERROR,
                "Cart",
                "Your cart is empty."
            );

            return;
        }

        double total = cart.getTotalPrice();

        if (user.getBalance() < total) {

            ShowAlert.show(
                Alert.AlertType.ERROR,
                "Purchase Error",
                "Not enough money."
            );

            return;
        }

        user.setBalance(
            user.getBalance() - total
        );

        for (Product p : cart.getItems()) {

            user.getOwnedProducts().add(p);

        }

        cart.clearCart();

        ShowAlert.show(
            Alert.AlertType.INFORMATION,
            "Purchase",
            "Purchase successful!\n\n" +
                "Total paid: $" + total +
                "\nRemaining balance: $" +
                user.getBalance()
        );
    }
    void showCartWindow(Cart cart, User user) {

        Stage cartStage = new Stage();
        cartStage.setTitle("Your Cart");

        VBox root = new VBox(10);
        root.setPadding(new Insets(15));

        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setPrefRowCount(10);

        StringBuilder cartText = new StringBuilder();

        for (Product p : cart.getItems()) {
            cartText.append(p.getName())
                .append(" - $")
                .append(String.format("%.2f", p.getPrice()))
                .append("\n");
        }

        textArea.setText(cartText.toString());

        Label totalLabel = new Label(
            "Total: $" + String.format("%.2f", cart.getTotalPrice())
        );

        Button buyButton = new Button("Buy");

        buyButton.setOnAction(e -> {
            checkout(user, cart);

            textArea.clear();
            totalLabel.setText("Total: $" + String.format("%.2f", cart.getTotalPrice()));
        });

        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> {
            textArea.clear();
            cart.clearCart();
        });
        HBox twoButtons = new HBox(10);
        twoButtons.getChildren().addAll(buyButton, clearButton);

        root.getChildren().addAll(textArea, totalLabel, twoButtons);

        Scene scene = new Scene(root, 350, 400);
        cartStage.setScene(scene);
        cartStage.show();
    }
}
