package lab1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private Orientation orientation1 = new Orientation();
    
    public Employee() {
        
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setSSN(String ssn){
        this.ssn = ssn;
    }
    
    public void setCubeId(String cubeId){
        orientation1.setCubeID(cubeId);;
    }
    
    public void orientation(){
        orientation1.orientation();
    }
    
    public String getStatus() {
        return orientation1.getStatus();
    }
}
