package userPackage;

public class User {
    private int id;
    private  String name;
    private  String email;

    private Address address;
    private  String mobileNo;

    public User() {}

    public User(int id, String name, String email, Address address, String mobileNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.mobileNo = mobileNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", name:'" + name + '\'' +
                ", email:'" + email + '\'' +
                ", address:" + address +
                ", mobileNo:'" + mobileNo + '\'' +
                '}';
    }
}
