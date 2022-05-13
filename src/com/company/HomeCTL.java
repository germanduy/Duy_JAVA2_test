package com.company;

import com.company.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class HomeCTL {
    public void addstudent(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("addstudent.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }

    public void studentlist(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("studentlist.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }
}