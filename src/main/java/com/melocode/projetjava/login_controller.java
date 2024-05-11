package com.melocode.projetjava;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class login_controller implements Initializable {
    public TextField tNom;
    public PasswordField tPrenon;
    public Button btnCon;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnCon.setOnAction(event -> {
            String username = tNom.getText().trim();
            String password = tPrenon.getText().trim();

            if (username.equals("maryem") && password.equals("maryem123")) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/homepage.fxml"));
                    Parent root = loader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.show();

                    // Close the login window
                    ((Stage) btnCon.getScene().getWindow()).close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information");
                alert.setHeaderText(null);
                alert.setContentText("Invalide username or password");
                alert.showAndWait();
            }
        });
    }
}