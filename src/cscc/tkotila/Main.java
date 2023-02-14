package cscc.tkotila;

public class Main {
    public static void main(String[] args) {
        ContactInfo tylerContactInfo = new ContactInfo("Tyler Kotila", "tkotila@student.cscc.edu");
        BusinessContactInfo exampleBusinessContact = new BusinessContactInfo("Mike Smith", "msmith@gmail.com", "6145551800");

        System.out.println(tylerContactInfo);
        System.out.println(exampleBusinessContact);
    }
}
