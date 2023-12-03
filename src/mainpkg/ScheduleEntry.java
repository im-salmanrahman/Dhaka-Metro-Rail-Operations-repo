package mainpkg;


import javafx.beans.property.SimpleStringProperty;

public class ScheduleEntry {
    private final SimpleStringProperty arrivalTime;
    private final SimpleStringProperty nextStation;
    private final SimpleStringProperty departureTime;

    public ScheduleEntry(String arrivalTime, String nextStation, String departureTime) {
        this.arrivalTime = new SimpleStringProperty(arrivalTime);
        this.nextStation = new SimpleStringProperty(nextStation);
        this.departureTime = new SimpleStringProperty(departureTime);
    }

    public String getArrivalTime() {
        return arrivalTime.get();
    }

    public String getNextStation() {
        return nextStation.get();
    }

    public String getDepartureTime() {
        return departureTime.get();
    }
}
