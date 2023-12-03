package mainpkg;

import java.io.Serializable;

public class Sos implements Serializable {

    private String station;
    private String platformGate;
    private String serviceType;

    public Sos(String station, String platformGate, String serviceType) {
        this.station = station;
        this.platformGate = platformGate;
        this.serviceType = serviceType;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getPlatformGate() {
        return platformGate;
    }

    public void setPlatformGate(String platformGate) {
        this.platformGate = platformGate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
