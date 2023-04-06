package com.stockify.stockify;

import com.stockify.stockify.models.DB;
import com.stockify.stockify.models.Processes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;


public class LoginController {
    @FXML
    private TextField email;

    @FXML
    private TextField password;

    @FXML
    void login(ActionEvent event) throws SQLException {
        System.out.printf("Email: %s", email.getText());
        try {
            Parent root = FXMLLoader.load(getClass().getResource("dashboard-view.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Stockify");
            stage.setScene(new Scene(root, 1400, 780));
            stage.setResizable(false);
            stage.getIcons().add(new Image(Login.class.getResourceAsStream("images/logo.png")));
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

}