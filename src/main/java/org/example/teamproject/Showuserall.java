package org.example.teamproject;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Showuserall {
    void showOwnedItemsWindow(User user) {

        Stage stage = new Stage();
        stage.setTitle("My Items");

        VBox root = new VBox(10);
        root.setPadding(new Insets(15));

        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setPrefRowCount(10);

        if (user.getOwnedProducts().isEmpty()) {

            textArea.setText("You do not own any items.");

        } else {

            for (Product p : user.getOwnedProducts()) {

                textArea.appendText(
                    p.getName() +
                        " - $" +
                        p.getPrice() +
                        "\n"
                );
            }
        }

        Scene scene = new Scene(root, 350, 400);

        root.getChildren().add(textArea);

        stage.setScene(scene);
        stage.show();
    }
}
