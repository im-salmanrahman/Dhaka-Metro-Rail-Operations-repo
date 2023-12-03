/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author yeasi
 */
public class Train_operationController implements Initializable {

    @FXML
    private TextField trainNameTextField;
    @FXML
    private TextField timeTextField;
    @FXML
    private TextField platformNameTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendToAdminButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void onRadioButton(ActionEvent event) {
    }

    @FXML
    private void offRadioButton(ActionEvent event) {
    }
    
}
