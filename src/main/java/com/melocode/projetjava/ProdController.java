package com.melocode.projetjava;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ProdController {

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
    private Button livraison;

    @FXML
    private TextField num_prod;

    @FXML
    private TextField nom_prod;

    @FXML
    private TextField quan;

    @FXML
    private TextField prix;

    @FXML
    private TableView<?> tabl_prod;

    @FXML
    private TableColumn<?, ?> col_num;

    @FXML
    private TableColumn<?, ?> col_nom;

    @FXML
    private TableColumn<?, ?> col_quant;

    @FXML
    private TableColumn<?, ?> col_prix;

    @FXML
    private Button save;

    @FXML
    private Button ubd;

    @FXML
    private Button delete;

}
