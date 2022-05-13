package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentListCTL implements Initializable {
    public TableView<Student> tbView;
    public TableColumn<Student,String> sEnrolID;
    public TableColumn<Student,String> sFullName;
    public TableColumn<Student,String> sAge;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sEnrolID.setCellValueFactory(new PropertyValueFactory<Student,String>("EnrolID"));
        sFullName.setCellValueFactory(new PropertyValueFactory<Student,String>("FullName"));
        sAge.setCellValueFactory(new PropertyValueFactory<Student,String>("age"));
        tbView.setItems(Main.StudentList);
    }

    public void Exit(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }

    public void AddStudent(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("addstudent.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }
}
