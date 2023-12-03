/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author yeasi
 */
public class MetroModel {
     private int cardNumberTextField;
     private float amountTextField;

    public MetroModel(int cardNumberTextField, float amountTextField) {
        this.cardNumberTextField = cardNumberTextField;
        this.amountTextField = amountTextField;
    }

    public int getCardNumberTextField() {
        return cardNumberTextField;
    }

    public void setCardNumberTextField(int cardNumberTextField) {
        this.cardNumberTextField = cardNumberTextField;
    }

    public float getAmountTextField() {
        return amountTextField;
    }

    public void setAmountTextField(float amountTextField) {
        this.amountTextField = amountTextField;
    }

    @Override
    public String toString() {
        return "MetroModel{" + "cardNumberTextField=" + cardNumberTextField + ", amountTextField=" + amountTextField + '}';
    }

    
}
