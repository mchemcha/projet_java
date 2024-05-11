module com.melocode.projetjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens com.melocode.projetjava to javafx.fxml;
    exports com.melocode.projetjava;
}