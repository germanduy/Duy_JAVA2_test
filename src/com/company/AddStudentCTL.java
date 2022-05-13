package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AddStudentCTL {
    public TextField sEnrolID;
    public TextField sFirstName;
    public TextField sLastName;
    public TextField sAge;


    public void addstudent(ActionEvent actionEvent) throws IOException {
        try{
            String EnrolID = this.sEnrolID.getText();
            String FullName = this.sFirstName.getText()+ " " + this.sLastName.getText();
            String age = this.sAge.getText();
            Student s = new Student(EnrolID,FullName,Integer.valueOf(age));
            Main.StudentList.add(s);
            Parent root = FXMLLoader.load(getClass().getResource("studentlist.fxml"));
            Main.rootStage.setScene(new Scene(root,800,600));
        }catch (Exception e){

        }

    }

    public void Exit(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }

    public void studentlist(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("studentlist.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }
}
