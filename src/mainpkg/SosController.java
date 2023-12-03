package mainpkg;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SosController implements Initializable {

    @FXML
    private Label passname;
    @FXML
    private Button backButton;
    @FXML
    private ComboBox<String> stationComboBox;
    @FXML
    private ComboBox<String> platformGateComboBox;
    @FXML
    private RadioButton medicRadioButton;
    @FXML
    private RadioButton policeRadioButton;
    @FXML
    private RadioButton fireServiceRadioButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> stationOptions = FXCollections.observableArrayList("Mohakhali", "Uttara", "Agargaon", "Motijheel", "Shahbag");
        stationComboBox.setItems(stationOptions);

        ObservableList<String> platformGateOptions = FXCollections.observableArrayList("Platform-1", "Platform-2", "Platform-3", "Gate-1", "Gate-2", "Gate-3");
        platformGateComboBox.setItems(platformGateOptions);
    }

    @FXML
    private void handleBackButton(ActionEvent event) {
        try {
            Stage currentStage = (Stage) backButton.getScene().getWindow();
            currentStage.close();

            // Load the new stage (passengerHome.fxml)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("passengerHome.fxml"));
            Parent root = loader.load();

            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.setTitle("Passenger Home");
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleCallButton(ActionEvent event) {
        String selectedStation = stationComboBox.getValue();
        String selectedPlatformGate = platformGateComboBox.getValue();
        String selectedService = getServiceType();

        Sos sosRequest = new Sos(selectedStation, selectedPlatformGate, selectedService);

        saveSosRequest(sosRequest);

        showHelpMessage();
    }

    private void saveSosRequest(Sos sos) {
    try {
        String fileName = "sos_requests/" + passname.getText() + "_SOSRequest.dat";
        File file = new File(fileName);

        File directory = new File(file.getParent());
        if (!directory.exists()) {
            directory.mkdirs();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(sos);
            System.out.println("SOS Request saved successfully.");
        }

    } catch (IOException e) {
        e.printStackTrace();
    }
}

    private void showHelpMessage() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Help is on the way");
        alert.setHeaderText(null);
        alert.setContentText("Emergency services have been notified. Help is on the way.");
        alert.showAndWait();
    }

    private String getServiceType() {
        if (medicRadioButton.isSelected()) {
            return "Medic";
        } else if (policeRadioButton.isSelected()) {
            return "Police";
        } else if (fireServiceRadioButton.isSelected()) {
            return "Fire Service";
        } else {
            return "Unknown";
        }
    }
}
