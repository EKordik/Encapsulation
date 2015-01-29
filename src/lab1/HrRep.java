/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;


/**
 *
 * @author ekordik
 */
public class HrRep {
    Employee employee = new Employee();
    
    public void hireEmployee(String firstName, String lastName, String ssn){
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setSSN(ssn);
        employee.setCubeId("C125");
        
        employee.orientate();
    }
    
    public String getStatus(){
      return "The employee's status is: " + employee.getStatus();
    }
      
    
}
