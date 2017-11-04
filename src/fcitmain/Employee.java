/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcitmain;

/**
 *
 * @author AHMED 50070
 */
public class Employee extends Person {

    String jobTitlie;
    int officeNumber;
    Boolean onLeave;

    public String getJobTitlie() {
        return jobTitlie;
    }

    public void setJobTitlie(String jobTitlie) {
        this.jobTitlie = jobTitlie;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public Boolean getOnLeave() {
        return onLeave;
    }

    public void setOnLeave(Boolean onLeave) {
        this.onLeave = onLeave;
    }

    @Override
    public String toString() {

        return " " + "ID: " + getId() + " , Name: " + getName() + " , Nationality: " + getNationality()
                + " , Date of Birth: " + getDateOfBirt() + " , Gender: " + getGender() + " , Phone: " + getPhone()
                + " , Address: " + getAddress() + " , Job Title: " + getJobTitlie() + " , Office Number: " + getOfficeNumber()
                + " , On Leave: " + getOnLeave();

    }

}
