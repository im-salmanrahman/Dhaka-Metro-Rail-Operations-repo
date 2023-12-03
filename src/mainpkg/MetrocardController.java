package mainpkg;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class MetrocardController implements Initializable {

    @FXML
    private Label passname;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
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
    
}
