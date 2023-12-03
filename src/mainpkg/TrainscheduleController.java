package mainpkg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class TrainscheduleController implements Initializable {

    @FXML
    private Label passname;
    @FXML
    private Button backButton;
    @FXML
    private ComboBox<String> stationComboBox;
     @FXML
    private TableView<ScheduleEntry> scheduleTable;

   @Override
public void initialize(URL url, ResourceBundle rb) {
    ObservableList<String> stationOptions = FXCollections.observableArrayList("Mohakhali", "Uttara", "Agargaon", "Motijheel", "Shahbag");
    stationComboBox.setItems(stationOptions);

    TableColumn<ScheduleEntry, String> arrivalTimeColumn = new TableColumn<>("Arrival Time");
    arrivalTimeColumn.setCellValueFactory(new PropertyValueFactory<>("arrivalTime"));
    arrivalTimeColumn.setPrefWidth(150); // Set your preferred width

    TableColumn<ScheduleEntry, String> nextStationColumn = new TableColumn<>("Next Station");
    nextStationColumn.setCellValueFactory(new PropertyValueFactory<>("nextStation"));
    nextStationColumn.setPrefWidth(150); // Set your preferred width

    TableColumn<ScheduleEntry, String> departureTimeColumn = new TableColumn<>("Departure Time");
    departureTimeColumn.setCellValueFactory(new PropertyValueFactory<>("departureTime"));
    departureTimeColumn.setPrefWidth(150); // Set your preferred width

    scheduleTable.getColumns().addAll(arrivalTimeColumn, nextStationColumn, departureTimeColumn);
}
   

    @FXML
    private void handleBackButton(ActionEvent event) {
        try {
            Stage currentStage = (Stage) backButton.getScene().getWindow();
            currentStage.close();

            Parent root = FXMLLoader.load(getClass().getResource("passengerHome.fxml"));

            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.setTitle("Passenger Home");
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleStationSelection(ActionEvent event) {
        String selectedStation = stationComboBox.getValue();
        loadSchedule(selectedStation);
    }

     private void loadSchedule(String selectedStation) {
        try (BufferedReader reader = new BufferedReader(new FileReader(selectedStation + "Schedule.txt"))) {
            List<ScheduleEntry> scheduleEntries = new ArrayList<>();
            String line;

            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println("Line: " + line);
                if (parts.length == 3) {
                    scheduleEntries.add(new ScheduleEntry(parts[0], parts[1], parts[2]));
                }
            }

            scheduleTable.getItems().clear();

            scheduleTable.getItems().addAll(scheduleEntries);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
