package userPackage;

public class Address {
    private String plotNo;
    private String street;
    private String city;
    private String state;

    public Address(String plotNo, String street, String city, String state) {
        this.plotNo = plotNo;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "{" +
                "plotNo:'" + plotNo + '\'' +
                ", street:'" + street + '\'' +
                ", city:'" + city + '\'' +
                ", state:'" + state + '\'' +
                '}';
    }
}
