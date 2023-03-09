package cscc.tkotila;

import java.util.ArrayList;

public class ContactCollection {
    private ArrayList<ContactInfo> contactList;

    public ContactCollection() {
        this.contactList = new ArrayList<>();
    }

    public void addContact(ContactInfo contactInfo) {
        contactList.add(contactInfo);
    }

    public void listContacts() {
        for (ContactInfo contactInfo: contactList) {
            System.out.println(contactInfo);
        }
    }
}
