package com.melocode.projetjava;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Client_controller {

    @FXML
    private TableView<Client> table;

    @FXML
    private TableColumn<Client, String> colNumeroClient;

    @FXML
    private TableColumn<Client, String> colNumeroCommande;

    @FXML
    private TableColumn<Client, String> colNom;

    @FXML
    private TableColumn<Client, String> colPrenom;

    @FXML
    private TableColumn<Client, String> colAdresse;

    @FXML
    private TableColumn<Client, String> colTelephone;

    public void initialize() {
        // Initialize table columns with appropriate cell value factories
        colNumeroClient.setCellValueFactory(data -> data.getValue().numeroClientProperty());
        colNumeroCommande.setCellValueFactory(data -> data.getValue().numeroCommandeProperty());
        colNom.setCellValueFactory(data -> data.getValue().nomProperty());
        colPrenom.setCellValueFactory(data -> data.getValue().prenomProperty());
        colAdresse.setCellValueFactory(data -> data.getValue().adresseProperty());
        colTelephone.setCellValueFactory(data -> data.getValue().telephoneProperty());

        // Call method to populate table with data from database
        populateTable();
    }
    private void populateTable() {
        // Establish database connection
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_commandes", "root", "");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM your_table_name")) {

            // Clear existing data from table
            table.getItems().clear();

            // Populate table with data from ResultSet
            while (rs.next()) {
                table.getItems().add(new Client(
                        rs.getString("numero_client"),
                        rs.getString("numero_commande"),
                        rs.getString("nom"),
                        rs.getString("prenom"),
                        rs.getString("adresse"),
                        rs.getString("telephone")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
