package com.melocode.projetjava;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import java.io.IOException;
public class homepageController {

    @FXML
    private Button home;

    @FXML
    private Button clients;

    @FXML
    private Button produits;

    @FXML
    private Button commandes;

    @FXML
    private Button factures;

    @FXML
    private Button livraisons;

    public void handleClientsButtonClick() {
        clients.setOnAction(event -> {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/client.fxml"));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();

                // Close the login window
                ((Stage) clients.getScene().getWindow()).close();
            } catch (IOException e) {
                e.printStackTrace();
                // En cas d'erreur, afficher une boîte de dialogue
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erreur");
                alert.setHeaderText(null);
                alert.setContentText("Impossible de charger la page client.");
                alert.showAndWait();
            }
        });
    }
    public void handleproduitButtonClick() {
            produits.setOnAction(event -> {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Produit.fxml"));
                    Parent root = loader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.show();

                    // Close the login window
                    ((Stage) produits.getScene().getWindow()).close();
                } catch (IOException e) {
                    e.printStackTrace();
                    // En cas d'erreur, afficher une boîte de dialogue
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Erreur");
                    alert.setHeaderText(null);
                    alert.setContentText("Impossible de charger la page produits.");
                    alert.showAndWait();
                }
            });

    }
}

