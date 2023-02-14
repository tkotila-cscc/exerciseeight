package cscc.tkotila;

public class BusinessContactInfo extends ContactInfo {
    private String phoneNumber;

    public BusinessContactInfo(String name, String emailAddress, String phoneNumber) {
        super(name, emailAddress);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " | Email: " + this.getEmailAddress() + " | Phone Number: " + phoneNumber;
    }
}
