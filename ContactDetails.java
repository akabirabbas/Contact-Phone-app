/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phone_Application;

public class ContactDetails {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String workPhoneNumber;
    private String company;

    public ContactDetails(String firstName, String lastName, String phoneNumber, String workPhoneNumber, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.workPhoneNumber = workPhoneNumber;
        this.company = company;
    }

    // Getter methods for each field

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public String getCompany() {
        return company;
    }
}

