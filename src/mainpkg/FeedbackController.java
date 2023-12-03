package mainpkg;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FeedbackController implements Initializable {

    @FXML
    private Label passname;
    @FXML
    private Button backButton;
    @FXML
    private TextArea feedbacktextArea;
    @FXML
    private Button feedbackSubmitButton;
    @FXML
    private Label submitMessage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    private void handleFeedbackSubmitButton(ActionEvent event) {
        try {
            
            String feedbackMessage = feedbacktextArea.getText();

            String passengerName = passname.getText();

            String fileName = "feedback.txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                writer.write("Passenger Name: " + passengerName);
                writer.newLine();
                writer.write("Feedback Message: " + feedbackMessage);
                writer.newLine();
                writer.newLine(); // Add a blank line for separation
            }

            submitMessage.setText("Message recorded successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            submitMessage.setText("Error recording message");
        }
    }
}
