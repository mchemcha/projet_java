package com.melocode.projetjava;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/hello-view.fxml"));
        Scene scene = new Scene(loader.load());
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/CSS/styles.css")).toExternalForm());

        stage.setScene(scene);
        stage.show();
        DBConnexion db = new DBConnexion();
        db.connect();
    }

    public static void main(String[] args) {
        launch(args);
    }
}