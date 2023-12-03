/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;
import javafx.collections.ObservableList;

/**
 *
 * @author yeasi
 */
public class Metro_table implements Serializable {

    static void setItems(ObservableList<Metro_table> venueschedules) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    protected int cardNumColumn;
     protected String fromColumn;
     protected String toColumn;
     protected String ticketTypeColumn;
     protected float amountColumn;

    public Metro_table(int cardNumColumn, String fromColumn, String toColumn, String ticketTypeColumn, float amountColumn) {
        this.cardNumColumn = cardNumColumn;
        this.fromColumn = fromColumn;
        this.toColumn = toColumn;
        this.ticketTypeColumn = ticketTypeColumn;
        this.amountColumn = amountColumn;
    }

    public int getCardNumColumn() {
        return cardNumColumn;
    }

    public void setCardNumColumn(int cardNumColumn) {
        this.cardNumColumn = cardNumColumn;
    }

    public String getFromColumn() {
        return fromColumn;
    }

    public void setFromColumn(String fromColumn) {
        this.fromColumn = fromColumn;
    }

    public String getToColumn() {
        return toColumn;
    }

    public void setToColumn(String toColumn) {
        this.toColumn = toColumn;
    }

    public String getTicketTypeColumn() {
        return ticketTypeColumn;
    }

    public void setTicketTypeColumn(String ticketTypeColumn) {
        this.ticketTypeColumn = ticketTypeColumn;
    }

    public float getAmountColumn() {
        return amountColumn;
    }

    public void setAmountColumn(float amountColumn) {
        this.amountColumn = amountColumn;
    }

    @Override
    public String toString() {
        return "Metro_table{" + "cardNumColumn=" + cardNumColumn + ", fromColumn=" + fromColumn + ", toColumn=" + toColumn + ", ticketTypeColumn=" + ticketTypeColumn + ", amountColumn=" + amountColumn + '}';
    }
     
}
