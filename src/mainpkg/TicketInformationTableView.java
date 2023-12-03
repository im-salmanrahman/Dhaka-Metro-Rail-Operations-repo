package mainpkg;

import java.io.Serializable;
import javafx.collections.ObservableList;

public class TicketInformationTableView implements Serializable {

   

     protected String nameColumn;
     protected int ageColumn;
     protected String fromColumn;
     protected String toColumn;
     protected String dicoutColumn;
     protected String amountColumn;

    public TicketInformationTableView(String nameColumn, int ageColumn, String fromColumn, String toColumn, String dicoutColumn, String amountColumn) {
        this.nameColumn = nameColumn;
        this.ageColumn = ageColumn;
        this.fromColumn = fromColumn;
        this.toColumn = toColumn;
        this.dicoutColumn = dicoutColumn;
        this.amountColumn = amountColumn;
    }


    public String getNameColumn() {
        return nameColumn;
    }

    public void setNameColumn(String nameColumn) {
        this.nameColumn = nameColumn;
    }

    public int getAgeColumn() {
        return ageColumn;
    }

    public void setAgeColumn(int ageColumn) {
        this.ageColumn = ageColumn;
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

    public String getDicoutColumn() {
        return dicoutColumn;
    }

    public void setDicoutColumn(String dicoutColumn) {
        this.dicoutColumn = dicoutColumn;
    }

    public String getAmountColumn() {
        return amountColumn;
    }

    public void setAmountColumn(String amountColumn) {
        this.amountColumn = amountColumn;
    }

    @Override
    public String toString() {
        return "TicketInformationTableView{" + "nameColumn=" + nameColumn + ", ageColumn=" + ageColumn + ", fromColumn=" + fromColumn + ", toColumn=" + toColumn + ", dicoutColumn=" + dicoutColumn + ", amountColumn=" + amountColumn + '}';
    }

   
    
}

   