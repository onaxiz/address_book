package ru.petproject.javafx.phonesbook.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ru.petproject.javafx.phonesbook.objects.Person;

import java.awt.*;

public class EditController {

    @FXML
    private TextField txtFIO;

    @FXML
    private TextField txtPhone;

    @FXML
    private Button btnOK;

    @FXML
    private Button btnCancel;

    private Person person;



    public void setPerson(Person person) {
        if (person == null){
            return;
        }
        this.person = person;
        txtFIO.setText(person.getFio());
        txtPhone.setText(person.getPhone());
    }

    public Person getPerson() {
        return person;
    }

    public void actionClose(ActionEvent actionEvent) {
        Node source = (Node) actionEvent.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.hide();
    }


    public void actionSave(ActionEvent actionEvent) {
        person.setFio(txtFIO.getText());
        person.setPhone(txtPhone.getText());
        actionClose(actionEvent);
    }
}