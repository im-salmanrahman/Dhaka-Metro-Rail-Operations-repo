/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author yeasi
 */
public class Employee {
    private int employeeID;
    private String emailId;
    private String name;

    public Employee(int employeeID, String emailId, String name) {
        this.employeeID = employeeID;
        this.emailId = emailId;
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeID=" + employeeID + ", emailId=" + emailId + ", name=" + name + '}';
    }
    
   
}
