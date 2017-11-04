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
public class Teacher extends Employee {

    String degree;
    String department;
    double teachingHours;

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(double teachingHours) {
        this.teachingHours = teachingHours;
    }

    @Override
    public String toString() {

        return  super.toString() + "  degree: " + getDegree() + " , department: " + getDepartment() + " , teachingHours: " + getTeachingHours()+"\n";
    }

}
