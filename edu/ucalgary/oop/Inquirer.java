// Inquirer Code File


package edu.ucalgary.oop;

public class Inquirer {
    private String FIRST_NAME;
    private String LAST_NAME;
    private String SERVICES_PHONE;
    private String INFO;

    public Inquirer(String FIRST_NAME, String LAST_NAME, String SERVICES_PHONE, String INFO) {
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.SERVICES_PHONE = SERVICES_PHONE;
        this.INFO = INFO;
    }

    public String getFirstName() {
        return FIRST_NAME;
    }

    public String getLastName() {
        return LAST_NAME;
    }

    public String getServicesPhone() {
        return SERVICES_PHONE;
    }

     public String getInfo() {
        return INFO;
    }

}