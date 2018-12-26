package EmailApp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;

    //constructor to receive the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        Logger logger = Logger.getLogger("emailAppLogger");
        logger.log(Level.FINE, "Created new Email for " + firstName + " " + lastName);
    }
    //Ask or set the department

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //Generate random password

    //set mailBox capacity

    //set an alternate email

    //change the password

}
