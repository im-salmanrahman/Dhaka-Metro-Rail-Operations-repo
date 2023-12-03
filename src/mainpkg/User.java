/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author yeasi
 */
public class User extends Employee {
    private int cardNumber;
    private String trainName;
    private int driverId;

    public User(int cardNumber, String trainName, int driverId, int employeeID, String emailId, String name) {
        super(employeeID, emailId, name);
        this.cardNumber = cardNumber;
        this.trainName = trainName;
        this.driverId = driverId;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    @Override
    public String toString() {
        return "User{" + "cardNumber=" + cardNumber + ", trainName=" + trainName + ", driverId=" + driverId + '}';
    }
    
    
    
}
