/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author yeasi
 */
public class Train_operation_model {
    private String trainNameTextField;
    private String timeTextField;
    private String platformNameTextField;

    public Train_operation_model(String trainNameTextField, String timeTextField, String platformNameTextField) {
        this.trainNameTextField = trainNameTextField;
        this.timeTextField = timeTextField;
        this.platformNameTextField = platformNameTextField;
    }

    public String getTrainNameTextField() {
        return trainNameTextField;
    }

    public void setTrainNameTextField(String trainNameTextField) {
        this.trainNameTextField = trainNameTextField;
    }

    public String getTimeTextField() {
        return timeTextField;
    }

    public void setTimeTextField(String timeTextField) {
        this.timeTextField = timeTextField;
    }

    public String getPlatformNameTextField() {
        return platformNameTextField;
    }

    public void setPlatformNameTextField(String platformNameTextField) {
        this.platformNameTextField = platformNameTextField;
    }

    @Override
    public String toString() {
        return "Train_operation_model{" + "trainNameTextField=" + trainNameTextField + ", timeTextField=" + timeTextField + ", platformNameTextField=" + platformNameTextField + '}';
    }
    
}
