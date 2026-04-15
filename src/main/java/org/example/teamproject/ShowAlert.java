package org.example.teamproject;

import javafx.scene.control.Alert;

public class ShowAlert {

    public static void show(
        Alert.AlertType type,
        String title,
        String message
    ) {

        Alert alert = new Alert(type);

        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.showAndWait();
    }

}
