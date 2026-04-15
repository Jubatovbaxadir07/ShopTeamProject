package org.example.teamproject;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import org.example.teamproject.Product;

import java.util.Objects;

public class ProductCard extends VBox {

    public ProductCard(Product product, Cart cart, ShopService shopService, User user) {

        setSpacing(10);
        setPadding(new Insets(10));

        Image image = new Image(
            Objects.requireNonNull(
                getClass().getResource(product.getImagePath())
            ).toExternalForm()
        );

        ImageView imageView = new ImageView(image);

        imageView.setFitWidth(300);
        imageView.setFitHeight(300);
        imageView.setPreserveRatio(true);

        Rectangle clip = new Rectangle(
            imageView.getFitWidth(),
            imageView.getFitHeight()
        );

        clip.setArcWidth(20);
        clip.setArcHeight(20);

        imageView.setClip(clip);

        Label name = new Label(product.getName());
        name.setFont(Font.font(
            "Arial",
            FontWeight.SEMI_BOLD,
            16
        ));

        name.setTextFill(Color.web("#333333"));

        Label price = new Label("$" + product.getPrice());
        price.setFont(Font.font(
            "Arial",
            FontWeight.BOLD,
            15
        ));

        price.setTextFill(Color.web("#000000"));

        Button buyButton = new Button("Add to cart");
        Button returnButton = new Button("Return");

        buyButton.setStyle("-fx-background-color: #6e7cc8; -fx-text-fill: white;");
        returnButton.setStyle("-fx-background-color: #C62828; -fx-text-fill: white;");

        HBox buttonBox = new HBox(10, buyButton, returnButton);
        buttonBox.setAlignment(Pos.CENTER_LEFT);

        buyButton.setOnAction(e -> {
            shopService.buyProduct(cart, product);
            System.out.println("Stock: " + product.getStock());
        });

        returnButton.setOnAction(e -> {
            shopService.returnProduct(user, product);
            System.out.println("Balance: " + user.getBalance());
            System.out.println("Stock: " + product.getStock());
        });

        getChildren().addAll(
            imageView,
            name,
            price
        );

        if (product instanceof Shirts) {

            Shirts shirt = (Shirts) product;

            Label sizeLabel =
                new Label("Size: " + shirt.getSize());

            Label colorLabel =
                new Label("Color: " + shirt.getColor());

            getChildren().addAll(sizeLabel, colorLabel);
        }

        if (product instanceof Cups) {

            Cups cup = (Cups) product;

            Label sizeLabel =
                new Label("Size: " + cup.getCupRad());

            Label colorLabel =
                new Label("Color: " + cup.getColor());

            getChildren().addAll(sizeLabel, colorLabel);
        }

        getChildren().addAll(buttonBox);

    }
}
