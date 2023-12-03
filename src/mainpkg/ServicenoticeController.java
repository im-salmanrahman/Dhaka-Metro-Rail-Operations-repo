package mainpkg;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ServicenoticeController implements Initializable {

    @FXML
    private Label passname;
    @FXML
    private Button backButton;
    @FXML
    private TableView<Notice> noticeTable;
    @FXML
    private TableColumn<Notice, String> dateColumn;
    @FXML
    private TableColumn<Notice, String> stationColumn;
    @FXML
    private TableColumn<Notice, String> noticeColumn;

    private ObservableList<Notice> notices = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize table columns
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        stationColumn.setCellValueFactory(new PropertyValueFactory<>("station"));
        noticeColumn.setCellValueFactory(new PropertyValueFactory<>("notice"));

        loadNoticesForStation("Mohakhali");
        loadNoticesForStation("Uttara");
        loadNoticesForStation("Agargaon");
        loadNoticesForStation("Motijheel");
        loadNoticesForStation("Shahbag");
        noticeTable.setItems(notices);
    }

    @FXML
    private void handleBackButton(ActionEvent event) {
        try {
            Stage currentStage = (Stage) backButton.getScene().getWindow();
            currentStage.close();

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

    private void loadNoticesForStation(String station) {
        try (BufferedReader reader = new BufferedReader(new FileReader(station + ".txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String date = parts[0].trim();
                    String notice = parts[1].trim();
                    notices.add(new Notice(date, station, notice));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
