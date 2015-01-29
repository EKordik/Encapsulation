/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ekordik
 */
public class Orientation {
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date currentDate;
    
    public Orientation() {
        currentDate = new Date();
    }
    
    public void setCubeID(String cubeId){
        this.cubeId = cubeId;
    }
    //Class For the Orientations steps
    public void orientate(){
       meetWithHrForBenefitAndSalryInfo();
       meetDepartmentStaff();
       reviewDeptPolicies();
       moveIntoCubicle(cubeId);        
    }
    
    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() {
        String fmtDate = getDateStamp();
        System.out.println("Met with Hr on " + fmtDate);
        metWithHr = true;
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        if(metWithHr) {
            String fmtDate = getDateStamp();
            System.out.println("Met with Dept. Staff on " + fmtDate);
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        if(metWithHr && metDeptStaff) {
            String fmtDate = getDateStamp();
            System.out.println("Reviewed Dept. Policies on " + fmtDate);
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
            String fmtDate = getDateStamp();
            System.out.println("Moved into cube on " + fmtDate);
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }
    
    private String getDateStamp(){
         SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        return sdf.format(currentDate);
    }

    public String getStatus() {
        String fmtDate = getDateStamp();
        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && movedIn) {
            return "Orientation is completed on: " + fmtDate;
        } else {
            return fmtDate + ": Orientation in progress...";
        }
    }
}
