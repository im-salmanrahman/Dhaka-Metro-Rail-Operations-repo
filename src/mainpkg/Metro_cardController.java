/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author yeasi
 */
public class Metro_cardController implements Initializable {

    @FXML
    private TextField cardNumberTextField;
    @FXML
    private ComboBox<String> fromComboBox;
    @FXML
    private ComboBox<String> toComboBox;
    @FXML
    private ComboBox<String> ticketTypeComboBox;
    @FXML
    private TableColumn<Metro_table, Integer> cardNumColumn;
    @FXML
    private TableColumn<Metro_table, String> fromColumn;
    @FXML
    private TableColumn<Metro_table, String> toColumn;
    @FXML
    private TableColumn<Metro_table, Float> amountColumn;
    @FXML
    private TextField amountTextField;
    @FXML
    private TableView<Metro_table> metroCardTable;
    @FXML
    private TableColumn<Metro_table, String> ticketTypeColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] ticketType = {"Accessibility", "Student", "Senior Citizen", "Tourist", ""};
        ticketTypeComboBox.getItems().addAll(ticketType);

        String[] from = {"Uttara North", "Uttara Center", "Uttara South", "Pallabi", "Mirpur-11", "Mirpur-10", "Kaipara", "Farmgate", "Dhaka University", "Shahbag"};
        fromComboBox.getItems().addAll(from);

        String[] to = {"Uttara North", "Uttara Center", "Uttara South", "Pallabi", "Mirpur-11", "Mirpur-10", "Kaipara", "Farmgate", "Dhaka University", "Shahbag"};
        toComboBox.getItems().addAll(to);

//        cardNumColumn.setCellValueFactory(new PropertyValueFactory<>("cardNumColumn"));
//        fromColumn.setCellValueFactory(new PropertyValueFactory<>("fromColumn"));
//        toColumn.setCellValueFactory(new PropertyValueFactory<>("toColumn"));
//        ticketTypeColumn.setCellValueFactory(new PropertyValueFactory<>("ticketTypeColumn"));
//        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amountColumn"));
    }

    @FXML
    private void confirmButtonOnMouseClicked(ActionEvent event) {
        Metro_table i = new Metro_table(
                Integer.parseInt(cardNumberTextField.getText()),
                fromComboBox.getValue(),
                toComboBox.getValue(),
                ticketTypeComboBox.getValue(),
                Integer.parseInt(amountTextField.getText()));
        

        ObservableList<Metro_table> metroarr = FXCollections.observableArrayList();
        
        cardNumColumn.setCellValueFactory(new PropertyValueFactory<>("cardNumColumn"));
        fromColumn.setCellValueFactory(new PropertyValueFactory<>("fromColumn"));
        toColumn.setCellValueFactory(new PropertyValueFactory<>("toColumn"));
        ticketTypeColumn.setCellValueFactory(new PropertyValueFactory<>("ticketTypeColumn"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amountColumn"));
        metroarr.add(i);
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//        File f = null;
//        try {
//            f = new File("MetroCard Info.bin");
//            if (f.exists()) {
//                fos = new FileOutputStream(f, true);
//                oos = new AppendableObjectOutputStream((OutputStream) fos);
//            } else {
//                fos = new FileOutputStream(f);
//                oos = new ObjectOutputStream((OutputStream) fos);
//            }
//
//            oos.writeObject(i);
//            System.out.println("write object sucessfull ");
//            System.out.println(i);
//
//        } catch (IOException ex) {
//            Logger.getLogger(Metro_table.class
//                    .getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                if (oos != null) {
//                    oos.close();
//
//                }
//            } catch (IOException ex) {
//                Logger.getLogger(Metro_table.class
//                        .getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//
//        ObservableList<Metro_table> metroarr = FXCollections.observableArrayList();
//
//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//
//        try {
//            f = new File("MetroCard Info.bin.bin");
//            fis = new FileInputStream(f);
//            ois = new ObjectInputStream(fis);
//            Metro_table p;
//            try {
//                while (true) {
//                    p = (Metro_table) ois.readObject();
//                    metroarr.add(p);
//                }
//            } catch (IOException | ClassNotFoundException e) {
//            }
//        } catch (IOException ex) {
//        } finally {
//            try {
//                if (ois != null) {
//                    ois.close();
//                }
//            } catch (IOException ex) {
//            }
//        }
        metroCardTable.setItems(metroarr);
        System.out.println(metroarr);

    }

    @FXML
    private void backButtonOnMouseClicked(ActionEvent event) {
    }

}
