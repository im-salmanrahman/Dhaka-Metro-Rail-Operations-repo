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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class TicketController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField ageTextField;
    @FXML
    private ComboBox<String> fromComboBox;
    @FXML
    private ComboBox<String> discountComboBox;
    @FXML
    private ComboBox<String> toComboBox;
    @FXML
    private TableColumn<TicketInformationTableView, String> nameColumn;
    @FXML
    private TableColumn<TicketInformationTableView, Integer> ageColumn;
    @FXML
    private TableColumn<TicketInformationTableView, String> fromColumn;
    @FXML
    private TableColumn<TicketInformationTableView, String> toColumn;
    @FXML
    private TableColumn<TicketInformationTableView, String> dicoutColumn;
    @FXML
    private TableColumn<TicketInformationTableView, Float> amountColumn;
    @FXML
    private ComboBox<String> ticketTypeComboBox;
    @FXML
    private TableView<TicketInformationTableView> TicketInformationTableView;
    @FXML
    private ComboBox<String> amountComboBox;

    /**
     * Initializes the controller class.
     *
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] ticketType = {"Accessibility", "Student", "Senior Citizen", "Tourist", ""};
        ticketTypeComboBox.getItems().addAll(ticketType);

        String[] from = {"Uttara North", "Uttara Center", "Uttara South", "Pallabi", "Mirpur-11", "Mirpur-10", "Kaipara", "Farmgate", "Dhaka University", "Shahbag"};
        fromComboBox.getItems().addAll(from);

        String[] to = {"Uttara North", "Uttara Center", "Uttara South", "Pallabi", "Mirpur-11", "Mirpur-10", "Kaipara", "Farmgate", "Dhaka University", "Shahbag"};
        toComboBox.getItems().addAll(to);

        String[] discount = {"5%", "10 %", "15%", "30%", "50%"};
        discountComboBox.getItems().addAll(discount);
        
        String[] amount = {"20", "30", "50", "60", "80", "90", "100"};
        amountComboBox.getItems().addAll(amount);
    }

    @FXML
    private void confirmButtonOnMoueClicked(ActionEvent event) {
        TicketInformationTableView i = new TicketInformationTableView(
                nameTextField.getText(),
                Integer.parseInt(ageTextField.getText()),
                fromComboBox.getValue(),
                toComboBox.getValue(),
                discountComboBox.getValue(),
                amountComboBox.getValue()
                        );
                
                
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Ticket Info.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream((OutputStream) fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream((OutputStream) fos);
            }

            oos.writeObject(i);
            System.out.println("write object sucessfull ");

        } catch (IOException ex) {
            Logger.getLogger(TicketInformationTableView.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(TicketInformationTableView.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        ObservableList<TicketInformationTableView> venueschedules = FXCollections.observableArrayList();
        
            nameColumn.setCellValueFactory(new PropertyValueFactory<>("nameColumn"));
            ageColumn.setCellValueFactory(new PropertyValueFactory<>("ageColumn"));
            fromColumn.setCellValueFactory(new PropertyValueFactory<>("fromColumn"));
            toColumn.setCellValueFactory(new PropertyValueFactory<>("toColumn"));
            dicoutColumn.setCellValueFactory(new PropertyValueFactory<>("dicoutColumn"));
            amountColumn.setCellValueFactory(new PropertyValueFactory<>("amountColumn"));
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("Ticket Info.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            TicketInformationTableView p;
            try {
                while (true) {
                    p = (TicketInformationTableView) ois.readObject();
                    venueschedules.add(p);
                }
            } catch (IOException | ClassNotFoundException e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }
        }
        TicketInformationTableView.setItems(venueschedules);

        
    }

    @FXML
    private void backButtonOnMouseClicked(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Ticket_seller_dahboard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
}
