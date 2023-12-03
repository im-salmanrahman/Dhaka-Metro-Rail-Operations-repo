package mainpkg;

public class Notice {
    private String date;
    private String station;
    private String notice;

    public Notice(String date, String station, String notice) {
        this.date = date;
        this.station = station;
        this.notice = notice;
    }

    public String getDate() {
        return date;
    }

    public String getStation() {
        return station;
    }

    public String getNotice() {
        return notice;
    }
}
