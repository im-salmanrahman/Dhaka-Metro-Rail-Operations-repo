/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author yeasi
 */
public class Staff_maintain_model {
    private String staffIdTextField;
    private String timeTextField;
    private String platformNameTextField;

    public Staff_maintain_model(String staffIdTextField, String timeTextField, String platformNameTextField) {
        this.staffIdTextField = staffIdTextField;
        this.timeTextField = timeTextField;
        this.platformNameTextField = platformNameTextField;
    }

    public String getStaffIdTextField() {
        return staffIdTextField;
    }

    public void setStaffIdTextField(String staffIdTextField) {
        this.staffIdTextField = staffIdTextField;
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
        return "Staff_maintain_model{" + "staffIdTextField=" + staffIdTextField + ", timeTextField=" + timeTextField + ", platformNameTextField=" + platformNameTextField + '}';
    }
    
}
