package com.melocode.projetjava;
import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnexion {
    Connection c;
    String url =  "jdbc:mysql://localhost:3306/gestion_commandes";
    String user = "root";
    String pass = "";

    public DBConnexion(){

    }
    public void connect() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = (Connection)  DriverManager.getConnection(url, user, pass);
            System.out.println("connection established");

        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("connection failed");
        }
    }
}
