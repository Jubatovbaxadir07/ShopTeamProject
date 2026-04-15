package org.example.teamproject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ShopFX extends Application {
//    private void checkout(User user, Cart cart) {
//
//        if (cart.isEmpty()) {
//
//            ShowAlert.show(
//                Alert.AlertType.ERROR,
//                "Cart",
//                "Your cart is empty."
//            );
//
//            return;
//        }
//
//        double total = cart.getTotalPrice();
//
//        if (user.getBalance() < total) {
//
//            ShowAlert.show(
//                Alert.AlertType.ERROR,
//                "Purchase Error",
//                "Not enough money."
//            );
//
//            return;
//        }
//
//        user.setBalance(
//            user.getBalance() - total
//        );
//
//        for (Product p : cart.getItems()) {
//
//            user.getOwnedProducts().add(p);
//
//        }
//
//        cart.clearCart();
//
//        ShowAlert.show(
//            Alert.AlertType.INFORMATION,
//            "Purchase",
//            "Purchase successful!\n\n" +
//                "Total paid: $" + total +
//                "\nRemaining balance: $" +
//                user.getBalance()
//        );
//    }
//    private void showCartWindow(Cart cart, User user) {
//
//        Stage cartStage = new Stage();
//        cartStage.setTitle("Your Cart");
//
//        VBox root = new VBox(10);
//        root.setPadding(new Insets(15));
//
//        TextArea textArea = new TextArea();
//        textArea.setEditable(false);
//        textArea.setPrefRowCount(10);
//
//        StringBuilder cartText = new StringBuilder();
//
//        for (Product p : cart.getItems()) {
//            cartText.append(p.getName())
//                .append(" - $")
//                .append(String.format("%.2f", p.getPrice()))
//                .append("\n");
//        }
//
//        textArea.setText(cartText.toString());
//
//        Label totalLabel = new Label(
//            "Total: $" + String.format("%.2f", cart.getTotalPrice())
//        );
//
//        Button buyButton = new Button("Buy");
//
//        buyButton.setOnAction(e -> {
//            checkout(user, cart);
//
//            textArea.clear();
//            totalLabel.setText("Total: $" + String.format("%.2f", cart.getTotalPrice()));
//        });
//
//        root.getChildren().addAll(textArea, totalLabel, buyButton);
//
//        Scene scene = new Scene(root, 350, 400);
//        cartStage.setScene(scene);
//        cartStage.show();
//    }
    @Override
    public void start(Stage stage) throws Exception {
        User user = new User("Rick", 676767);
        Cart cart = new Cart();
        ShopService shopService = new ShopService();
        TilePane grid = new TilePane();

        grid.setPrefColumns(4);
        grid.setHgap(20);
        grid.setVgap(20);

        Cups p1 = new Cups(
            "Monkeytype T-shirt",
            25,
            "/images/CupBlack.png",
            10,
            5,
            "Black"
        );

        Cups p2 = new Cups(
            "Monkeytype Mug",
            15,
            "/images/CupWhite.png",
            10,
            6,
            "White"
        );

        Cups p3 = new Cups(
            "Monkeytype Mug",
            55,
            "/images/Cup.png",
            10,
            7,
            "Orange"
        );

        Cups p4 = new Cups(
            "Monkeytype Mug",
            15,
            "/images/CupPink.png",
            10,
            3,
            "Pink"
        );

        Shirts p5 = new Shirts(
            "Monkeytype Mug",
            15,
            "/images/Tshirt.png",
            10,
            "L",
            "White"
        );

        Shirts p6 = new Shirts(
            "Monkeytype Mug",
            15,
            "/images/TshirtBlack.png",
            10,
            "L",
            "Black"
        );

        Shirts p7 = new Shirts(
            "Monkeytype Mug",
            15,
            "/images/TshirtPink.png",
            10,
            "XL",
            "Pink"

        );

        Shirts p8 = new Shirts(
            "Monkeytype Mug",
            15,
            "/images/TshirtOrange.png",
            10,
            "M",
            "Orange"
        );

        Product p9 = new Product(
            "Monkeytype Mug",
            15,
            "/images/HoodiePink.png",
            10
        );

        Product p10 = new Product(
            "Monkeytype Mug",
            15,
            "/images/HoodieOrange.png",
            10
        );

        Product p11 = new Product(
            "Monkeytype Mug",
            15,
            "/images/HoodieBlack.png",
            10
        );

        Product p12 = new Product(
            "Monkeytype Mug",
            15,
            "/images/HoodieWhite.png",
            10
        );

        Product p13 = new Product(
            "Monkeytype Mug",
            15,
            "/images/Stickpack.png",
            10
        );

        Product p14 = new Product(
            "Monkeytype Mug",
            15,
            "/images/StickpackBW.png",
            10
        );

        Product p15 = new Product(
            "Monkeytype Mug",
            15,
            "/images/Cup.png",
            10
        );

        Product p16 = new Product(
            "Monkeytype Mug",
            15,
            "/images/Cup.png",
            10
        );

        grid.getChildren().add(
            new ProductCard(p1, cart, shopService, user)
        );

        grid.getChildren().add(
            new ProductCard(p2, cart, shopService, user)
        );

        grid.getChildren().add(
            new ProductCard(p3, cart, shopService, user)
        );

        grid.getChildren().add(
            new ProductCard(p4, cart, shopService, user)
        );

        grid.getChildren().add(
            new ProductCard(p5, cart, shopService, user)
        );

        grid.getChildren().add(
            new ProductCard(p6, cart, shopService, user)
        );

        grid.getChildren().add(
            new ProductCard(p7, cart, shopService, user)
        );

        grid.getChildren().add(
            new ProductCard(p8, cart, shopService, user)
        );

        grid.getChildren().add(
            new ProductCard(p9, cart, shopService, user)
        );

        grid.getChildren().add(
            new ProductCard(p10, cart, shopService, user)
        );

        grid.getChildren().add(
            new ProductCard(p11, cart, shopService, user)
        );

        grid.getChildren().add(
            new ProductCard(p12, cart, shopService, user)
        );

        grid.getChildren().add(
            new ProductCard(p13, cart, shopService, user)
        );

        grid.getChildren().add(
            new ProductCard(p14, cart, shopService, user)
        );

        grid.getChildren().add(
            new ProductCard(p15, cart, shopService, user)
        );

        grid.getChildren().add(
            new ProductCard(p16, cart, shopService, user)
        );


        Button showCartButton = new Button("Show Cart");
        Button myItemsButton = new Button("My Items");

        Showuserall showuserall = new Showuserall();

        myItemsButton.setOnAction(e -> {
            showuserall.showOwnedItemsWindow(user);
        });

        Showall buttonshowall = new Showall();

        showCartButton.setOnAction(e -> {
            buttonshowall.showCartWindow(cart, user);
        });

        HBox buttonHBox = new HBox(10);
        buttonHBox.setAlignment(Pos.CENTER);
        buttonHBox.getChildren().addAll(showCartButton, myItemsButton);
        grid.getChildren().add(buttonHBox);


        grid.setAlignment(Pos.CENTER);

        VBox page = new VBox(20);

        page.setBackground(
            new Background(
                new BackgroundFill(
                    Gradients.gradient1,
                    CornerRadii.EMPTY,
                    Insets.EMPTY
                )
            )
        );

        HBox topBar = new HBox();

        topBar.setPadding(new Insets(10));
        topBar.setSpacing(20);

        topBar.setStyle(
            "-fx-background-color: #F5F5F5;" +
                "-fx-border-color: #DDDDDD;"
        );

        Label balanceLabel = new Label(
            "Balance: $" +
                String.format("%.2f", user.getBalance())
        );

        balanceLabel.setStyle(
            "-fx-font-size: 18px;" +
                "-fx-font-weight: bold;" +
                "-fx-text-fill: #2E7D32;"
        );

        Button reloadButton = new Button("Reload");

        reloadButton.setOnAction(e -> {
            balanceLabel.setText(
                "Balance: $" +
                    String.format("%.2f", user.getBalance())
            );
        });

        topBar.getChildren().addAll(
            balanceLabel,
            reloadButton
        );


        page.getChildren().add(topBar);
        page.getChildren().add(grid);

        ScrollPane scrollPane = new ScrollPane(page);
        scrollPane.setFitToWidth(true);
        scrollPane.setStyle("-fx-background: transparent; -fx-background-color: transparent;");

        Scene scene = new Scene(scrollPane, 900, 300);

        stage.setScene(scene);
        stage.show();

        scrollPane.lookup(".viewport").setStyle("-fx-background-color: transparent;");
    }
}
