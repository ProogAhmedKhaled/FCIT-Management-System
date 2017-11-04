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
public class Courselab {

    private int labID;
    private String LabName;
    private double hours;

    public int getLabID() {
        return labID;
    }

    public void setLabID(int labID) {
        this.labID = labID;
    }

    public String getLabName() {
        return LabName;
    }

    public void setLabName(String LabName) {
        this.LabName = LabName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Labe Code: " + getLabID() + ", Lab Name: " + getLabName() + ", hours: " + getHours() + "\n";
    }

}
