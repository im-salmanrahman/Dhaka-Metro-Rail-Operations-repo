package mainpkg;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PassengerHomeController implements Initializable {

    @FXML
    private Label passname;

    @FXML
    private Button logoutButton;

    @FXML
    private Button trainscheduleButton;

    @FXML
    private Button metrocardButton;

    @FXML
    private Button servicenoticeButton;

    @FXML
    private Button feedbackButton;

    @FXML
    private Button sosButton;
    
    @FXML
    private void handleTrainScheduleButton(ActionEvent event) throws IOException {
    Stage currentStage = (Stage) trainscheduleButton.getScene().getWindow();
    currentStage.close();

    FXMLLoader loader = new FXMLLoader(getClass().getResource("trainschedule.fxml"));
    Parent root = loader.load();
    
    Stage newStage = new Stage();
    newStage.setScene(new Scene(root));
    newStage.setTitle("Train Schedule");
    newStage.show();
}
     @FXML
    private void handleMetroCardButton(ActionEvent event) throws IOException {
    Stage currentStage = (Stage) metrocardButton.getScene().getWindow();
    currentStage.close();

    FXMLLoader loader = new FXMLLoader(getClass().getResource("metrocard.fxml"));
    Parent root = loader.load();
    
    Stage newStage = new Stage();
    newStage.setScene(new Scene(root));
    newStage.setTitle("Metro Card");
    newStage.show();
}
     @FXML
    private void handleServiceNoticeButton(ActionEvent event) throws IOException {
    Stage currentStage = (Stage) servicenoticeButton.getScene().getWindow();
    currentStage.close();

    FXMLLoader loader = new FXMLLoader(getClass().getResource("servicenotice.fxml"));
    Parent root = loader.load();
    
    Stage newStage = new Stage();
    newStage.setScene(new Scene(root));
    newStage.setTitle("Service Notice");
    newStage.show();
}
     @FXML
    private void handleFeedbackButton(ActionEvent event) throws IOException {
    Stage currentStage = (Stage) feedbackButton.getScene().getWindow();
    currentStage.close();

    FXMLLoader loader = new FXMLLoader(getClass().getResource("feedback.fxml"));
    Parent root = loader.load();
    
    Stage newStage = new Stage();
    newStage.setScene(new Scene(root));
    newStage.setTitle("Feedback");
    newStage.show();
}
     @FXML
    private void handleSosButton(ActionEvent event) throws IOException {
    Stage currentStage = (Stage) sosButton.getScene().getWindow();
    currentStage.close();

    FXMLLoader loader = new FXMLLoader(getClass().getResource("sos.fxml"));
    Parent root = loader.load();
    
    Stage newStage = new Stage();
    newStage.setScene(new Scene(root));
    newStage.setTitle("SOS");
    newStage.show();
}

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

}
