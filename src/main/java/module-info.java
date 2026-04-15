module org.example.teamproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.teamproject to javafx.fxml;
    exports org.example.teamproject;
}